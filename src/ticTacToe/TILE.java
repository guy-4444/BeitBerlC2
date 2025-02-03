package ticTacToe;

import java.util.HashMap;

public enum TILE {
    E,
    X,
    O;


    private static HashMap<TILE, Character> map = new HashMap<>();
    static {
        map.put(E, '□');
        map.put(X, '✘');
        map.put(O, '●');
    }

    public static char get(TILE t) {
        return map.get(t);
    }
}
