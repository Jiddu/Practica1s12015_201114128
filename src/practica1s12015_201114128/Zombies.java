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
public class Zombies {
     Lista_UsuarioZombie siguiente;
    Lista_UsuarioZombie anterior;
    
   Zombies(){
        siguiente=null;
        anterior=null;
    }
  
    public boolean estavacio(){
        if(siguiente==null){ return true;
        }else{ return false;}
    }
    
     public Zombies SetNombre(String Nombre,int Cantidad,String Campo){
     if(estavacio()){
      Lista_UsuarioZombie nuevo = new Lista_UsuarioZombie (Nombre, Cantidad, Campo);
      siguiente=nuevo;
      anterior=nuevo;
      nuevo.siguiente=nuevo;
      nuevo.anterior=nuevo;
     }else{
      Lista_UsuarioZombie  nuevo = new Lista_UsuarioZombie (Nombre, Cantidad, Campo);
      siguiente.siguiente=nuevo;
      nuevo.anterior=anterior;
      anterior=nuevo;//
      siguiente.anterior=anterior;
      anterior.siguiente=siguiente;
      //ultimo=nuevo; 
     }
     return this;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
