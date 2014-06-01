/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

/**
 *
 * @author sergio
 */
public class Item {
    
    private int weight;
    private int value;
    
    public Item(){}
    public Item(int weight, int value){
        this.weight = weight;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
}
