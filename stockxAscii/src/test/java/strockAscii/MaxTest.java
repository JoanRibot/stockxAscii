package strockAscii;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import Criteria.Bids;
import Criteria.Criteria;
import Criteria.Size;
import Criteria.Max;
import Items.Item;
import Items.Sneaker;
import Offers.Ask;
import Offers.Bid;
import Offers.Offer;
import Offers.Sale;

public class MaxTest {
    @Test
    public void test(){
        Item sneaker = new Sneaker("5325255", "Adidas");
        sneaker.add(new Bid("4", 333));
        sneaker.add(new Ask("9.4", 111));
        sneaker.add(new Bid("9.4", 666));
        sneaker.add(new Ask("9.4", 1111));
        sneaker.add(new Sale("6", 6254));
        sneaker.add(new Bid("9.4", 222));
        sneaker.add(new Bid("3", 232));
        sneaker.add(new Bid("9.4", 1111));
        sneaker.add(new Ask("4", 333));
        sneaker.add(new Ask("9.4", 666));
        sneaker.add(new Ask("6", 222));
        sneaker.add(new Sale("6", 654));

        Criteria bids = new Bids();
        Criteria size = new Size("9.4");
        Criteria max = new Max(bids,size);
        List<Offer> listResult = max.checkCriteria(sneaker);
        Offer result = listResult.get(0);
        assertEquals(1111, result.value());
    }
}
