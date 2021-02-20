package Criteria;

import java.util.ArrayList;
import java.util.List;

import Items.Item;
import Offers.Offer;
import Offers.Bid;

public class Bids implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> offers = item.offers();
        List<Offer> bids = new ArrayList<>();
        for(Offer offer: offers){
            if(offer instanceof Bid){
                bids.add(offer);
            }
            else{
                continue;
            }
        }
        return bids;
    }
    
}
