package strockAscii;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import Criteria.MaxBid;
import Items.Item;
import Items.Sneaker;
import Offers.Ask;
import Offers.Bid;
import Offers.Offer;

public class MaxBidTest {
    @Test
    public void maxText(){
        Item sneaker = new Sneaker("5325255", "Adidas");
        sneaker.add(new Bid("4", 333));
        sneaker.add(new Bid("9.4", 666));
        sneaker.add(new Bid("6", 222));
        sneaker.add(new Bid("9.4", 1111));
        sneaker.add(new Ask("4", 333));
        sneaker.add(new Ask("9.4", 666));
        sneaker.add(new Ask("6", 222));
        sneaker.add(new Ask("9.4", 1111));
        MaxBid maxbid = new MaxBid();
        List<Offer> maximo = maxbid.checkCriteria(sneaker);
        for(Offer offer:maximo){
            sneaker.setBid(offer.value());
        }
        assertEquals(1111, sneaker.getBid());
    }
}
