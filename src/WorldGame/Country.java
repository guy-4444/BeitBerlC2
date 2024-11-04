package WorldGame;

public class Country {

    public static int NUM_OF_COUNTRIES = 0;

    private String name;
    private String continent;
    private String capital;
    private int areaKm;
    private long pop;
    private boolean isIsland = false;
    private double adultPercent = 0.6;
    private String currencySymbol;
    private String currencyName;

    public Country(String name, String continent, String capital, int areaKm, long pop, boolean isIsland, double adultPercent, String currencySymbol, String currencyName) {
        NUM_OF_COUNTRIES++;

        this.name = name;
        this.continent = continent;
        this.capital = capital;
        this.areaKm = areaKm;
        this.pop = pop;
        this.isIsland = isIsland;
        this.adultPercent = adultPercent;
        this.currencySymbol = currencySymbol;
        this.currencyName = currencyName;
    }

    public static int getNumOfCountries() {
        return NUM_OF_COUNTRIES;
    }

    public static void setNumOfCountries(int numOfCountries) {
        NUM_OF_COUNTRIES = numOfCountries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getAreaKm() {
        return areaKm;
    }

    public void setAreaKm(int areaKm) {
        this.areaKm = areaKm;
    }

    public long getPop() {
        return pop;
    }

    public void setPop(long pop) {
        this.pop = pop;
    }

    public boolean isIsland() {
        return isIsland;
    }

    public void setIsland(boolean island) {
        isIsland = island;
    }

    public double getAdultPercent() {
        return adultPercent;
    }

    public void setAdultPercent(double adultPercent) {
        this.adultPercent = adultPercent;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    @Override
    public String toString() {
        String title = name;
        if (isIsland) {
            title += " <>";
        }
        return title + " - pop: " + pop;
    }

    public long getNumOfAdults() {
        return (long) (pop * adultPercent);
    }
}
