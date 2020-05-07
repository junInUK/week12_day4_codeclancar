import Utility.EColour;
import Vehicle.Car;
import VehiclePart.Engine;
import VehiclePart.Tyre;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car1;
    private Engine combustion;
    private Tyre tyre1,tyre2,tyre3,tyre4;
    ArrayList<Tyre> tyres;

    @Before
    public void before(){
        combustion = new Engine(10);
        tyre1 = new Tyre("flat");
        tyre2 = new Tyre("flat");
        tyre3 = new Tyre("flat");
        tyre4 = new Tyre("flat");
        tyres = new ArrayList<Tyre>();
        tyres.add(tyre1);
        tyres.add(tyre2);
        tyres.add(tyre3);
        tyres.add(tyre4);
        car1 = new Car(20000, EColour.BLACK,combustion,tyres);
    }

    @Test
    public void hasPrice(){
        assertEquals(20000,car1.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals(EColour.BLACK, car1.getColour());
    }

    @Test
    public void canCheckEngineSize(){
        assertEquals(10, car1.getEngine().getSize());
    }
}
