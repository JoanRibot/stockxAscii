package Offers;

public class Bid implements Offer {
    private String size;
    private Integer bid;

    public Bid(String size, int bid){
        this.size=size;
        this.bid=bid;
    }
    
    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.bid;
    }
    
    @Override
    public String toString() {
        return "\n\t\t" + size() + "\t\t" + value();
    }
}

