/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Tienda {
    private Scanner archivo ;
    private int n;
    private int maxWeight;
    private Scanner linea;
    private Scanner linea2;
    private int[] itemWeights;
    private int[] itemValues;


    
    public Tienda(File f) throws FileNotFoundException{
        archivo = new Scanner(new FileReader(f));
        linea = new Scanner(archivo.nextLine());
        n = linea.nextInt();
        maxWeight = linea.nextInt();
        
        linea = new Scanner(archivo.nextLine());
        linea2 = new Scanner(archivo.nextLine());
        itemWeights = new int[n];
        itemValues = new int[n];
        
        for (int i = 0; i < n; i++){
            itemWeights[i] = linea.nextInt();
            itemValues[i] = linea2.nextInt();
        }
    
    
    }

 

    public int getN() {
        return n;
    }

    public int[] getItemValues() {
        return itemValues;
    }

    public int[] getItemWeights() {
        return itemWeights;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
    
    
}
