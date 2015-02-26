/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015_201114128;

/**
 *
 * @author asus
 */
public class NodoZombies {
          
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDatoextra() {
        return datoextra;
    }

    public void setDatoextra(String datoextra) {
        this.datoextra = datoextra;
    }

    public NodoZombies(String Nombre, int cantidad) {
        this.Nombre = Nombre;
        this.cantidad = cantidad;
    }

    public NodoZombies(String datoextra) {
        this.datoextra = datoextra;
    }

 String Nombre;
 int cantidad;
 String datoextra;
 
 
       
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

