package Vehicle;

import Behaviour.IEnginer;
import Utility.EColour;
import VehiclePart.Engine;
import VehiclePart.Tyre;

import java.util.ArrayList;

public class Car extends Vehicle implements IEnginer {

    private Engine engine;

    public Car(int price, EColour colour,Engine engine, ArrayList<Tyre> tyres) {
        super(price, colour,tyres);
        this.engine = engine;
    }


    public Engine getEngine() {
        return this.engine;
    }
}
