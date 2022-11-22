/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregación_Composición;

/**
 *
 * @author asus
 */
public class Energia extends Televisor{
    
    int cant_energia;
    String energia;

    public Energia(int cant_energia, String energia, String marca, String tamaño, String color) {
        super(marca, tamaño, color);
        this.cant_energia = cant_energia;
        this.energia = energia;
    }

    public int getCant_energia() {
        return cant_energia;
    }
    
    public String getEnergia(String energia){
        return energia;
    }
    
    @Override
    public String toString(){
        return "Televisor -> " + " Marca: " + marca + " Tamaño: " + tamaño + 
                " Color: " + color + " Ctdad Energia Req. : " + cant_energia + " Estado: " + energia;
    }
}
