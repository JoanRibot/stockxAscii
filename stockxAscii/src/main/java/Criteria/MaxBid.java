package Criteria;

import java.util.ArrayList;
import java.util.List;

import Items.Item;
import Offers.Offer;

public class MaxBid implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria bidsC= new Bids();
        List<Offer> bids = bidsC.checkCriteria(item);
        List<Offer> bidMaxima = new ArrayList<>();
        int maximo = 0;
        for(Offer bid:bids){
            if(bid.value() > maximo){
                maximo = bid.value();
            }
        }
        for(Offer bid:bids){
            if(bid.value() == maximo){
                bidMaxima.add(bid);
                return bidMaxima;
                }
            }  
        System.out.println("No hay en este momento.");
        return bidMaxima;
    }
}   
