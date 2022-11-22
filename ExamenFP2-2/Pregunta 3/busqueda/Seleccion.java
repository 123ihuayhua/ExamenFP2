/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busqueda;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Seleccion {
    
    public static void  main (String [] args){
        int [] numeros = {10,9,8,7,6,5,4,3,2,1,0};
        int [] num_ord = Seleccion(numeros);
        long init = System.nanoTime();
        Seleccion(numeros);
        for(int i = 0; i < num_ord.length;i++)
        System.out.println(num_ord[i]);
        long end = System.nanoTime();
        System.out.println((end-init) + " ns");
    }

    public static int [] Seleccion (int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int num_ord = list[i];
                    list[i] = list[j];
                    list[j] = num_ord;
                }
            }
        }        
        return list;
    }
       
}
