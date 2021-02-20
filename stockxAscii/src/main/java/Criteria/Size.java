package Criteria;

import java.util.ArrayList;
import java.util.List;

import Items.Item;
import Offers.Offer;

public class Size implements Criteria {

    private String size;

    public Size(String size){
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> offers = item.offers();
        List<Offer> sameSize = new ArrayList<>();
        for(Offer offer:offers){
            if(offer.size() == this.size){
                sameSize.add(offer);
            }
        }
        return sameSize;
    }
    

}
