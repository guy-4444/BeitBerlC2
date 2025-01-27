package interfaceGarage;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Garage {

    private Protocol_Garage protocolGarage;
    private ArrayList<Vehicle> vehicles;
    private int hour = 0;
    private int currentVehicle = 0;
    private boolean isGarageOpen = true;

    public Garage(Protocol_Garage protocolGarage) {
        this.protocolGarage = protocolGarage;
    }

    public void startWork(ArrayList<Vehicle> vehicles) {
        // convert the map to arrayList.
        this.vehicles = vehicles;

        Runnable action = new Runnable() {
            public void run() {
                tick();
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(action, 0, 1, TimeUnit.SECONDS);
    }

    private void tick() {
        if (!isGarageOpen) {
            return;
        }

        hour++;
        System.out.println("hour = " + hour);

        Vehicle v = vehicles.get(currentVehicle);
        if (hour == v.getFixTime()) {
            v.fixed();
            protocolGarage.fixed();

            currentVehicle++;
            hour = 0;
        }

        if (currentVehicle == vehicles.size()) {
            isGarageOpen = false;
            System.out.println("Garage Closed!");
        }
    }
}






