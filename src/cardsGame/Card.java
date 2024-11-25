package cardsGame;

import java.util.HashMap;

public class Card {

    public static final String AIR = "air";

    private String name;
    private String type;
    private HashMap<String, Integer> attack = new HashMap<>();

    public Card(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // add function to init attacks
}
