import Car.Electric;
import Customer.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestCustomer {

    Customer customer;
    Electric electric;

    @Before
    public void before(){
        electric = new Electric("tesla", "model 3", 500, "pink", "auto", 1000, 0);
        ArrayList<Object> cars = new ArrayList<>();
        cars.add(electric);
        customer = new Customer("dan", 6, cars);
    }

    @Test
    public void hasMoney(){
        assertEquals(6, customer.getMoney());
    }

    @Test
    public void testCantPurchase(){
        assertEquals(6, customer.canPurchase(10));
    }

    @Test
    public void testCanPurchase(){
        assertEquals(2, customer.canPurchase(4));
    }

    @Test
    public void testGetName(){
        assertEquals("dan", customer.getName());
    }

    @Test
    public void testGetCars(){
        assertEquals(electric, customer.getCars() );
    }
}
