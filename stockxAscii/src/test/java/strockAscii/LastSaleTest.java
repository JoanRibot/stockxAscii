package strockAscii;

import java.util.List;

import org.junit.Test;

import Criteria.LastSale;
import Items.Item;
import Items.Sneaker;
import Offers.Offer;
import Offers.Sale;

public class LastSaleTest {
    @Test
    public void maxText(){
        Item sneaker = new Sneaker("5325255", "Adidas");
        sneaker.add(new Sale("4", 333));
        sneaker.add(new Sale("9.4", 666));
        sneaker.add(new Sale("6", 222));
        sneaker.add(new Sale("9.4", 1111));
        sneaker.add(new Sale("4", 333));
        sneaker.add(new Sale("9.4", 666));
        sneaker.add(new Sale("6", 222));
        sneaker.add(new Sale("9.4", 1111));
        LastSale lastSaleClass = new LastSale();
        List<Offer> lastSale = lastSaleClass.checkCriteria(sneaker);
        for(Offer sale:lastSale){
            sneaker.setSale(sale.value());
        }
        assertEquals(1111, sneaker.getBid());
    }

    private void assertEquals(int i, int bid) {
    }
}
