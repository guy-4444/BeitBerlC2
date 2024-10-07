package WorldGame;

import java.util.Scanner;

public class WorldGame {

    private static String[] countries = new String[] {"A", "B", "C"};

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("◍ ◍ ◍ ◍ ◍ World Game App ◍ ◍ ◍ ◍ ◍");


        while (true) {
            System.out.println("Enter Country: (-- to close)");

            String input = scanner.nextLine();
            if (input.equals("--")) {
                break;
            }
            if (input.length() < 2) {
                continue;
            }

            // todo: insert logic.
            addCountryToArray(input);
            System.out.println("Input: " + input);
        }

        System.out.println("\n\nYour countries array: ");
        for (int i = 0; i < countries.length; i++) {
            System.out.println((i + 1) + ". " + countries[i]);
        }

        System.out.println("Program end");
    }

    private static void addCountryToArray(String name) {

    }


}
