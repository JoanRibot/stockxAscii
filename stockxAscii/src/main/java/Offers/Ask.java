package Offers;

public class Ask implements Offer{
    private String size;
    private Integer ask;

    public Ask(String size, int ask){
        this.size=size;
        this.ask=ask;
    }

    public String size() {
        return this.size;
    }

    public int value() {
        return this.ask;
    }

    @Override
    public String toString() {
        return "ask=" + this.ask + ", size=" + this.size;
    }

}
