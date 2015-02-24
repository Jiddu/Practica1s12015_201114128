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
public class Lista_UsuarioZombie {
    String Nombre;
    int Cantidad;
    String Campo;
    Lista_UsuarioZombie siguiente;
    Lista_UsuarioZombie anterior;
    
    public Lista_UsuarioZombie(String Nombre/*, int Cantidad, String Campo*/){
    this.Nombre=Nombre;
    this.Cantidad=Cantidad;
    this.Campo=Campo;
    siguiente=null;
    anterior=null;
    
    }
    
    
    
    
    
        public String getDatos(){
    
    return Nombre;
           // return Integer.toString(Cantidad);
                  //  return Campo;
    
    }
        
        
        public void setDatos(String Nombre) {
        this.Nombre = Nombre;
    }
        
}
