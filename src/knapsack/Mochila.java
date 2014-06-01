/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sergio
 */
public class Mochila {
    private ArrayList <Item> itemList = new ArrayList<Item>() ;
    private int weight = 0;
    private int value = 0;
    private int maxWeight;
    private int numberOfElements= 0;
    private int i=0;
    
    public Mochila(int maxWeight){
        
        this.maxWeight = maxWeight;
    
    }
    
    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getNumberOfEl() {
        return numberOfElements;
    }

//    public void setNumberOfEl(int numberOfEl) {
//        
//        this.numberOfElements = numberOfEl;
//        itemList = new Item[this.numberOfElements];
//    }
    
  
    public void addItem(Item item){
            itemList.add(item);
            weight += item.getWeight();
            value += item.getValue();
            numberOfElements++;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }
    public ArrayList getItemList(){
    
        return itemList;
    }
  
}
