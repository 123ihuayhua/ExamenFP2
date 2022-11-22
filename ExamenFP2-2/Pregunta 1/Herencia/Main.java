/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author asus
 */
public class Main {
    
    public static void main (String [] args){
        
        Estudiante est1 = new Estudiante();
        est1.setNombre("Ivan");
        est1.setEdad(18);
        est1.setDni("7020");
        est1.setCurso("FP2");
        est1.setDireccion("Av. Arequipa");
        
        Estudiante est2 = new Estudiante("FP","AV. Alianza","Rober",18,"8020");
        System.out.println(est1.toString());
        System.out.println(est2.toString());
    }
}
