package heritage;

public class HeritageMain {


    public static void start() {

        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle("Black", 5);

        Square s1 = new Square("Red", 4);

        Triangle t1 = new Triangle(3, 7);
        Rectangle r1 = new Rectangle(3, 7);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(s1);
        System.out.println(r1);
        System.out.println("NUM_OF_SHAPES: " + Shape.getNumOfShapes());
    }

}





