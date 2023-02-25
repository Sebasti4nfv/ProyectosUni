package View;

import java.util.*;
import javax.swing.*;

public class Interfaz  {
    public JFrame f;
    JLabel LAvion,LID,LCap,LPasajeros;
    public JTextField JTID,JTCap,JTPasajeros, JTa;
    public JButton BRegistrar, BEditar, BEliminar, BListar, BOcupacidad;
    
    public Interfaz(){
        
        f = new JFrame();
        LAvion = new JLabel("Avion");
        LAvion.setBounds(200,50,100,20);
        
        LID = new JLabel("ID");
        LID.setBounds(50,100,100, 20);
        JTID = new JTextField();
        JTID.setBounds(150,100,100,20);
        
        LCap = new JLabel("CapacidadMaxima");
        LCap.setBounds(50,150,100, 20);
        JTCap = new JTextField();
        JTCap.setBounds(150,150,100,20);
        
        LPasajeros = new JLabel("PasajerosActuales");
        LPasajeros.setBounds(50,200,100, 20);
        JTPasajeros = new JTextField();
        JTPasajeros.setBounds(150,200,100,20);
        
        
        BRegistrar = new JButton("REGISTAR");
        BRegistrar.setBounds(300,100,100,20);
        
        
        BEditar = new JButton("EDITAR");
        BEditar.setBounds(300,150,100,20);
       
        
        BEliminar = new JButton("ELIMINAR");
        BEliminar.setBounds(300,200,100,20);
      
        
        BListar = new JButton("LISTAR");
        BListar.setBounds(300,250,100,20);
        
        BOcupacidad = new JButton("Ocupabilidad");
        BOcupacidad.setBounds(50,250,100,20);
        JTa= new JTextField();
        JTa.setBounds(50,300,100,20);
        
        
        f.add(LAvion);
        f.add(LID);
        f.add(LCap);
        f.add(JTCap);
        f.add(LPasajeros);
        f.add(JTID);
        f.add(JTPasajeros);
        f.add(BRegistrar);
        f.add(BEditar);
        f.add(BEliminar);
        f.add(BListar);
        f.add(BOcupacidad);
        f.add(JTa);
        
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }
  
   
}