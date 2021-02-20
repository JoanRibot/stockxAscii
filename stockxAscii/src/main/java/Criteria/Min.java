package Criteria;

import java.util.ArrayList;
import java.util.List;

import Items.Item;
import Offers.Offer;

public class Min implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public Min(Criteria criteria, Criteria otheCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otheCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        AndCriteria andCriteria = new AndCriteria(this.criteria, this.otherCriteria);
        List<Offer> andCriteriaList = andCriteria.checkCriteria(item);
        List<Offer> minResult = new ArrayList<>();
        int minimo = 10000;
        for (Offer offer: andCriteriaList){
            if(minimo > offer.value()){
                minimo = offer.value();
            }
        }
        for(Offer offer:andCriteriaList){
            if(offer.value() == minimo){
                minResult.add(offer);
                return minResult;
                }
            }  
        System.out.println("No hay en este momento.");
        return minResult;
    }
}
