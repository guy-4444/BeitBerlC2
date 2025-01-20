package zoo;

public class Deer extends Animal {

    private int hornLength = 0;

    public int getHornLength() {
        return hornLength;
    }

    public void setHornLength(int hornLength) {
        this.hornLength = hornLength;
    }

    public Deer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Deer ate grass");
    }

    @Override
    public String toString() {
        return "Deer: " + super.toString();
    }
}
