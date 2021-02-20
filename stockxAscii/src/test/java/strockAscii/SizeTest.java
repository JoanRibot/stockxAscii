package strockAscii;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Criteria.Criteria;
import Criteria.Sales;
import Criteria.Size;
import Items.Item;
import Items.Sneaker;
import Offers.Ask;
import Offers.Bid;
import Offers.Sale;

public class SizeTest {
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

        Criteria size = new Size("9.4");
        int len = size.checkCriteria(sneaker).size();
        assertEquals(4, len);
    }
}
