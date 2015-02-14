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
public class UsuarioPlanta {

    public UsuarioPlanta(String nombre, int cantidad, String descripcion) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
       
    }
    
    String nombre;
    int cantidad;
    String descripcion;
    //punteros 
    
    UsuarioPlanta derecho;
    UsuarioPlanta izquierdo;
    
    public void verificacion(){
        System.out.println("ingreso de un registro");
    }
    
}
