package zoo;

import java.util.ArrayList;

public class ZooMain {

    public static void start() {

        Eagle e = new Eagle("Zazoo", 3);
        Flyable f = new Eagle("Zazoo", 3);


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Simba", 10));
        animals.add(new Deer("Bambi", 4));
        animals.add(new Monkey("Kofiko", 50));
        animals.add(new Eagle("Eagy", 50));
        animals.add(new Shark("Baby Shark", 50));

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Mitsubishi", 200));
        vehicles.add(new Plane("Boeing F15", 2000));
        vehicles.add(new Submarine("Dakar", 70));

        ArrayList<Object> objects = new ArrayList<>();


        for (Animal animal : animals) {
            objects.add(animal);
        }
        for (Vehicle vehicle : vehicles) {
            objects.add(vehicle);
        }

        for (Object object : objects) {
            System.out.println(object);

            if (object instanceof Swimable) {
                Swimable swimable = (Swimable) object;
                swimable.swim();

            }
        }
    }

}










