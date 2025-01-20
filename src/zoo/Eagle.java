package zoo;

public class Eagle extends Animal implements Flyable, Moveable {

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Eagle ate snake");
    }

    @Override
    public String toString() {
        return "Eagle: " + super.toString();
    }

    @Override
    public void takeoff() {
        System.out.println("dfd");
    }

    @Override
    public void fly() {
        System.out.println("grrgr");
    }

    @Override
    public void land() {
        System.out.println("dfgdfgfgdf");
    }

    @Override
    public void move(int speed) {

    }
}
