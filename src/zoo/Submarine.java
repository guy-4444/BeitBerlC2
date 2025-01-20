package zoo;

public class Submarine extends Vehicle implements Swimable {

    public Submarine(String license, int speed) {
        super(license, speed);
    }

    @Override
    public String toString() {
        return "Submarine{} " + super.toString();
    }

    @Override
    public void swim() {
        System.out.println("Submarine - swimmmm");
    }
}
