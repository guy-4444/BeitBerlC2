package zoo;

public class Shark extends Animal implements Swimable {

    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Shark ate fish");
    }

    @Override
    public String toString() {
        return "Shark: " + super.toString();
    }

    @Override
    public void swim() {
        System.out.println("Shark - swimmmm");
    }
}
