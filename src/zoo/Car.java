package zoo;

public class Car extends Vehicle {

    public Car(String license, int speed) {
        super(license, speed);
    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }
}
