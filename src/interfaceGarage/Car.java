package interfaceGarage;

public class Car extends Vehicle {

    private static final int NUM_OF_WHEELS = 4;

    public Car(String model) {
        super(model);
    }

    @Override
    public int getFixTime() {
        return 5;
    }

    @Override
    public void fixed() {
        System.out.println("Car is fixes - " + NUM_OF_WHEELS + " wheels");
    }

    public static Car build(String model) {
        // return new car with the model name;
        return null;
    }
}
