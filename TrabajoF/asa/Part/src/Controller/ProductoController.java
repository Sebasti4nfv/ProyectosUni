
package Controller;

import Model.Producto;
import Model.Bebidas;
import Controller.BebidasController;
import Model.Boleta;
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

public class ProductoController implements ActionListener{
    
    private InterfazProducto View;
    private Producto Model;
    private RandomAccessFile Archivo;
    private ArrayList<Producto> cosas;
    

    public ProductoController(InterfazProducto View, Producto Model ) {
        this.View = View;
       
        this.Model = Model;
        
        cosas = new ArrayList<>();
        
        this.View.btn1.addActionListener(this);
        this.View.btn2.addActionListener(this);
        this.View.btn3.addActionListener(this);
        
        try{
            Archivo =new RandomAccessFile("productos.txt","rw");
        }catch(Exception ex){
            System.out.println("Error"+ex.toString());
        }
    }
    
   public void setTipoHamburguesa(String TipoHamburguesa){
       Model.setTipoHamburguesa(TipoHamburguesa);
   }
   public void setCantidad(double Cantidad){
       Model.setCantidad(Cantidad);
   }
   public void setPrecio(double Precio){
       Model.setPrecio(Precio);
   }
   public void setTipoCrema(String TipoCrema){
       Model.setTipoCrema(TipoCrema);
   }
   public void setDni(String dni){
       Model.setDni(dni);
   }
   public void setPreciofinal(double Preciofinal){
       Model.setPreciofinal(Preciofinal);
   }
   public String getTipoHamburgesa(){
       return Model.getTipoHamburguesa();
   }
   public double getCantidad(){
       return Model.getCantidad();
   }
   public double getPrecio(){
       return Model.getPrecio();
   }
   public String getTipoCrema(){
       return Model.getTipoCrema();
   }
   public String getDni(){
       return Model.getDni();
   }
   public double getPreciofinal(){
       return Model.getPreciofinal();
   }
   public double c1(){
       double rpt1=0;
       if(View.c1.isSelected()){
           String pff1= View.j1.getText();
           double pf1 = Double.parseDouble(pff1);
           rpt1 = pf1*8;
       }
       return rpt1;
   }
   public double c2(){
       double rpt2=0;
       if(View.c2.isSelected()){
           String pff2= View.j2.getText();
           double pf2 = Double.parseDouble(pff2);
           rpt2 = pf2*10;
       }
       return rpt2;
   }
   public double c3(){
       double rpt3=0;
       if(View.c3.isSelected()){
           String pff3= View.j3.getText();
           double pf3 = Double.parseDouble(pff3);
           rpt3 = pf3*8;
       }
       return rpt3;
   }
   public double c4(){
       double rpt4=0;
       if(View.c4.isSelected()){
           String pff4= View.j4.getText();
           double pf4 = Double.parseDouble(pff4);
           rpt4 = pf4*12;
       }
       return rpt4;
   }
   public double c5(){
       double rpt5=0;
       if(View.c5.isSelected()){
           String pff5= View.j5.getText();
           double pf5 = Double.parseDouble(pff5);
           rpt5 = pf5*15;
       }
       return rpt5;
   }
   
   public String Creamas(){
       
       String msg="";
       if(View.c6.isSelected()){
           msg = msg+",Mayonesa";
       }
       if(View.c7.isSelected()){
           msg= msg+",Ketchup";
       }
       if(View.c8.isSelected()){
           msg= msg+",Mostaza";
       }
       if(View.c9.isSelected()){
           msg = msg + ",Tartara";
       }
       if(View.c10.isSelected()){
           msg= msg+",Golf";
       }
       if(View.c11.isSelected()){
           msg= msg+",Aji";
       }
       if(View.c12.isSelected()){
           msg = msg+"Ninguna";
       }
       msg.substring(1);
       
       return msg;
   }
  
   public void Archivo(){
       try{
           FileWriter fw1 = new FileWriter("productos.txt");
           BufferedWriter bw1 = new BufferedWriter(fw1);
           PrintWriter pw1 = new PrintWriter(bw1);
           
           for(Producto producto : cosas){
               String rpt =producto.getDni()+";"+ producto.getTipoHamburguesa()+";"+producto.getCantidad()+";"+producto.getPrecio()+";"+producto.getTipoCrema()+";"+producto.getPreciofinal();
               pw1.println(rpt);
           }
           pw1.close();
           
       }catch(Exception ex){
           System.out.println("Error"+ex.toString());
       }
   }
   public void AgregarRegistro(Producto producto){
       try{
           FileWriter fw1 = new FileWriter("productos.txt",true);
           BufferedWriter bw1 = new BufferedWriter(fw1);
           PrintWriter pw1 = new PrintWriter(bw1);
           
           cosas.add(producto);
           
           String rpt = producto.getDni()+";"+producto.getTipoHamburguesa()+";"+producto.getCantidad()+";"+producto.getPrecio()+";"+producto.getTipoCrema()+";"+producto.getPreciofinal();
          
          pw1.append(rpt + "\n");
           pw1.close();
           
       }catch(Exception ex){
           System.out.println("Error"+ex.toString());
       }
   }
   public Producto obt(String dni){
       for(int i=0;i<cosas.size();i++){
           if(dni == cosas.get(i).getDni()){
               return cosas.get(i);
           }
       } return null;
   }
   
   public void eliminar(String dni){
       int i = 0;
       for(Producto producto : cosas){
           if(dni == producto.getDni()){
               i = cosas.indexOf(producto);
           }
       }
       cosas.remove(i);
       Archivo();
   }
   public Object [][] Obtener(){
          Object datos [][] = new Object[cosas.size()][5];
          
          if(cosas.size() != 0){
              try{
                  for(int i = 0; i<cosas.size(); i++){
                      datos[i][0] = cosas.get(i).getDni();
                      datos[i][1] = cosas.get(i).getTipoHamburguesa();
                      datos[i][2] = cosas.get(i).getCantidad();
                      datos[i][3] = cosas.get(i).getPrecio();
                      datos[i][4] = cosas.get(i).getTipoCrema();
                      datos[i][5] = cosas.get(i).getPreciofinal();
                  }
              }catch(Exception ex){
                  System.out.println("Error"+ ex.toString());
              }
          }
          
          return datos;
    }
   public void cargar(){
       try{
           String dni,TipoHamburguesa,TipoCrema;
           double cantidad,precio,preciofinal;
           BufferedReader br = new BufferedReader(new FileReader("productos.txt"));
           String l;
           while((l= br.readLine()) !=null){
               String[] temp = new String[6];
               temp = l.split(";");
               dni = temp[0];
               TipoHamburguesa = temp[1];
               cantidad = Double.parseDouble(temp[2]);
               precio = Double.parseDouble(temp[3]);
               TipoCrema = temp[4];
               preciofinal = Double.parseDouble(temp[5]);
               
               Producto producto = new Producto(TipoHamburguesa, cantidad, precio, TipoCrema, dni, preciofinal);
               
               cosas.add(producto);
           }
           
           br.close();
           
       }catch(Exception ex){
           System.out.println("Error"+ex.toString());
       }
   }
   
   
   public void actionPerformed(ActionEvent ex){
        
       if(ex.getSource() == View.btn1){
           
           String dni = View.j6.getText();
           
      
           if(View.c1.isSelected()){
               Producto p = new Producto("Hamburgesa Clasica",8,Integer.parseInt(View.j1.getText()),Creamas(),dni,c1());
               AgregarRegistro(p);
           }
           if(View.c2.isSelected()){
               Producto p = new Producto("Hamburgesa Royal",10,Integer.parseInt(View.j2.getText()),Creamas(),dni,c2());
               AgregarRegistro(p);
           }
           if(View.c3.isSelected()){
               Producto p = new Producto("Pollo Desilachado",8,Integer.parseInt(View.j3.getText()),Creamas(),dni,c3());
               AgregarRegistro(p);
           }
           if(View.c4.isSelected()){
               Producto p = new Producto("Hamburguesa Doble",12,Integer.parseInt(View.j4.getText()),Creamas(),dni,c4());
               AgregarRegistro(p);
           }
           if(View.c5.isSelected()){
               Producto p = new Producto("Hamburguesa Especial",15,Integer.parseInt(View.j5.getText()),Creamas(),dni,c5());
               AgregarRegistro(p);
           }
           
           JOptionPane.showMessageDialog(View.btn1, "Su producto fue registrado correctamente!");
           
       }
       if(ex.getSource()== View.btn2){
           String dni = JOptionPane.showInputDialog(null,"Ingrese su dni","eliminar",JOptionPane.WARNING_MESSAGE);
           
           eliminar(dni);
           
           JOptionPane.showMessageDialog(View.btn2, "Su producto fue eliminado correctamente!");
           
       }
       if(ex.getSource() == View.btn3){
           
           int valor = JOptionPane.showConfirmDialog(View.btn3,"Desea alguna bebida?");
        
           String dni = View.j6.getText();
            if(valor == JOptionPane.YES_OPTION){
                InterfazBebidas ib = new InterfazBebidas(View.dni);
                Bebidas b = new Bebidas();
                BebidasController bc = new BebidasController(ib,b);
            }else{
                InterfazDatos d = new InterfazDatos(dni);
                Datos d1 = new Datos();
                Boleta2 b2 = new Boleta2();
                Boleta3 b3 = new Boleta3();
                DatosController dc = new DatosController(d,d1,b2,b3);
                
                
            }
            
           
       }
     
    }
  
      
    
}
