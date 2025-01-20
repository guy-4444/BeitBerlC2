package zoo;

public class Plane extends Vehicle {

    public Plane(String license, int speed) {
        super(license, speed);
    }

    @Override
    public String toString() {
        return "Plane{} " + super.toString();
    }
}
