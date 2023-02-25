
package Controller;

import Model.Avion;
import View.Interfaz;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class avionController implements ActionListener{
    
    private  Interfaz View;
    private Avion Model;
    ArrayList<Avion> holi;
    
    public avionController( Interfaz View, Avion Model){
        
        this.Model = Model;
        this.View = View;
        
        holi = new ArrayList<>();
        
        this.View.BRegistrar.addActionListener(this);
        this.View.BListar.addActionListener(this);
        this.View.BEliminar.addActionListener(this);
        this.View.BEditar.addActionListener(this);
        this.View.BOcupacidad.addActionListener(this);
        
    }
    public void setId(String Id){
        Model.setId(Id);
    }
    public void setCapacidadMaxima(int CapacidadMaxima){
        Model.setCapacidadMaxima(CapacidadMaxima);
    }
    public void setPasajeros(Double Pasajeros){
        Model.setPasajeros(Pasajeros);
    }
    public String getId(){
        return Model.getId();
    }
    public int getCapacidadMaxima(){
        return Model.getCapacidadMaxima();
    }
    public double getPasajeros(){
        return Model.getPasajeros();
    }
    @Override
    
    public void actionPerformed(ActionEvent ex){
        if(ex.getSource() == View.BRegistrar){
            String Id = View.JTID.getText();
            int CapacidadMaxima = Integer.parseInt(View.JTCap.getText());
            double Pasajeros = Double.parseDouble(View.JTPasajeros.getText());
            
            Model.Registro(holi, Id, CapacidadMaxima, Pasajeros);
            
            View.JTID.setText("");
            View.JTCap.setText("");
            View.JTPasajeros.setText("");
        }
        if(ex.getSource() == View.BListar){
            String rpt;
           
            rpt = Model.Listar(holi);
            JOptionPane.showMessageDialog(View.f, rpt);
        }
        if(ex.getSource() == View.BEliminar){
              String Id="";
            
           Id = JOptionPane.showInputDialog(View.f, "Ingrese el Id");
           
           Model.delate(holi, Id);
        }
        if(ex.getSource() == View.BEditar){
            String Id="";
            int CapacidadMaxima=0;
            double Pasajeros =0;
            
            Id =JOptionPane.showInputDialog(View.f, "Ingresa el codigo a modificar: ");
            CapacidadMaxima = Integer.parseInt(JOptionPane.showInputDialog(View.f, "Ingresa la capaciad a modificar: "));
            Pasajeros = Double.parseDouble(JOptionPane.showInputDialog(View.f, "Ingresa la cantidad a modificar: "));
            
            Model.edit(holi, Id, CapacidadMaxima, Pasajeros);
        }
        if(ex.getSource()== View.BOcupacidad){
            int cap = Integer.parseInt(View.JTCap.getText());
            double pas = Double.parseDouble(View.JTPasajeros.getText());
            double porce= (pas/cap)*100;
            
            View.JTa.setText(porce+ "%");
        }
    }
     public void archivoGuardar(){
            
            try {
                FileWriter fw = new FileWriter("Avion.txt");
                PrintWriter pw = new PrintWriter(fw);
                
                for (Avion x: holi){
                    pw.write(""+x.getId());
                    pw.write(";"+x.getCapacidadMaxima());
                    pw.write(";"+x.getPasajeros());
                    
                }    
                pw.close();

            } catch (IOException ex) {
                System.out.println("Hubo un error: " + ex.getMessage());
            }
        System.out.println("Archivos guardados");
        
    }
    
 
}
