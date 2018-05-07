public abstract class Ride {

    private int price;
    private int minAge;
    private float height;

    public Ride(int price, int minAge, float height){
        this.price = price;
        this.minAge = minAge;
        this.height = height;
    }

    public int getPrice(){
        return price;
    }

    public int getMinAge(){
        return minAge;
    }

    public float getHeight(){
        return (int) height;
    }

}
