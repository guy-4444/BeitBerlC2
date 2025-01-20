package zoo;

public class HouseSheep extends Sheep {

    public HouseSheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {

    }

    @Override
    public void move(int speed) {
        System.out.println("house sheep moved");
    }
}
