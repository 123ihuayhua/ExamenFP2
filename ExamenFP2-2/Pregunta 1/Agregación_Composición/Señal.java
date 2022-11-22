/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregación_Composición;

/**
 *
 * @author asus
 */
public class Señal {
    
    String tipo_señal;

    public Señal(String tipo_señal) {
        this.tipo_señal = tipo_señal;
    }

    public String getTipo_señal() {
        return tipo_señal;
    }
    
    @Override
    public String toString(){
        return tipo_señal;
    }
}
