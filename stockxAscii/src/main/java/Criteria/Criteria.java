package Criteria;

import java.util.List;

import Items.Item;
import Offers.Offer;

public interface Criteria {
    List<Offer> checkCriteria(Item item);
    
}
