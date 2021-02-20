package Criteria;

import java.util.ArrayList;
import java.util.List;

import Items.Item;
import Offers.Offer;
import Offers.Sale;

public class Sales implements Criteria {
    
    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> offers = item.offers();
        List<Offer> sales = new ArrayList<>();
        for(Offer offer: offers){
            if(offer instanceof Sale){
                sales.add(offer);
            }
            else{
                continue;
            }
        }
        return sales;
    }
}
