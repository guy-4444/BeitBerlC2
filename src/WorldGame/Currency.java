package WorldGame;

public class Currency {
    private String currencySymbol;
    private String currencyName;

    public Currency(String currencySymbol, String currencyName) {
        this.currencySymbol = currencySymbol;
        this.currencyName = currencyName;
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
}
