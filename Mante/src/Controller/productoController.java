
package Controller;

import Model.producto;
import View.Interfaz;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class productoController implements ActionListener {
    
   
    private final Interfaz View;
    private final producto Model;
    ArrayList<producto> tuti;
    
    public productoController(Interfaz View, producto Model){
        this.Model = Model;
        this.View = View;
        tuti = new ArrayList<>();
        
        
        this.View.BRegistrar.addActionListener(this);
        this.View.BListar.addActionListener(this);
        this.View.BEliminar.addActionListener(this);
        this.View.BEditar.addActionListener(this);
        
    }

  
    public void setNombre(String Nombre){
        Model.setNombre(Nombre);
    }
    public void setCodigo(String Codigo){
        Model.setCodigo(Codigo);
    }
    public void setPrecio(String Precio){
        Model.setPrecio(Precio);
    }
    public void setPeso(String Peso){
        Model.setPeso(Peso);
    }
    public String getNombre(){
        return Model.getNombre();
    }
    public String getCodigo(){
        return Model.getCodigo();
    }
    public String getPrecio(){
        return Model.getPrecio();
    }
    public String getPeso(){
        return Model.getPeso();
    }
    @Override
    public void actionPerformed(ActionEvent ex){
        
        
        if(ex.getSource() == View.BRegistrar){
            String nom = View.JTNombre.getText();
            String cod = View.JTCod.getText();
            String pre = View.JTPrecio.getText();
            String pe = View.JTPeso.getText();
            
            Model.Registro(tuti, nom, cod, pre, pe);
            
            View.JTCod.setText("");
            View.JTNombre.setText("");
            View.JTPrecio.setText("");
            View.JTPeso.setText("");
            
        }
        if(ex.getSource() == View.BListar){
            
            
            String rpt;
            
            rpt = Model.Listar(tuti);
            JOptionPane.showMessageDialog(View.f, rpt);
        }
        if(ex.getSource() == View.BEliminar){
            
         
            String Codigo="";
            
           Codigo = JOptionPane.showInputDialog(View.f, "Ingrese el codigo");
           
           Model.delate(tuti, Codigo);
            
        }
        if(ex.getSource() == View.BEditar){
            String Nombre="";
            String Codigo="";
            String Precio="";
            String Peso="";
        
           Codigo = JOptionPane.showInputDialog(View.f, "Ingrese el codigo");
           Nombre = JOptionPane.showInputDialog(View.f, "Ingrese el nombre:");
           Precio = JOptionPane.showInputDialog(View.f ,"Ingre el precio");
           Peso = JOptionPane.showInputDialog(View.f , "Ingreso el peso");
           
           Model.edit(tuti, Nombre, Codigo, Precio, Peso );
           
        }
    }
    
}