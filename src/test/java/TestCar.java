import Car.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCar {

    Diesel diesel;
    Petrol petrol;
    Electric electric;
    Hybrid hybrid;

    @Before
    public void before(){
        diesel = new Diesel("skoda", "octavia", 170, "red", "manuel", 5000, 0);
        petrol = new Petrol("citroen", "c4 cactus", 120, "black", "manuel", 10000, 0);
        electric = new Electric("tesla", "model 3", 500, "pink", "auto", 10000, 0);
        hybrid = new Hybrid("toyota", "prius", 1000, "na", "auto", 5000, 0);
    }

    @Test
    public void hasMake(){
        assertEquals("tesla", electric.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("c4 cactus", petrol.getModel());
    }

    @Test
    public void hasHp(){
        assertEquals(1000, hybrid.getHp());
    }

    @Test
    public void hasTransmission(){
        assertEquals("manuel", diesel.getTransmission());
    }



}
