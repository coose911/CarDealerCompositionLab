package Components;

public abstract class PartsProperties {

    private int price;
    private int labourTime;

    public PartsProperties(int price, int labourTime){
        this.price = price;
        this.labourTime = labourTime;
    }

    public int getPrice(){
        return this.price;
    }

    public int getLabourTime(){
        return this.labourTime;
    }
}
