package site;

public class Subscriber extends User {

    private int channels;

    public Subscriber(String email, int channels) {
        super(email);
        this.channels = channels;
    }

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    @Override
    public int getRank() {
        return Math.min(channels * 5, 100);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "channels=" + channels +
                '}' + super.toString();
    }
}
