
package Model;

import java.util.ArrayList;


public class Usuario {
    
    private String DNI;
    private String Password;

    public Usuario() {
    }

    public Usuario(String DNI, String Password) {
        this.DNI = DNI;
        this.Password = Password;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

   
    
    public void Registro(ArrayList<Usuario> arrayUsuario, String DNI, String Password){
        
        Usuario u = new Usuario(DNI, Password);
        
        arrayUsuario.add(u);
    }
}
