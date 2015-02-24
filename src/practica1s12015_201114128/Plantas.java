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
public class Plantas {
     Lista_UsuarioPlanta siguiente;
    Lista_UsuarioPlanta anterior;
    
    
    
    
    
     Plantas(){
        siguiente=null;
        anterior=null;
    }
  
    public boolean estavacio(){
        if(siguiente==null){ return true;
        }else{ return false;}
    }
    
     public Plantas SetNombre(String Nombre,int Cantidad,String Campo){
     if(estavacio()){
      Lista_UsuarioPlanta nuevop = new Lista_UsuarioPlanta (Nombre, Cantidad, Campo);
      siguiente=nuevop;
      anterior=nuevop;
      nuevop.siguiente=nuevop;
      nuevop.anterior=nuevop;
     }else{
      Lista_UsuarioPlanta  nuevo = new Lista_UsuarioPlanta(Nombre, Cantidad, Campo);
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
