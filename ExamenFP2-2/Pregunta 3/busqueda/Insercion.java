/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busqueda;

/**
 *
 * @author asus
 */
public class Insercion {
    
    public static void main(String [] args){
        int [] numeros = {10,9,8,7,6,5,4,3,2,1,0};
        int [] num_ord = Insercion(numeros);
        long init = System.nanoTime();
        Insercion(numeros);
        for(int i = 0; i < num_ord.length;i++)
        System.out.println(num_ord[i]);
        long end = System.nanoTime();
        System.out.println((end-init) + " ns");
    }
    
    public static int [] Insercion(int [] list){
        int aux;
        for (int i = 1; i < list.length; i++) {
            aux = list[i];
            for (int j = i-1; j >=0 && list[j]>aux; j--) {
                list[j+1]=list[j];
                list[j]=aux;
            }
        }
        return list;
    }
}
