import Utility.EColour;
import Vehicle.Car;
import Vehicle.ECar;
import VehiclePart.Engine;
import VehiclePart.Motor;
import VehiclePart.Tyre;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ECarTest {

    private ECar ecar1;
    private Motor motor1;
    private Tyre tyre1,tyre2,tyre3,tyre4;
    ArrayList<Tyre> tyres;

    @Before
    public void before(){
        motor1 = new Motor(15);
        tyre1 = new Tyre("flat");
        tyre2 = new Tyre("flat");
        tyre3 = new Tyre("flat");
        tyre4 = new Tyre("flat");
        tyres = new ArrayList<Tyre>();
        tyres.add(tyre1);
        tyres.add(tyre2);
        tyres.add(tyre3);
        tyres.add(tyre4);
        ecar1 = new ECar(25000, EColour.RED,motor1,tyres);
    }

    @Test
    public void hasPrice(){
        assertEquals(25000, ecar1.getPrice());
    }

    @Test
    public void hasMotor(){
        assertEquals(15, ecar1.getMotor().getSize());
    }

    @Test
    public void has4Tyres(){
        assertEquals(4, ecar1.getTyres().size());
        assertEquals("flat",ecar1.getTyres().get(0).getModel());
    }
}
