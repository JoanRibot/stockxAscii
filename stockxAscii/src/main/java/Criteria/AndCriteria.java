package Criteria;

import java.util.ArrayList;
import java.util.List;

import Items.Item;
import Offers.Offer;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otheCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otheCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> firstCriteria = this.criteria.checkCriteria(item);
        List<Offer> secondCritera = this.otherCriteria.checkCriteria(item);
        List<Offer> andCriteriaList = new ArrayList<>();
        for(Offer offer: firstCriteria){
            if(secondCritera.contains(offer)){
                andCriteriaList.add(offer);
            }
        }
        return andCriteriaList;
    }
}
