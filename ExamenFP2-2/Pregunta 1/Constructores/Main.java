/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_fp2_2.Constructores;

/**
 *
 * @author asus
 */
public class Main {
    
    public static void main (String [] args){
        
        Pais pais1 = new Pais("Peru","America","Lima","Nuevo sol");
        Pais pais2 = new Pais();
        
        pais2.setNombre("Canada");
        pais2.setContinente("America");
        pais2.setCapital("Otawa");
        pais2.setMoneda("Dolar canadiense");
        System.out.println(pais1.toString());
        System.out.println(pais2.toString());
    }
}
