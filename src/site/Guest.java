package site;

public class Guest extends User {

    private int hours;

    public Guest(String email, int hours) {
        super(email);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public int getRank() {
        return 10;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "hours=" + hours +
                '}' + super.toString();
    }
}
