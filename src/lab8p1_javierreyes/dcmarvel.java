/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_javierreyes;

/**
 *
 * @author Javier Reyes
 */
public class dcmarvel {
     public String nombre;
    public String nombrereal;
    public String ciudadorigen;
    public String franquicia;
    public String tipo;
    public int daño;

    //mutadores
    public int getdaño() {
        return daño;
    }

    public void setVolumen(int volumen) {
        this.daño = daño;
    }
//constructores

    public dcmarvel() {
    }

    public dcmarvel(String nombre, String nombrereal, String ciudadorigen, String franquicia) {
        this.nombre = nombre;
        this.nombrereal = nombrereal;
        this.ciudadorigen = ciudadorigen;
        this.franquicia = franquicia;
        this.tipo = tipo;
    }

    public void mensaje() {
        System.out.println(this.nombre + "  " + this.nombrereal + ".");
        System.out.println("");
        System.out.println("es una " + this.tipo + " del genero " + this.ciudadorigen);
        System.out.println("con una duracion de minutos, del canal " + this.franquicia);
    }
    
    
    
    
    
}
