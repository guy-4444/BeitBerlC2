package zoo;

public class Lion extends Animal implements Moveable{

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Lion ate strawberry");
    }

    @Override
    public String toString() {
        return "Lion: " + super.toString();
    }

    @Override
    public void move(int speed) {

    }
}
