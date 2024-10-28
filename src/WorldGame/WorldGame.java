package WorldGame;

import java.util.Scanner;

public class WorldGame {

    private static Country[] countries;

    public static void start() {
        System.out.println("◍ ◍ ◍ ◍ ◍ Welcome to World Game App ◍ ◍ ◍ ◍ ◍");

        countries = DataManager.generateCountriesData();

        countries[0].setFavorite(true);
        printCountries(countries);


        //startNewGame();
    }

    private static void startNewGame() {
        System.out.println("◍ ◍ ◍ ◍ ◍ New Game Started ◍ ◍ ◍ ◍ ◍");

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < countries.length; i++) {
            System.out.println("1: is " + countries[i].getName() + " is island? (enter 1 true, 0 false)");
            int answer = scanner.nextInt();

            if ((answer == 1 && countries[i].isIsland()) || (answer == 0 && !countries[i].isIsland())) {
                System.out.println("good answer");
                score++;
            } else {
                System.out.println("bad answer");
            }
        }

        System.out.println("Game over. your score: " + score + "/" + countries.length);
    }

    public static void printCountries(Country[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". " + arr[i]);
        }
    }


}
