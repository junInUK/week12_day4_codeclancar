package Vehicle;

import Utility.EColour;
import VehiclePart.Tyre;

import java.util.ArrayList;

public abstract class Vehicle {
    private int price;
    private EColour colour;
    private ArrayList<Tyre> tyres;

    public Vehicle(int price, EColour colour, ArrayList<Tyre> tyres) {
        this.price = price;
        this.colour = colour;
        this.tyres = tyres;
    }

    public int getPrice() {
        return price;
    }

    public EColour getColour() {
        return colour;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }
}
