
package practica1s12015_201114128;

/**
 *
 * @author asus
 */
public class NodoPlantas {

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

    public NodoPlantas(String Nombre, int cantidad) {
        this.Nombre = Nombre;
        this.cantidad = cantidad;
    }

    public NodoPlantas(String datoextra) {
        this.datoextra = datoextra;
    }

 String Nombre;
 int cantidad;
 String datoextra;
 
 
  
   
    
}
