package WorldGame;

public class WorldGame {

    private static Country[] countries = new Country[3];

    public static void start() {


        Country c0 = new Country();
        c0.name = "Israel";
        c0.pop = 10_000_000;

        Country c1 = new Country();
        c1.name = "USA";
        c1.pop = 300_000_000;

        countries[0] = c0;
        countries[1] = c1;

        inputData();

        printData();

    }

    private static void inputData() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter country name:");


            System.out.println("Enter country population:");



        }
    }


    private static void printData() {

    }

}
