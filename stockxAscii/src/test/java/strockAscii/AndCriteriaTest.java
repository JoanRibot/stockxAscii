package strockAscii;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import Criteria.AndCriteria;
import Criteria.Bids;
import Criteria.Criteria;
import Criteria.Size;
import Items.Item;
import Items.Sneaker;
import Offers.Ask;
import Offers.Bid;
import Offers.Sale;
import Offers.Offer;

public class AndCriteriaTest {
    @Test
    public void test(){
        Item sneaker = new Sneaker("5325255", "Adidas");
        sneaker.add(new Bid("4", 333));
        sneaker.add(new Bid("9.4", 666));
        sneaker.add(new Bid("6", 222));
        sneaker.add(new Bid("3", 232));
        sneaker.add(new Bid("9.4", 1111));
        sneaker.add(new Ask("4", 333));
        sneaker.add(new Ask("9.4", 666));
        sneaker.add(new Ask("6", 222));
        sneaker.add(new Ask("9.4", 1111));
        sneaker.add(new Sale("6", 654));

        Criteria bids = new Bids();
        Criteria size = new Size("6");
        AndCriteria andCritera = new AndCriteria(bids, size);
        List<Offer> listResult = andCritera.checkCriteria(sneaker);
        Offers.Offer result = listResult.get(0);
        assertEquals(222, result.value());
    }
}
