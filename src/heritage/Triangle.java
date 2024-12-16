package heritage;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    private void setBase(double base) {
        this.base = base;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * base / 2.0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}' + super.toString();
    }
}
