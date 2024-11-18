package files;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyFileReader {

    public static final String FILE_PATH = "/Users/guymacin/Downloads/MyGame2/data.txt";

    public static void start() {

//        readText(FILE_PATH);

        solve();
        System.out.println("Done");
    }

    private static void solve() {
        String text = null;
        try {
            Path path = Paths.get(FILE_PATH);
            text = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (text == null) {
            return;
        }

        String[] splits = text.split("\\W+");
        //for (String split : splits) {
        //    if (split.length() > 1) {
        //        // add to the new list
        //    }
        //}

        String[] filteredWords = Arrays.stream(splits)
                .filter((String s) -> s.length() >= 2)
                .toArray(String[]::new);


        String password = "";
        for (int i = 0; i < filteredWords.length; i+=10) {
            String word = filteredWords[i];
            password += word.charAt(1);

            if (password.length() == 10) {
                break;
            }
        }

        System.out.println("Password: " + password);
    }

    private static void readLines(String filePath) {
        try {
            Path path = Paths.get(filePath);
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readText(String filePath) {
        try {
            Path path = Paths.get(filePath);
            String text = Files.readString(path);
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
