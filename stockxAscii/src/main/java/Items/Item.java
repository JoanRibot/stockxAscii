package Items;

import java.util.List;

import Offers.Offer;

public interface Item {
    int getBid();

    int getAsk();

    int getSale();

    void add(Offer offer);

    List<Offer> offers();

    void setBid(int bid);

    void setAsk(int ask);

    void setSale(int sale);

}
