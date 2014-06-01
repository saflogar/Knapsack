/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import knapsack.ItemValuePerW;
import knapsack.Tienda;
import metodos.HeuristicValue;
import metodos.HeuristicValuePerW;
import metodos.HeuristicWeight;

/**
 *
 * @author sergio
 */
public class TestHeuristicValuePerW {
       
    public static void main(String[] args) {
        try {
            ItemValuePerW[] items;
           
            System.out.println(" ");
            Scanner sc = new Scanner(System.in);
            final  String PATH= sc.nextLine();
            double timeStart= System.currentTimeMillis();

            Tienda t = new Tienda(new File(PATH));
            items = new ItemValuePerW[t.getN()];
            for (int i = 0; i < t.getN(); i++) {
                items[i] = new ItemValuePerW(t.getItemWeights()[i],t.getItemValues()[i],(double)(t.getItemValues()[i])/t.getItemWeights()[i]);
            }
            Arrays.sort(items);
//              IMPRIMIR LA LISTA COMPLETA DE OBJETOS           
//            for (int i = 0; i < items.length; i++) {
//               System.out.println(i+": " + items[i].getValuePerW() );
//            }
            
//          
            
            System.out.println(" # total de objetos: " + t.getN());
            System.out.println(" # de soluciones: " + Math.pow(2, t.getN()));
            System.out.println(" Peso que soporta la mochila: "+ t.getMaxWeight());
            System.out.println("----------Beneficio/Costo--------------------");
            HeuristicValuePerW heu = new HeuristicValuePerW(items,t.getMaxWeight());
            System.out.println("----------Por Valor--------------------");

            HeuristicValue h2 = new HeuristicValue(items,t.getMaxWeight());
            System.out.println("----------Por peso--------------------");

            HeuristicWeight h3 = new HeuristicWeight(items,t.getMaxWeight());
            
            System.out.println("Tiempo: "+(System.currentTimeMillis()-timeStart)/1000+"s" );
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestHeuristicValuePerW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
