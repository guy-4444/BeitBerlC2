package WorldGame;

import java.util.ArrayList;
import java.util.HashMap;

public class WorldPedia {

    private static ArrayList<Country> countries;
    private static HashMap<String, Country> countriesMap = new HashMap<>();

    public static void start() {
        System.out.println("◍ ◍ ◍ ◍ ◍ Welcome to World-Pedia App ◍ ◍ ◍ ◍ ◍");

        countries = DataManager.generateCountriesDataArrayList();

        for (Country country : countries) {
            countriesMap.put(country.getName(), country);
        }

        long pop = getPopulation("United Kingdom");
        String currency = getCurrency("United Kingdom");
        String cc = getCapitalCity("Israel");
        System.out.println("pop= " + pop);
        System.out.println("currency= " + currency);
        System.out.println("Capital City= " + cc);

    }

    private static String getCapitalCity(String name) {
        return countriesMap.get(name).getCapital();
    }

    private static String getCurrency(String name) {
        Country country = countriesMap.get(name);
        return country.getCurrencyName() + " (" + country.getCurrencySymbol() + ")";
    }












    private static long getPopulation(String name) {
        for (Country country : countries) {
            if (country.getName().equals(name)) {
                return country.getPop();
            }
        }

        return -1;
    }


}
