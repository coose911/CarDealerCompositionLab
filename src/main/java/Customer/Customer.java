package Customer;

import Behaviours.IBuy;
import Behaviours.ISell;

import java.util.ArrayList;

public class Customer implements IBuy, ISell {

    private String name;
    private int money;
    ArrayList<Object> cars;

    public Customer(String name, int money, ArrayList<Object> cars){
        this.name = name;
        this.money = money;
        this.cars = cars;
    }

    public int buy(int amount){
        return this.money -= amount;
    }

    public int sell(int amount){
        return this.money += amount;
    }

    public String getName(){
        return this.name;
    }

    public int getMoney(){
        return this.money;
    }

    public Object getCars(){
        if (this.cars.size() > 1){
            return this.cars;
        }
        else {
            return this.cars.get(0);
        }
    }

    public int canPurchase(int amount){
        if (amount < this.money){
            System.out.println("You have enough dolla");
            return this.money - amount;
        }
        else {
            System.out.println("you poor");
            return this.money;
        }
    }
}
