package strockAscii;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import Criteria.MinAsk;
import Items.Item;
import Items.Sneaker;
import Offers.Ask;
import Offers.Bid;
import Offers.Offer;


public class MinAskTest {

    @Test
    public void maxText(){
        Item sneaker = new Sneaker("5325255", "Adidas");
        sneaker.add(new Bid("4", 331));
        sneaker.add(new Bid("9.4", 166));
        sneaker.add(new Bid("6", 212));
        sneaker.add(new Bid("9.4", 1111));
        sneaker.add(new Ask("4", 2223));
        sneaker.add(new Ask("9.4", 266));
        sneaker.add(new Ask("6", 223));
        sneaker.add(new Ask("9.4", 111));
        MinAsk minask = new MinAsk();
        List<Offer> minimo = minask.checkCriteria(sneaker);
        for(Offer offer:minimo){
            sneaker.setAsk(offer.value());
        }
        assertEquals(111, sneaker.getAsk());
    }
}


