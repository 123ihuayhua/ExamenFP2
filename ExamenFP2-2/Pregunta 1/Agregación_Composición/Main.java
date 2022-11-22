/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregación_Composición;

/**
 *
 * @author asus
 */
public class Main {
    
    public static void main (String [] args){
        
       Energia eng1 = new Energia (80,"OFF","LG","80 pg", "negro");
       Energia eng2 = new Energia (90,"ON","Samsumg","70 pg", "gris");
       
       Señal señal1 = new Señal ("Decodificador");
       Señal señal2 = new Señal ("Nada");
       
        if (eng1.energia.equals("OFF")) {
            System.out.println(eng1.toString());
            System.out.println("TV apagada");
            System.out.println("Usando: " + señal1.toString());
        }else if(eng2.energia.equals("ON")){
            System.out.println(eng2.toString());
            System.out.println("TV encendida");
            System.out.println("Usando: " + señal2.toString());
        }
    }
}
