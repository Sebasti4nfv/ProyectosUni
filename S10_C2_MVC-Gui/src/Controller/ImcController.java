/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.ImcView;
import Model.IMC;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
/**
 *
 * @author alumnoc2laba70505
 */
public class ImcController implements ActionListener {
    
    private final ImcView view;
    private final IMC model;

    public ImcController(ImcView view, IMC model) {
        this.view = view;
        this.model = model;
        this.view.btnCalcular.addActionListener(this); //añadir el action listener del boton
    }
    
    public void setPeso(double p){
        model.setPeso(p);
    }
    public void getPeso(){
        model.getPeso();
    }   
    public void setAltura(double h){
        model.setAltura(h);
    }
    public void getAltura(){
        model.getAltura();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){ //action performed jalando datos del view
        double peso = Double.parseDouble(view.txtPeso.getText());
        model.setPeso(peso);
        double altura = Double.parseDouble(view.txtAltura.getText()); 
        model.setAltura(altura);
        showView();
        try{
            //if(view.txtPeso.getText().matches("[0-9]*") && view.txtAltura.getText().matches("[0-9]*")){
                File file = new File("Imc.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                //}
                FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.write("Peso: " + model.getPeso() + " ");
                    bw.write("Altura: " + model.getAltura() + " ");
                    bw.write("Imc: " + model.getImc() + " ");
                    bw.write("Estado: " + model.getEstado() + " ");
                    bw.write("\n");
                }
            /*else{
                System.out.println("raaa");
                view.Error();
            }*/
            
        }catch(IOException ex){System.out.println("Error: " + ex.getMessage());}
    }
    
    public void showView(){
        view.verImc(model.getPeso(), model.getAltura(), model.getImc(), model.getEstado());
    } 
}
    
    