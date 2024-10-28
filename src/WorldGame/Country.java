package WorldGame;

public class Country {

    private String name;
    private long pop;
    private boolean isIsland = false;
    private boolean isFavorite = false;


    public String getName() {
        return name;
    }

    public boolean isIsland() {
        return isIsland;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public Country(String name, long pop, boolean isIsland) {
        this.name = name;
        this.pop = pop;
        this.isIsland = isIsland;
    }

    @Override
    public String toString() {
        String title = name;
        if (isIsland) {
            title += " <>";
        }
        if (isFavorite) {
            title += " ♡";
        }
        return title + " - pop: " + pop;
    }
}
