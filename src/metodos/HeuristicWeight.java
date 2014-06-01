/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.ArrayList;
import java.util.Arrays;
import knapsack.Item;
import knapsack.Mochila;
import knapsack.OrderByWeight;
import knapsack.OrderItemByValue;

/**
 *
 * @author sergio
 */
public class HeuristicWeight {
    
    public HeuristicWeight(Item[] items, int maxWeight){
        Mochila m = new Mochila(maxWeight);
        Arrays.sort(items, new OrderByWeight());
        
//        for (int i = 0; i < items.length; i++) {
//            System.out.println(items[i].getWeight());
//            
//        }
        int h = 0;
        for (int i = 0; i < items.length; i++) {
            
            if ((m.getWeight() + items[i].getWeight()) <= maxWeight){
                m.addItem(items[i]);
                h++;
            }else break;
            
        }
        
       
        
        System.out.println("# de elementos en la mochila:" + m.getNumberOfEl());
        System.out.println("Peso de la mochila:" + m.getWeight());
        System.out.println("Valor Optimo local:" +m.getValue());
    }}
        //IMPRIME EL LOS OBJETOS DEL KNAPSACK
//        ArrayList<Item> bag = m.getItemList();
//        System.out.println("|#|w|a|");
//        for (int i = 0; i < bag.size(); i++) {
//            System.out.println("|"+i+"|"+bag.get(i).getWeight() +"|" + bag.get(i).getValue()+"|");            
//            
//        }
//        
//    }
    
    
    
    

   
    
    
    

