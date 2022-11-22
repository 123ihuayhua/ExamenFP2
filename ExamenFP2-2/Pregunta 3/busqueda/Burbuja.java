/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busqueda;

/**
 *
 * @author asus
 */
public class Burbuja {
    
    public static void main (String [] args){
        
        int [] numeros = {10,9,8,7,6,5,4,3,2,1,0};
        int [] num_ord = OrdenarBurbuja(numeros);
        long init = System.nanoTime();
        OrdenarBurbuja(numeros);
        for(int i = 0; i < num_ord.length;i++)
        System.out.println(num_ord[i]);
        long end = System.nanoTime();
        System.out.println((end-init) + " ns");
        
    }
    
    public static int [] OrdenarBurbuja(int [] list){
        int [] num_ord;
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length-1; j++) {
                if (list[j]>list[j+1]) {
                    intercambiar(list, j, j+1);
                }
            }
        }
        num_ord = list;
        return num_ord;
    }
    
   
    private static void intercambiar(int[] list, int j, int i) {
       int temp;
        temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

}
