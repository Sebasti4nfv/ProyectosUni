
package part;
import View.InterfazFinal;
import Controller.BoletaController;
import View.interfazRegistro;
import View.InterfazProducto;
import Model.Usuario;
import Controller.UsuarioController;
import Model.Boleta;
import View.InterfazBoleta;
import View.InterfazDatos;

public class Part {

    public static void main(String[] args) {
        
        interfazRegistro f = new interfazRegistro();
        Usuario u = new Usuario();
        UsuarioController uc = new UsuarioController(f, u);
        
        
       
    }
    
}
