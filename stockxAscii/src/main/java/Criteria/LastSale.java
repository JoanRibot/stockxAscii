package Criteria;

import java.util.ArrayList;
import java.util.List;

import Items.Item;
import Offers.Offer;

public class LastSale implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> lastSaleList = new ArrayList<>();
        Criteria salesClass= new Sales();
        List<Offer> sales = salesClass.checkCriteria(item);
        lastSaleList.add(sales.get(sales.size() - 1));
        return lastSaleList;
    }
    
}
