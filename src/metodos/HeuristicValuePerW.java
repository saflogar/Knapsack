/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import knapsack.ItemValuePerW;
import knapsack.Mochila;

/**
 *
 * @author sergio
 */
public class HeuristicValuePerW {
    
    public HeuristicValuePerW(ItemValuePerW[] items,int maxWeight){
        
        Mochila m = new Mochila(maxWeight);
        
        //System.out.println("Objetos agregados:");
        //System.out.println("|#|w|a|W|");
        
        for (int j = 0; j < items.length; j++) {
           
            if((m.getWeight() + items[j].getWeight()) <= maxWeight){
                m.addItem(items[j]);
               // System.out.println("|"+m.getNumberOfEl() +"|"+ items[j].getWeight()+"|" + items[j].getValue()+"|"+m.getWeight()+"|");
                
            }else break;

        }

        System.out.println("# de elementos en la mochila:" + m.getNumberOfEl());
        System.out.println("Peso de la mochila:" + m.getWeight());
        System.out.println("Valor Optimo local:" +m.getValue());

    }
    
    
    
    
}
