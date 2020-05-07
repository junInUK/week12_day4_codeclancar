package Vehicle;

import Behaviour.IMotor;
import Utility.EColour;
import VehiclePart.Motor;
import VehiclePart.Tyre;

import java.util.ArrayList;

public class ECar extends Vehicle implements IMotor {

    private Motor motor;

    public ECar(int price, EColour colour, Motor motor, ArrayList<Tyre> tyres) {
        super(price, colour,tyres);
        this.motor = motor;
    }

    public Motor getMotor() {
        return this.motor;
    }
}
