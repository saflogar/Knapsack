/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import knapsack.Item;
import knapsack.Mochila;

/**
 *
 * @author sergio
 */
public abstract class Heuristic {
    protected Mochila m;
    protected Item[] items;
    protected int maxWeight;
    
    public Heuristic(Item[] items, int maxWeight){
        this.maxWeight = maxWeight;
        m = new Mochila(maxWeight);
        this.items = items;
        
    }
    
    

    
    public void getResults(){
                
        System.out.println("W maxima :" + m.getMaxWeight());
        System.out.println("# de elementos total:"+items.length);
        System.out.println("# de elementos en la mochila:" + m.getNumberOfEl());
        System.out.println("Peso de la mochila:" + m.getWeight());
        System.out.println("Valor Optimo local:" +m.getValue());
    
    
    }
    
    
    
    
}
