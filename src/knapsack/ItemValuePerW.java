/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;



/**
 *
 * @author sergio
 */
public class ItemValuePerW extends Item implements Comparable<ItemValuePerW>{
    private double valuePerW;
    
     
    
    public ItemValuePerW(int weight, int value, double valuePerW){
    super(weight,value);
    this.valuePerW = valuePerW;
    }
    
    

    public double getValuePerW() {
        return valuePerW;
    }

    public void setValuePerW(double valuePerW) {
        this.valuePerW = valuePerW;
    }

    

    @Override
    public int compareTo(ItemValuePerW o) {
       
       return Double.compare( o.valuePerW,this.valuePerW);
    }

    
}
