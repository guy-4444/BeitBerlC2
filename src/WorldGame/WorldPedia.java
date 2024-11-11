package WorldGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;

public class WorldPedia {

    private static ArrayList<Country> countries;
    private static HashMap<String, Country> countriesMap = new HashMap<>();
    private static HashMap<String, Double> currenciesMap = new HashMap<>();

    public static void start() {
        System.out.println("◍ ◍ ◍ ◍ ◍ Welcome to World-Pedia App ◍ ◍ ◍ ◍ ◍");

        countries = DataManager.generateCountriesDataArrayList();
        for (Country country : countries) {
            countriesMap.put(country.getName(), country);
        }
        currenciesMap = DataManager.generateCurrencies();

//        long pop = getPopulation("United Kingdom");
//        String currency = getCurrency("United Kingdom");
//        String cc = getCapitalCity("Israel");
//        System.out.println("pop= " + pop);
//        System.out.println("currency= " + currency);
//        System.out.println("Capital City= " + cc);

//        calculateLarger("Israel", "Japan");
        calculate("Palsaddssdas", 100);



        Flag flag0 = new Flag(3, 2, "", "", "", "", "");

        Flag flag = new Flag(2, 1, "Blue", "White");
        Flag flag2 = new Flag(2, 1, "Red", "Blue", "White");

        HashMap<Country , Long> popMap = new HashMap<>();

        for (Map.Entry<String, Country> entry : countriesMap.entrySet()) {
            String name = entry.getKey();
            Country country = entry.getValue();

            popMap.put(country, country.getPop());
        }

    }

    private static void calculate(String name, int amount) {
        Country country = countriesMap.get(name);

        if (country == null) {
            System.out.println(name + " doesn't exists");
            return;
        }

        String symbol = country.getCurrencySymbol();

        double rate = currenciesMap.get(symbol);

        double result = amount * rate;

        System.out.println(result + " " + country.getCurrencyName());
    }

    private static void calculateLarger(String name1, String name2) {
        Country country1 = countriesMap.get(name1);
        Country country2 = countriesMap.get(name2);

        int numOfAdults1 = (int) (country1.getPop() * country1.getAdultPercent());
        int numOfAdults2 = (int) country2.getNumOfAdults();

        System.out.println(MyString.formatNumber(numOfAdults1) + " - " + MyString.formatNumber(numOfAdults2));
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
