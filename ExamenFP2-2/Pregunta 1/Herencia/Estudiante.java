/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author asus
 */
public class Estudiante extends Persona{
    
    private String curso;
    private String direccion;

    public Estudiante(String curso, String direccion, String nombre, int edad, String dni) {
        super(nombre, edad, dni);
        this.curso = curso;
        this.direccion = direccion;
    }

    public Estudiante() {
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
         return nombre + " -> Edad: " + edad + " DNI: " + dni + " Curso: " + curso + " Direccion: " + direccion;
    }
    
    
    
}
