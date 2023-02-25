
package Model;


public class Boleta {
  
    public String datosConductor;
    
    //datos usuario
    private String dni;
    private String nombre;
    private String apellidos;
    private String edad;
    private String direccion;
    
    
    String cabecera3[] = {"DNI","Nombres", "Apellidos","Edad", "Direccion"};
    public Boleta() {
    }
    
    public Boleta(String dni, String datosConductor) {
        this.dni = dni;
        this.datosConductor = datosConductor;
    }

    public Boleta(String dni, String nombre, String apellidos, String edad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDatosConductor() {
        return datosConductor;
    }

    public void setDatosConductor(String datosConductor) {
        this.datosConductor = datosConductor;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String[] getCabecera3() {
        return cabecera3;
    }

    public void setCabecera3(String[] cabecera3) {
        this.cabecera3 = cabecera3;
    }
    
    
}
