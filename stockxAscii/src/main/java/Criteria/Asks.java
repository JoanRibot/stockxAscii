package Criteria;

import java.util.ArrayList;
import java.util.List;

import Items.Item;
import Offers.Ask;
import Offers.Offer;

public class Asks implements Criteria {
    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> offers = item.offers();
        List<Offer> bids = new ArrayList<>();
        for(Offer offer: offers){
            if(offer instanceof Ask){
                bids.add(offer);
            }
            else{
                continue;
            }
        }
        return bids;
    }

}
