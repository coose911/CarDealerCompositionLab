import Car.Diesel;
import Car.Electric;
import Car.Hybrid;
import Car.Petrol;
import Components.Turbos;
import Dealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestDealership {

    Dealership dealership;
    Diesel diesel;
    Petrol petrol;
    Electric electric;
    Hybrid hybrid;
    Turbos turbos;

    @Before
    public void before(){
        diesel = new Diesel("skoda", "octavia", 170, "red", "manuel", 5000, 0);
        petrol = new Petrol("citroen", "c4 cactus", 120, "black", "manuel", 10000, 0);
        electric = new Electric("tesla", "model 3", 500, "pink", "auto", 10000, 300);
        hybrid = new Hybrid("toyota", "prius", 1000, "na", "auto", 5000, 0);
        ArrayList<Object> cars = new ArrayList<>();
        cars.add(diesel);
        cars.add(hybrid);
        cars.add(petrol);
        cars.add(electric);
        turbos = new Turbos(300, 2);
        ArrayList<Object> parts = new ArrayList<>();
        parts.add(turbos);
        dealership = new Dealership(1000000, cars, parts);
    }

    @Test
    public void hasTurbo(){
        assertEquals(turbos, dealership.getparts());
    }

    @Test
    public void testCanPurchase(){
        assertEquals(999996, dealership.canPurchase(4));
    }

    @Test
    public void testCanSell(){
        assertEquals("car in stock", dealership.canSell(hybrid));
    }

    @Test
    public void testHasDamage(){
        int price = electric.getDamageCost();
        int damageCost = electric.ifHasDamage(price);
        assertEquals(9700, damageCost);
    }

//    @Test
//    public void testCanRepair(){
//        int price = electric.getDamageCost();
//        int damagedPrice = electric.ifHasDamage(price);
//        dealership.hasPart(turbos);
//        int fixed = dealership.repairVehicle(damagedPrice);
//        assertEquals(10000, fixed);
//    }

    @Test
    public void testStockValue(){
        assertEquals(30000, dealership.stockValue());
    }
}
