package ticTacToe;

import exercise1.PC;

import java.util.Random;

public class TicTacToeLogic {

    public interface TicTacToeProtocol {
        void turn(TILE[][] map);
        void win(TILE winner);
        void tie();
    }

    private static final int[] WINS = new int[]{
            0b111000000,
            0b000111000,
            0b000000111,
            0b100100100,
            0b010010010,
            0b001001001,
            0b100010001,
            0b001010100,
    };

    private TILE[][] map = new TILE[3][3];
    private TicTacToeProtocol tttProtocol;
    private int player = 0;
    private ClockLibrary clockLibrary;

    public TicTacToeLogic(TicTacToeProtocol tttProtocol) {
        this.tttProtocol = tttProtocol;
    }

    public void start() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = TILE.E;
            }
        }
        clockLibrary = new ClockLibrary(1000, () -> tick());
        clockLibrary.start();
    }

    public void tick() {
        int[] pos = getRandomPosition();
        while (!isEmpty(pos[0], pos[1])) {
            pos = getRandomPosition();
        }

        map[pos[0]][pos[1]] = player == 0 ? TILE.X : TILE.O;
        player = 1 - player;

        boolean isWin = isWinner();
        if (isWin) {
            clockLibrary.stop();
        }

        if (isGameOver()) {
            clockLibrary.stop();

            if (!isWin) {
                tttProtocol.tie();
            }
        }


        tttProtocol.turn(map);
    }

    private boolean isGameOver() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == TILE.E) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isWinner() {
        int p1 = 0b000000000;
        int p2 = 0b000000000;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                int shift = 8 - (i*3 + j);
                int n1 = map[i][j] == TILE.X ? 1 : 0;
                p1 += n1 << shift;

                int n2 = map[i][j] == TILE.O ? 1 : 0;
                p2 += n2 << shift;
            }
        }


        System.out.println(toBinaryString9(p1));
        System.out.println(toBinaryString9(p2));

        for (int win : WINS) {
            if ((p1 & win) == win) {
                tttProtocol.win(TILE.X);
                return true;
            }
            if ((p2 & win) == win) {
                tttProtocol.win(TILE.O);
                return true;
            }
        }

        return false;
    }

    private boolean isEmpty(int i, int j) {
        return map[i][j] == TILE.E;
    }

    private int[] getRandomPosition() {
        int i = new Random().nextInt(3);
        int j = new Random().nextInt(3);
        return new int[]{i, j};
    }

    private static String toBinaryString9(int i) {
        String binaryWithOutLeading0 = Integer.toBinaryString(i);
        return "000000000"
                .substring(binaryWithOutLeading0.length())
                + binaryWithOutLeading0;
    }
}
