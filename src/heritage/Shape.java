package heritage;

public abstract class Shape {

    public abstract double getArea();

    private static int NUM_OF_SHAPES = 0;

    private String color = "White";

    public Shape() {
        NUM_OF_SHAPES++;
    }

    public Shape(String color) {
        NUM_OF_SHAPES++;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null  ||  color.equals("")) {
            return;
        }
        this.color = color;
    }

    public static int getNumOfShapes() {
        return NUM_OF_SHAPES;
    }

    @Override
    public String toString() {
        return " + Shape{" +
                "color='" + color + '\'' +
                ", area='" + getArea() + '\'' +
                '}';
    }
}
