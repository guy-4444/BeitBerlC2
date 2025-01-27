package interfaceGarage;

public abstract class Vehicle implements Fixable {

    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public abstract int getFixTime();

    public String getModel() {
        return model;
    }
}
