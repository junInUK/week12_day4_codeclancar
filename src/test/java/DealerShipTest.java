import Management.Customer;
import Management.DealerShip;
import Utility.EColour;
import Vehicle.Car;
import VehiclePart.Engine;
import VehiclePart.Tyre;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerShipTest {

    private DealerShip codeclanAnorld;
    private Car car1;
    private Engine combustion;
    private Tyre tyre1,tyre2,tyre3,tyre4;
    private ArrayList<Tyre> tyres;
    private Customer jun;

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
        codeclanAnorld = new DealerShip("codeclanAnorld");
        jun = new Customer("jun",50000);
    }

    @Test
    public void hasName(){
        assertEquals("codeclanAnorld", codeclanAnorld.getName());
    }

    @Test
    public void hasFunds(){
        assertEquals(100000,codeclanAnorld.getTill());
    }

    @Test
    public void stockedVehiclesStartFromZero(){
        assertEquals(0, codeclanAnorld.getStockedVehicles().size());
    }

    @Test
    public void customersStartFromZero(){
        assertEquals(0, codeclanAnorld.getCustomers().size());
    }

    @Test
    public void canBuyAVehicle(){
        codeclanAnorld.buy(car1);
        assertEquals(80000,codeclanAnorld.getTill());
        assertEquals(1, codeclanAnorld.getStockedVehicles().size());
    }

    @Test
    public void canSellVehicleToCustomer(){
        codeclanAnorld.buy(car1);
        codeclanAnorld.sell(car1,jun);
        assertEquals(30000,jun.getFunds());
        assertEquals(100000,codeclanAnorld.getTill());
        assertEquals(1,jun.getOwnedVehicles().size());
        assertEquals(0,codeclanAnorld.getStockedVehicles().size());
        assertEquals(1,codeclanAnorld.getCustomers().size());
    }
}
