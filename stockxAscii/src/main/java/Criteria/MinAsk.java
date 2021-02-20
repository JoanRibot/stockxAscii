package Criteria;

import java.util.ArrayList;
import java.util.List;

import Items.Item;
import Offers.Offer;

public class MinAsk implements Criteria{
    
    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria askClass= new Asks();
        List<Offer> asks = askClass.checkCriteria(item);
        List<Offer> askMinima = new ArrayList<>();
        int minimo = 10000;
        for(Offer ask:asks){
            if(ask.value() < minimo){
                minimo = ask.value();
            }
        }
        for(Offer ask:asks){
            if(ask.value() == minimo){
                askMinima.add(ask);
                return askMinima;
                }
            }
        
        System.out.println("No hay en este momento.");
        return askMinima;
    }
}
