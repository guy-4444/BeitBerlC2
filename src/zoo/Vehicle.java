package zoo;

public abstract class Vehicle {

    private String license;
    private int speed;

    public Vehicle(String license, int speed) {
        this.license = license;
        this.speed = speed;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return " Vehicle{" +
                "license='" + license + '\'' +
                ", speed=" + speed +
                '}';
    }
}
