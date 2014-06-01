/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

import java.util.Comparator;

/**
 *
 * @author sergio
 */
public class OrderByWeight implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }
    
}
