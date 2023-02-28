package Car;

public abstract class CarProperties {

    private String make;
    private String model;
    private int hp;
    private String color;
    private String transmission;
    private int price;

    private int hasDamage;


    public CarProperties(String make, String model, int hp, String color, String transmission, int price, int hasDamage){
        this.make = make;
        this.model = model;
        this.hp = hp;
        this.color = color;
        this.transmission = transmission;
        this.price = price;
        this.hasDamage = hasDamage;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getHp(){
        return this.hp;
    }

    public String getColor(){
        return this.color;
    }

    public String getTransmission(){
        return this.transmission;
    }

    public int getPrice(){
        return this.price;
    }

    public int getDamageCost(){
        return this.hasDamage;
    }

    public int ifHasDamage(int damage){
        if (damage > 0) {
            return this.price - damage;
        }
        else {
            return this.price;
        }
    }

}


