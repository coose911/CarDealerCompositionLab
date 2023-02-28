package Dealership;

import Behaviours.IBuy;
import Behaviours.ISell;
import Car.Diesel;
import Car.Electric;
import Car.Hybrid;
import Car.Petrol;

import java.util.ArrayList;

public class Dealership implements IBuy, ISell {

    private int money;
    ArrayList<Object> cars;

    ArrayList<Object> parts;

    public Dealership(int money, ArrayList<Object> cars, ArrayList<Object> parts){
        this.money = money;
        this.cars = cars;
        this.parts = parts;
    }

    public int buy(int amount){
        return this.money -= amount;
    }

    public int sell(int amount){
        return this.money += amount;
    }

    public int getMoney(){
        return this.money;
    }

    public Object getCars(){
        return this.cars;
    }

    public Object getparts(){
        if (this.parts.size() <= 1){
            return this.parts.get(0);
        }
        else{
            return this.parts;
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

    public String canSell(Object car){
        for (Object i : this.cars){
            if (i == car){
                return "car in stock";
            }
        }
        return "car not in stock";
    }

//    public int hasPart(Object part){
//        for (Object i : this.parts){
//            if (i instanceof CarPart && i == part){
//                return ((CarPart) i).price();
//            }
//        }
//        return -1;
//    }
//
//    public int repairVehicle(int amount, Dealership dealership){
//        int partPrice = dealership.hasPart(part);
//        return amount + partPrice;
//    }



    public int stockValue() {
        int total = 0;
        for (Object i : this.cars) {
            if (i instanceof Diesel) {
                total += ((Diesel) i).getPrice();
            } else if (i instanceof Petrol) {
                total += ((Petrol) i).getPrice();
            } else if (i instanceof Electric) {
                total += ((Electric) i).getPrice();
            } else if (i instanceof Hybrid) {
                total += ((Hybrid) i).getPrice();
            }
        }
        return total;
    }
}
