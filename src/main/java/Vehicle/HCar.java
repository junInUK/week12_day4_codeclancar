package Vehicle;

import Utility.EColour;
import VehiclePart.Engine;
import VehiclePart.Motor;
import VehiclePart.Tyre;

import java.util.ArrayList;

public class HCar extends Vehicle{

    private Engine engine;
    private Motor motor;

    public HCar(int price, EColour colour, Engine engine, Motor motor, ArrayList<Tyre> tyres) {
        super(price, colour,tyres);
        this.engine = engine;
        this.motor = motor;
    }
}
