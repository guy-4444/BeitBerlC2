package zoo;

public abstract class Sheep extends Animal implements Moveable {

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void move(int speed) {
        System.out.println("sheep moved");
    }
}
