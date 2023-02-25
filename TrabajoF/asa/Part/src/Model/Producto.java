
package Model;
import java.util.ArrayList;
    
public class Producto {
    
   private String TipoHamburguesa;
   private double Cantidad;
   private double Precio;
   private String TipoCrema;
   private String dni;
   private double preciofinal;

    public Producto() {
    }

    public Producto(String TipoHamburguesa, double Cantidad, double Precio, String TipoCrema, String dni, double preciofinal) {
        this.TipoHamburguesa = TipoHamburguesa;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.TipoCrema = TipoCrema;
        this.dni = dni;
        this.preciofinal = preciofinal;
    }

    public String getTipoHamburguesa() {
        return TipoHamburguesa;
    }

    public void setTipoHamburguesa(String TipoHamburguesa) {
        this.TipoHamburguesa = TipoHamburguesa;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getTipoCrema() {
        return TipoCrema;
    }

    public void setTipoCrema(String TipoCrema) {
        this.TipoCrema = TipoCrema;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPreciofinal() {
        return preciofinal;
    }

    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }
            
    
    
}
