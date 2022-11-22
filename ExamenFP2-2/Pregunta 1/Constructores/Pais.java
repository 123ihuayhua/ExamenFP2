/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_fp2_2.Constructores;

/**
 *
 * @author asus
 */
public class Pais {
    String nombre;
    String Continente;
    String capital;
    String Moneda;

    public Pais(String nombre, String Continente, String capital, String Moneda) {
        this.nombre = nombre;
        this.Continente = Continente;
        this.capital = capital;
        this.Moneda = Moneda;
    }

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return Continente;
    }

    public void setContinente(String Continente) {
        this.Continente = Continente;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getMoneda() {
        return Moneda;
    }

    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }
    
    @Override
    public String toString() {
         return nombre + " -> Continente: " + Continente + " Capital: " + capital + " Moneda: " + Moneda;
    }
    
    
}

