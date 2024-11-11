package WorldGame;

import java.util.ArrayList;

public class Flag {

    int width;
    int height;
    private ArrayList<String> colors = new ArrayList<>();

    public Flag(int width, int height, String... colors) {
        this.width = width;
        this.height = height;

        for (String color : colors) {
            this.colors.add(color);
        }
    }

}
