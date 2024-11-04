package WorldGame;

public class MyString {

    public static String formatNumber(long num) {
        if (num < 1000) {
            return "" + num;
        } else if (num < 1_000_000) {
            return (num / 1_000.0) + "K";
        } else if (num < 1_000_000_000.0) {
            return (num / 1_000_000.0) + "M";
        } else if (num < 1_000_000_000_000L) {
            return (num / 1_000_000_000.0) + "B";
        }

        return "" + num;
    }
}
