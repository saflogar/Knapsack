/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Arrays;
import knapsack.Item;
import knapsack.Mochila;
import knapsack.OrderItemByValue;
/**
 *
 * @author sergio
 */
public class HeuristicValue {
    
    
    public HeuristicValue(Item[] items, int maxWeight){
        Mochila m = new Mochila(maxWeight);
        Arrays.sort(items, new OrderItemByValue());
//        for (Item item : items) {
//            System.out.println(item.getValue());
//        }
        for (int i = 0; i < items.length; i++) {
        
            if ((m.getWeight() + items[i].getWeight()) <= maxWeight){
                m.addItem(items[i]);
            }else break;
        }
        

        System.out.println("# de elementos en la mochila:" + m.getNumberOfEl());
        System.out.println("Peso de la mochila:" + m.getWeight());
        System.out.println("Valor Optimo local:" +m.getValue());
    }
}
