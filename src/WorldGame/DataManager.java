package WorldGame;

public class DataManager {

    public static Country[] generateCountriesData() {
        Country[] countries = new Country[5];

        countries[0] = new Country("Israel", 10_000_000, false);
        countries[1] = new Country("Australia", 40_000_000, true);
        countries[2] = new Country("UK", 60_000_000, true);
        countries[3] = new Country("USA", 300_000_000, false);
        countries[4] = new Country("Japan", 180_000_000, true);

        return countries;
    }

}
