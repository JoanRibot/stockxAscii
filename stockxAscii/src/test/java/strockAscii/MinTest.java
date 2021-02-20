package strockAscii;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import Criteria.Criteria;
import Criteria.Min;
import Criteria.Sales;
import Criteria.Size;
import Items.Item;
import Items.Sneaker;
import Offers.Ask;
import Offers.Bid;
import Offers.Sale;
import Offers.Offer;

public class MinTest {
    @Test
    public void test(){
        Item sneaker = new Sneaker("5325255", "Adidas");
        sneaker.add(new Bid("4", 333));
        sneaker.add(new Ask("9.4", 111));
        sneaker.add(new Bid("5", 666));
        sneaker.add(new Ask("9.4", 1111));
        sneaker.add(new Sale("5", 6254));
        sneaker.add(new Bid("9.4", 222));
        sneaker.add(new Bid("3", 232));
        sneaker.add(new Bid("5", 1111));
        sneaker.add(new Ask("4", 333));
        sneaker.add(new Ask("9.4", 666));
        sneaker.add(new Ask("6", 222));
        sneaker.add(new Sale("5", 654));

        Criteria sales = new Sales();
        Criteria size = new Size("5");
        Criteria min = new Min(sales,size);
        List<Offer> listResult = min.checkCriteria(sneaker);
        Offer result = listResult.get(0);
        assertEquals(654, result.value());
    }
}
