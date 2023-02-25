
package Controller;

import Model.Bebidas;
import Model.Boleta2;
import Model.Boleta3;
import Model.Datos;
import View.InterfazBebidas;
import View.InterfazBoleta;
import View.InterfazDatos;
import View.InterfazProducto;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.*;

public class BebidasController implements ActionListener {
    
    private InterfazBebidas View;
    private Bebidas Model;
    private InterfazProducto p;
    private RandomAccessFile Archivo;
    private ArrayList<Bebidas> bebida;

    
    public BebidasController(InterfazBebidas View, Bebidas Model) {
        this.View = View;
        this.Model = Model;
        
        bebida = new ArrayList<>();
        
        this.View.btSeleccionar.addActionListener(this);
        this.View.btEliminar.addActionListener(this);
        this.View.btExtras.addActionListener(this);
        
        try{
            Archivo =new RandomAccessFile("bebidas.txt","rw");
        }catch(Exception ex){
            System.out.println("Error"+ex.toString());
        }
        
    }
    
    public void setDni(String Dni){Model.setDni(Dni);}
    public void setTipoBebida(String tipoBebida){Model.setTipoBebida(tipoBebida);}
    public void setPrecio(double precio){Model.setPrecio(precio);}
    public void setCantidad(int cantidad){Model.setCantidad(cantidad);}
    public void setHelado(String helado){Model.setHelado(helado);}
    public void setPrecioFinal(double precioFinal){Model.setPrecioFinal(precioFinal);}
    
    public String getDni(){return Model.getDni();}
    public String getTipoBebida(){return Model.getTipoBebida();}
    public double getPrecio(){return Model.getPrecio();}
    public int getCantidad(){return Model.getCantidad();}
    public String getHelado(){return Model.getHelado();}
    public double getPrecioFinal(){return Model.getPrecioFinal();}
    
    public double cb1(){
        double rpta1 = 0;
        
        if(View.cb1.isSelected()){
            String text1 = View.tf1.getText();
            double field1 = Double.parseDouble(text1);
            rpta1 = field1*3;
        }
        
        return rpta1;
        
    }
    
    public double cb2(){
        double rpta2 = 0;
        
        if(View.cb2.isSelected()){
            String text2 = View.tf2.getText();
            double field2 = Double.parseDouble(text2);
            rpta2 = field2*4;
        }
        
        return rpta2;
        
    }
    
    public double cb3(){
        double rpta3 = 0;
        
        if(View.cb3.isSelected()){
            String text3 = View.tf3.getText();
            double field3 = Double.parseDouble(text3);
            rpta3 = field3*4;
        }
        
        return rpta3;
        
    }
    
    public double cb4(){
        double rpta4 = 0;
        
        if(View.cb4.isSelected()){
            String text4 = View.tf4.getText();
            double field4 = Double.parseDouble(text4);
            rpta4 = field4*3;
        }
        
        return rpta4;
        
    }
    
    public double cb5(){
        double rpta5 = 0;
        
        if(View.cb5.isSelected()){
            String text5 = View.tf5.getText();
            double field5 = Double.parseDouble(text5);
            rpta5 = field5*3;
        }
        
        return rpta5;
        
    }
    
    public String combo1(){
        String msg1 = "";
        
        msg1 += View.combo1.getItemAt(View.combo1.getSelectedIndex()); 
                
        return msg1;
    }
    
    public String combo2(){
        String msg2 = "";
        
        msg2 += View.combo2.getItemAt(View.combo2.getSelectedIndex());
                
        return msg2;
    }
    
    public String combo3(){
        String msg3 = "";
        
        msg3 += View.combo3.getItemAt(View.combo3.getSelectedIndex());
                
        return msg3;
    }
    
    public String combo4(){
        String msg4 = "";
        
        msg4 += View.combo4.getItemAt(View.combo4.getSelectedIndex());
                
        return msg4;
    }
    
    public String combo5(){
        String msg5 = "";
        
        msg5 += View.combo5.getItemAt(View.combo5.getSelectedIndex());
                
        return msg5;
    }
 
    
    public void Archivos(){
        
        try{
            FileWriter fwB = new FileWriter("bebidas.txt");
            BufferedWriter bwB = new BufferedWriter(fwB);
            PrintWriter pwB = new PrintWriter(bwB);
            
            for(Bebidas bebs : bebida){
                String imp = bebs.getDni()+";"+bebs.getTipoBebida()+";"+bebs.getPrecio()+";"+bebs.getCantidad()+";"+bebs.getHelado()+";"+bebs.getPrecioFinal();
                        
                pwB.println(imp);
            }
            pwB.close();
            
        }catch(Exception ex){
           System.out.println("Error"+ex.toString());
       }
        
    }
    
    public void addRegistro(Bebidas bebs){
        
        try{
           FileWriter fwB = new FileWriter("bebidas.txt",true);
           BufferedWriter bwB = new BufferedWriter(fwB);
           PrintWriter pwB = new PrintWriter(bwB);
           
           bebida.add(bebs);
           
           String rpta = bebs.getDni()+";"+bebs.getTipoBebida()+";"+bebs.getPrecio()+";"+bebs.getCantidad()+";"+bebs.getHelado()+";"+bebs.getPrecioFinal();
           
           pwB.append(rpta + "\n");
           pwB.close();
            
        }catch(Exception ex){
           System.out.println("Error"+ex.toString());
       }
        
    }
    
    public Bebidas obt(String dni){
        for(int i=0;i<bebida.size();i++){
            if(dni == bebida.get(i).getDni()){
                return bebida.get(i);
            }
        }
        return null;
    }
    
    public void eliminar(String dni){
       int i = 0;
       for(Bebidas bebs : bebida){
           if(dni == bebs.getDni()){
               i = bebida.indexOf(bebs);
           }
       }
       bebida.remove(i);
       Archivos();
    }
    
    public Object [][] Obtener(){
        Object dat [][] = new Object[bebida.size()][5];
        
        if(bebida.size() != 0){
            try{
                
                for(int i = 0; i<bebida.size();i++){
                    
                    dat[i][0] = bebida.get(i).getDni();
                    dat[i][1] = bebida.get(i).getTipoBebida();
                    dat[i][2] = bebida.get(i).getPrecio();
                    dat[i][3] = bebida.get(i).getCantidad();
                    dat[i][4] = bebida.get(i).getHelado();
                    dat[i][5] = bebida.get(i).getPrecioFinal();
                }
                
            }catch(Exception ex){
                  System.out.println("Error"+ ex.toString());
            }
        }
        
        return dat;
        
    }
    
    public void CargarDatos(){
        try{
            String dni,tipoBebida,helado;
            double precio,precioFinal;
            int cantidad;
            
            BufferedReader brB = new BufferedReader(new FileReader("bebidas.txt"));
            String ln;
            
            while((ln = brB.readLine()) != null){
                String[] temp = new String[6];
                temp = ln.split(";");
                dni = temp[0];
                tipoBebida = temp[1];
                precio = Double.parseDouble(temp[2]);
                cantidad = Integer.parseInt(temp[3]);
                helado = temp[4];
                precioFinal = Double.parseDouble(temp[5]);
                
                Bebidas bebs = new Bebidas(dni,tipoBebida,precio,cantidad,helado,precioFinal);
                
                bebida.add(bebs);
            }
            
            brB.close();
            
        }catch(Exception ex){
           System.out.println("Error"+ex.toString());
        }
    }
    
    public void actionPerformed(ActionEvent ex){
        
        if(ex.getSource() == View.btSeleccionar){
            String dni = View.tfDni.getText();
            
            if(View.cb1.isSelected()){
                Bebidas b = new Bebidas(dni,"Agua Mineral",3,Integer.parseInt(View.tf1.getText()),combo1(),cb1());
                addRegistro(b);
            }
            if(View.cb2.isSelected()){
                Bebidas b = new Bebidas(dni,"Inca Kola",4,Integer.parseInt(View.tf2.getText()),combo2(),cb2());
                addRegistro(b);
            }
            if(View.cb3.isSelected()){
                Bebidas b = new Bebidas(dni,"Coca Cola",4,Integer.parseInt(View.tf3.getText()),combo3(),cb3());
                addRegistro(b);
            }
            if(View.cb4.isSelected()){
                Bebidas b = new Bebidas(dni,"Sprite",3,Integer.parseInt(View.tf4.getText()),combo4(),cb4());
                addRegistro(b);
            }
            if(View.cb5.isSelected()){
                Bebidas b = new Bebidas(dni,"Guaraná",3,Integer.parseInt(View.tf5.getText()),combo5(),cb5());
                addRegistro(b);
            }
       
            JOptionPane.showMessageDialog(View.btSeleccionar, "Su bebida fue registrada correctamente!");
        }
        
        if(ex.getSource()== View.btEliminar){
           String dni = JOptionPane.showInputDialog(null,"Ingrese su dni","eliminar",JOptionPane.WARNING_MESSAGE);
           
           eliminar(dni);
           JOptionPane.showMessageDialog(View.btSeleccionar, "Su bebida fue eliminada correctamente!");          
       }
        if(ex.getSource() == View.btExtras){
            String dni = View.tfDni.getText();
                InterfazDatos d = new InterfazDatos(dni);
                Datos d1 = new Datos();
                Boleta2 b2 = new Boleta2();
                Boleta3 b3 = new Boleta3();
                DatosController dc = new DatosController(d,d1,b2,b3);
        }
        
        if(ex.getSource() == View.btAtras){
           View.fb.dispose();
        }
        
    }
    
}


