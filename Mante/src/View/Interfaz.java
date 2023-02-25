
package View;

import java.util.*;
import javax.swing.*;

public class Interfaz  {
    public JFrame f;
    JLabel LProducto,LNombre,LCod,LPrecio,LPeso;
    public JTextField JTNombre,JTCod,JTPrecio,JTPeso;
    public JButton BRegistrar, BEditar, BEliminar, BListar;
    
    public Interfaz(){
        
        f = new JFrame();
        LProducto = new JLabel("PRODUCTO");
        LProducto.setBounds(200,50,100,20);
        
        LNombre = new JLabel("Nombre");
        LNombre.setBounds(50,100,100, 20);
        JTNombre = new JTextField();
        JTNombre.setBounds(150,100,100,20);
        
        LCod = new JLabel("Codigo");
        LCod.setBounds(50,150,100, 20);
        JTCod = new JTextField();
        JTCod.setBounds(150,150,100,20);
        
        LPrecio = new JLabel("Precio");
        LPrecio.setBounds(50,200,100, 20);
        JTPrecio = new JTextField();
        JTPrecio.setBounds(150,200,100,20);
        
        LPeso = new JLabel("Peso");
        LPeso.setBounds(50,250,100, 20);
        JTPeso = new JTextField();
        JTPeso.setBounds(150,250,100,20);
        
        BRegistrar = new JButton("REGISTAR");
        BRegistrar.setBounds(300,100,100,20);
        
        
        BEditar = new JButton("EDITAR");
        BEditar.setBounds(300,150,100,20);
       
        
        BEliminar = new JButton("ELIMINAR");
        BEliminar.setBounds(300,200,100,20);
      
        
        BListar = new JButton("LISTAR");
        BListar.setBounds(300,250,100,20);
        
        
        f.add(LProducto);
        f.add(LNombre);
        f.add(JTNombre);
        f.add(LPeso);
        f.add(JTPeso);
        f.add(LCod);
        f.add(JTCod);
        f.add(LPrecio);
        f.add(JTPrecio);
        f.add(BRegistrar);
        f.add(BEditar);
        f.add(BEliminar);
        f.add(BListar);
        
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }
  
   
}