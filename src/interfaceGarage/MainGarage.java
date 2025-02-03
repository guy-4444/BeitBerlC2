package interfaceGarage;

import java.util.*;

public class MainGarage {

    private static GarageDB garageDB;


    public static class MyException extends RuntimeException {
        public MyException(String message) {
            super(message);
        }
    }

    public static void foo(String name) {
        if (name == null) {
            throw new MyException("");
        }
    }


    public static void start() {
        foo("");


        garageDB = new GarageDB();

        garageDB.addVehicle(new Motorcycle("Yamaha"));
        garageDB.addVehicle(new Car("Toyota"));
        garageDB.addVehicle(new Car("Mitsubishi"));
        garageDB.addVehicle(new Truck("Isuzu"));

        Garage garage = new Garage(protocolGarage);
        //garage.startWork(garageDB.getVehicles());


        stackExample();
    }

    public void build(int type, String model) {

    }

    private static Protocol_Garage protocolGarage = new Protocol_Garage() {
        @Override
        public void fixed() {
            System.out.println("$$$$");
        }
    };

    private static void queueExample() {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        final int SIZE = queue.size();

        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(queue.size());
    }

    private static void stackExample() {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
            System.out.println(stack.pop());
        }

        System.out.println(stack.size());
    }
}








