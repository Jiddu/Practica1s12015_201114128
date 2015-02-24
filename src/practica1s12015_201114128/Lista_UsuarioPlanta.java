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
public class Lista_UsuarioPlanta {

    
    String Nombre;
    int Cantidad;
    String Campo;
    Lista_UsuarioPlanta siguiente;
    Lista_UsuarioPlanta anterior;
    
    public Lista_UsuarioPlanta(String Nombre,int Cantidad, String Campo){
    this.Nombre=Nombre;
    this.Cantidad=Cantidad;
    this.Campo=Campo;
    siguiente=null;
    anterior=null;
    
    } 
    
    
      public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getCampo() {
        return Campo;
    }

    public void setCampo(String Campo) {
        this.Campo = Campo;
    }
    
    
    
}
