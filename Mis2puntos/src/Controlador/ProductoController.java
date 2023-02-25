
package Controlador ;

import Modelo.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ProductoController implements ActionListener{
    
    ArrayList <Producto> ProducModel = new ArrayList();
    
    public ProductoController()
    {
        
    }
    public void crearArrayList()
    {
     ProducModel = new ArrayList();
    }
    public void ingresarProducto(Producto produc)
    {
     ProducModel.add(produc);
    }
    public String devolverDatos()
    {
        String reporte ="";
        for (int contador =1; contador<ProducModel.size(); contador++)
        {
        reporte= " Registrar conductor \n" + ProducModel.get(contador).toString() + "\n";
                
        }
        
        return reporte;
    }
   
    public void actionPerformed (ActionEvent e)
    {
    
    }
}
