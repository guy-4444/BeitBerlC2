package zoo;

public class Monkey extends Animal {

    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Monkey ate banana");
    }

    @Override
    public String toString() {
        return "Monkey: " + super.toString();
    }
}
