package Items;

import java.util.ArrayList;
import java.util.List;

import Offers.Offer;

public class Sneaker implements Item{
    private final String style;
    private final String name;
    private int sale = 0;
    private int bid;
    private int ask;
    private List<Offer> offers = new ArrayList<>();


    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    public int getSale() {
        return this.sale;
    }
    @Override
    public void setSale(int sale) {
        this.sale = sale;
    }

    public void add(Offer offer){
        offers.add(offer);
    }

    @Override
    public String toString() {
        return getName() + '\n' + getStyle() + '\n' + "last sale: " + getSale();
    }

    @Override
    public int getBid() {
        return this.bid;
    }

    @Override
    public int getAsk() {
        return this.ask;
    }

    @Override
    public List<Offer> offers() {
        return this.offers;
    }

    @Override
    public void setBid(int bid) {
        this.bid=bid;
    }

    @Override
    public void setAsk(int ask) {
        this.ask=ask;
    }

    

	

   

}
