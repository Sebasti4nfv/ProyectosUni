
package Model;


public class Boleta3 {
    private String dni;
    private String tipoBebi;
    private double precioB;
    private int cantidadB;
    private String helado;
    private double precioFB;
    String cabecera2[] = {"DNI","Tipo de bebidas", "Precio Unitario", "Cantidad","Helada o sin helar", "PrecioFinal"};
    public Boleta3() {
    }

    public Boleta3(String dni, String tipoBebi, double precioB, int cantidadB, String helado, double precioFB) {
        this.dni = dni;
        this.tipoBebi = tipoBebi;
        this.precioB = precioB;
        this.cantidadB = cantidadB;
        this.helado = helado;
        this.precioFB = precioFB;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipoBebi() {
        return tipoBebi;
    }

    public void setTipoBebi(String tipoBebi) {
        this.tipoBebi = tipoBebi;
    }

    public double getPrecioB() {
        return precioB;
    }

    public void setPrecioB(double precioB) {
        this.precioB = precioB;
    }

    public int getCantidadB() {
        return cantidadB;
    }

    public void setCantidadB(int cantidadB) {
        this.cantidadB = cantidadB;
    }

    public String getHelado() {
        return helado;
    }

    public void setHelado(String helado) {
        this.helado = helado;
    }

    public double getPrecioFB() {
        return precioFB;
    }

    public void setPrecioFB(double precioFB) {
        this.precioFB = precioFB;
    }
    
    
}
