package Management;

import Vehicle.Vehicle;

import java.util.ArrayList;

public class DealerShip {
    private String name;
    private int till;
    private ArrayList<Vehicle> stockedVehicles;
    private ArrayList<Customer> customers;

    public DealerShip(String name) {
        this.name = name;
        this.till = 100000;
        this.stockedVehicles = new ArrayList<Vehicle>();
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public int getTill() {
        return till;
    }

    public ArrayList<Vehicle> getStockedVehicles() {
        return stockedVehicles;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setTill(int amount) {
        this.till = amount;
    }

    public void buy(Vehicle vehicle) {
        if(this.till >= vehicle.getPrice()){
            this.till -= vehicle.getPrice();
            this.stockedVehicles.add(vehicle);
        }
    }

    public void sell(Vehicle vehicle, Customer customer) {
        customer.buyVehicle(vehicle);
        this.till += vehicle.getPrice();
        this.stockedVehicles.remove(vehicle);
        this.customers.add(customer);
    }
}
