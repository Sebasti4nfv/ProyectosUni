
package tarea1;

public class cConductor {
    int conductor,numCelular;
    String nombre, placa, tipoV;

    public cConductor(int conductor, String nombre, String placa, int numCelular, String tipoV) {
        this.conductor = conductor;
        this.nombre = nombre;
        this.placa = placa;
        this.numCelular = numCelular;
        this.tipoV = tipoV;
    }

    public int getConductor() {
        return conductor;
    }

    public void setConductor(int conductor) {
        this.conductor = conductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }
    public String getTipoV() {
        return tipoV;
    }

    public void setTipoV(String tipoV) {
        this.tipoV = tipoV;
    }

    @Override
    public String toString() {
        return "LISTA DE DATOS:"+ "\n" + "Código del conductor:" + conductor + "\n"+ "Nombre del Conductor:" + nombre + "\n" + "Placa del vehiculo:" + placa + "\n" + "Número de telefono:" + numCelular +
                "\n" + "Tipo de vehiculo:" + tipoV + "\n";
    }

    
   
}
