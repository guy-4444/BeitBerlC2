package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class MyFileCreator {

    public static final String FILE_PATH = "/Users/guymacin/Downloads/MyGame2/output.txt";

    public static void start() {
        ArrayList<String> names = new ArrayList<>();
        names.add("United States");
        names.add("India");
        names.add("Brazil");
        names.add("Germany");
        names.add("Canada");
        names.add("Nigeria");
        names.add("Australia");
        names.add("China");
        names.add("France");
        names.add("Japan");
        names.add("South Africa");
        names.add("Mexico");

        writeIntoFile(names);
    }

    private static void writeIntoFile(String text) {
        try {
            Files.writeString(Path.of(FILE_PATH), text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeIntoFile(ArrayList<String> lines) {
        File file = new File(FILE_PATH);
        try {
            Files.write(file.toPath(),lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
