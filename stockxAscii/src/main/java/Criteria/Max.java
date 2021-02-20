package Criteria;

import java.util.ArrayList;
import java.util.List;

import Items.Item;
import Offers.Offer;

public class Max implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public Max(Criteria criteria, Criteria otheCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otheCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        AndCriteria andCriteria = new AndCriteria(this.criteria, this.otherCriteria);
        List<Offer> andCriteriaList = andCriteria.checkCriteria(item);
        List<Offer> maxResult = new ArrayList<>();
        int maximo = 0;
        for (Offer offer: andCriteriaList){
            if(maximo < offer.value()){
                maximo = offer.value();
            }
        }
        for(Offer offer:andCriteriaList){
            if(offer.value() == maximo){
                maxResult.add(offer);
                return maxResult;
                }
            }  
        System.out.println("No hay en este momento.");
        return maxResult;
    }
}
