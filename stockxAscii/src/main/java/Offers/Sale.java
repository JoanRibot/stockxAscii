package Offers;

public class Sale implements Offer{
    private String size;
    private Integer price;

    public Sale(String size, int price){
        this.size=size;
        this.price=price;
    }

    public String size() {
        return this.size;
    }

    public int value() {
        return this.price;
    }

    @Override
    public String toString() {
        return "price=" + this.price + ", size=" + this.size;
    }
}

