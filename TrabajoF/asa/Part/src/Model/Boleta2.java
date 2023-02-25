
package Model;


public class Boleta2 {
    private String dni;
    private String tipoHambu;
    private double cantidadP;
    private double precioP;
    private String tipoCrema;
    private double precioFP;
    String cabecera1 [] = {"DNI","Tipo de Hamburguesa", "Cantidad","Precio unitario","Cremas","Precio Total"};
    public Boleta2() {
    }

    public Boleta2(String dni, String tipoHambu, double cantidadP, double precioP, String tipoCrema, double precioFP) {
        this.dni = dni;
        this.tipoHambu = tipoHambu;
        this.cantidadP = cantidadP;
        this.precioP = precioP;
        this.tipoCrema = tipoCrema;
        this.precioFP = precioFP;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipoHambu() {
        return tipoHambu;
    }

    public void setTipoHambu(String tipoHambu) {
        this.tipoHambu = tipoHambu;
    }

    public double getCantidadP() {
        return cantidadP;
    }

    public void setCantidadP(double cantidadP) {
        this.cantidadP = cantidadP;
    }

    public double getPrecioP() {
        return precioP;
    }

    public void setPrecioP(double precioP) {
        this.precioP = precioP;
    }

    public String getTipoCrema() {
        return tipoCrema;
    }

    public void setTipoCrema(String tipoCrema) {
        this.tipoCrema = tipoCrema;
    }

    public double getPrecioFP() {
        return precioFP;
    }

    public void setPrecioFP(double precioFP) {
        this.precioFP = precioFP;
    }
    
    
}
