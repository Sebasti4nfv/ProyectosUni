
package Model;


public class Bebidas {
    
    public String dni;
    public String tipoBebida;
    public double precio;
    public int cantidad;
    public String helado;
    public double precioFinal;

    public Bebidas() {
    }

    public Bebidas(String dni, String tipoBebida, double precio, int cantidad, String helado, double precioFinal) {
        this.dni = dni;
        this.tipoBebida = tipoBebida;
        this.precio = precio;
        this.cantidad = cantidad;
        this.helado = helado;
        this.precioFinal = precioFinal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(String tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getHelado() {
        return helado;
    }

    public void setHelado(String helado) {
        this.helado = helado;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    
    
}
