package ticTacToe;

public class TicTacToeMain {

    public static void start() {

        TicTacToeLogic ticTacToeLogic = new TicTacToeLogic(protocol);
        ticTacToeLogic.start();
    }

    private static TicTacToeLogic.TicTacToeProtocol protocol = new TicTacToeLogic.TicTacToeProtocol() {
        @Override
        public void turn(TILE[][] map) {
            print(map);
        }

        @Override
        public void win(TILE winner) {
            System.out.println("Game Over " + TILE.get(winner) + " is the winner!");
        }

        @Override
        public void tie() {
            System.out.println("Game Over " + "Tie!");
        }
    };

    private static void print(TILE[][] map) {
        for (int i = 0; i < map.length; i++) {
            String line = "";
            for (int j = 0; j < map[0].length; j++) {
                line += TILE.get(map[i][j]) + " ";
            }
            System.out.println(line);
        }
        System.out.println();
    }
}









