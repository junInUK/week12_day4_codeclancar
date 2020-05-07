package Management;

import Vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int funds;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(String name, int funds) {
        this.name = name;
        this.funds = funds;
        this.ownedVehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public int getFunds() {
        return funds;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void buyVehicle(Vehicle vehicle){
        if(this.funds >= vehicle.getPrice()){
            this.funds -= vehicle.getPrice();
            this.ownedVehicles.add(vehicle);
        }
    }
}
