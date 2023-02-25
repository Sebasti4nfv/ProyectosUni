
package Controller;

import Model.Bebidas;
import Model.Boleta;
import Model.Boleta2;
import Model.Boleta3;
import Model.Producto;
import View.InterfazBoleta;
import View.InterfazFinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class BoletaController implements ActionListener{
    private Boleta Model;
    private Boleta2 Model2;
    private Boleta3 Model3;
    private InterfazBoleta View;
    private RandomAccessFile Archivo1;
    private RandomAccessFile Archivo2;
    private RandomAccessFile Archivo3;
    private ArrayList<Boleta> todo1;
    private ArrayList<Boleta2> todo2;
    private ArrayList<Boleta3> todo3;

    public BoletaController(InterfazBoleta View, Boleta Model)
    {
    this.View = View;
    this.Model = Model;
    
    todo1 = new ArrayList<>();
    todo2 = new ArrayList<>();
    todo3 = new ArrayList<>();
    
    this.View.bFinalizar.addActionListener(this);
    
    
    try{
        Archivo1 = new RandomAccessFile("productos.txt","rw");
        Archivo2 = new RandomAccessFile("bebidas.txt","rw");
        Archivo3 = new RandomAccessFile("Datos.txt", "rw");
        }catch(Exception ex){
            System.out.println("Error"+ex.toString());
        }
    }
    public void setDni(String Dni){Model.setDni(Dni);}
    public String getDni(){return Model.getDni();}
    
    public void setNombre(String Nombre){Model.setNombre(Nombre);}
    public String getNombre(){return Model.getNombre();}
    
    public void setApellido(String Apellidos){Model.setApellidos(Apellidos);}
    public String getApellido(){return Model.getApellidos();}
    
    public void setEdad(String edad){Model.setEdad(edad);}
    public String getEdad(){return Model.getEdad();}
    
    public void setDireccion(String Direccion){Model.setDireccion(Direccion);}
    public String getDireccion(){return Model.getDireccion();}
    
    //
    public void setTipoHambur(String tipoHambu){Model2.setTipoHambu(tipoHambu);}
    public String getTipoHambur(){return Model2.getTipoHambu();}
    
    public void setCantidadP(double cantidadP){Model2.setCantidadP(cantidadP);}
    public double getCantidadP(){return Model2.getCantidadP();}
    
    public void setPrecioP(double precioP){Model2.setPrecioP(precioP);}
    public double getPrecioP(){return Model2.getPrecioP();}
    
    public void setTipoCrema(String tipoCrema){Model2.setTipoCrema(tipoCrema);}
    public String getTipoCrema(){return Model2.getTipoCrema();}
    
    public void setPrecioFP(double precioFP){Model2.setPrecioP(precioFP);}
    public double getPrecioFP(){return Model2.getPrecioFP();}
    
    //
    
    public void setTipoBebida(String tipoBebida){Model3.setTipoBebi(tipoBebida);}
    public String getTipoBebida(){return Model3.getTipoBebi();}
    
    public void setPrecioB(double precioB){Model3.setPrecioB(precioB);}
    public double getPrecioB(){return Model3.getPrecioB();}
    
    public void setCantidadb(int cantidadB){Model3.setCantidadB(cantidadB);}
    public int getCantidadB(){return Model3.getCantidadB();}
    
    public void setHelado(String helado){Model3.setHelado(helado);}
    public String getHelado(){return Model3.getHelado();}
    
    public void setPrecioFb(double precioFB){Model3.setPrecioB(precioFB);}
    public double getPrecioFB(){return Model3.getPrecioFB();}
    
    
    public Object [][] Obtener1(){
        Object dat [][] = new Object[todo1.size()][5];
        
        if(todo1.size() != 0){
            try{
                
                for(int i = 0; i<todo1.size();i++){
                    
                    dat[i][0] = todo1.get(i).getDni();
                    dat[i][1] = todo1.get(i).getNombre();
                    dat[i][2] = todo1.get(i).getApellidos();
                    dat[i][3] = todo1.get(i).getEdad();
                    dat[i][4] = todo1.get(i).getDireccion();
                    
                }
                
            }catch(Exception ex){
                  System.out.println("Error"+ ex.toString());
            }
        }
        
        return dat;
        
    }
    /*public Object [][] Obtener2(){
          Object datos [][] = new Object[todo2.size()][6];
          
          if(todo2.size() != 0){
              try{
                  for(int i = 0; i<todo2.size(); i++){
                      datos[i][0] = todo2.get(i).getDni();
                      datos[i][1] = todo2.get(i).getTipoHambu();
                      datos[i][2] = todo2.get(i).getCantidadP();
                      datos[i][3] = todo2.get(i).getPrecioP();
                      datos[i][4] = todo2.get(i).getTipoCrema();
                      datos[i][5] = todo2.get(i).getPrecioFP();
                  }
              }catch(Exception ex){
                  System.out.println("Error"+ ex.toString());
              }
          }
          
          return datos;
    }*/
    
   /* public Object [][] Obtener3(){
          Object datos [][] = new Object[todo3.size()][5];
          
          if(todo3.size() != 0){
              try{
                  for(int i = 0; i<todo3.size(); i++){
                      datos[i][0] = todo3.get(i).getDni();
                      datos[i][1] = todo3.get(i).getTipoBebi();
                      datos[i][2] = todo3.get(i).getCantidadB();
                      datos[i][3] = todo3.get(i).getPrecioB();
                      datos[i][4] = todo3.get(i).getCantidadB();
                      datos[i][5] = todo3.get(i).getPrecioFB();
                  }
              }catch(Exception ex){
                  System.out.println("Error"+ ex.toString());
              }
          }
          
          return datos;
    }*/
    
    
    public void cargardatos1()
    {
        try
        {
            String dni,nombres,apellidos,edad,direccion,TipoHamburguesa,TipoCrema,tipoBebida, helado;
            double cantidadP, precioP, precioPF,precio,precioFinal;
            int cantidad;
                                
            
            BufferedReader br = new BufferedReader(new FileReader("Datos.txt"));
            //BufferedReader br2 = new BufferedReader(new FileReader("Producto.txt"));
            // br3 = new BufferedReader(new FileReader("bebidas.txt"));
            String ln,l2,l3;
            
            
            while((ln = br.readLine()) !=null)
            {
                String[] temp = new String[5];
                temp = ln.split(";");
                dni = temp[0];
                nombres = temp[1];
                apellidos = temp[2];
                edad = temp[3];
                direccion = temp[4];
                 Boleta bl = new Boleta(dni,nombres,apellidos,edad,direccion);
                 todo1.add(bl);
            }
           /* while ((l2 = br2.readLine()) != null)
            {
                String[] temp = new String[6];
                temp = ln.split(";");
                dni = temp[0];
                TipoHamburguesa = temp[1];
                cantidadP = Double.parseDouble(temp[2]);
                precioP = Double.parseDouble(temp[3]);
                TipoCrema = temp[4];
                precioPF = Double.parseDouble(temp[5]);
                
                Boleta2 b2= new Boleta2(dni,TipoHamburguesa,cantidadP,precioP,TipoCrema,precioPF);
                todo2.add(b2);
            }*/
           /* while((l3 = br3.readLine()) != null){
                String[] temp = new String[6];
                temp = ln.split(";");
                dni = temp[0];
                tipoBebida = temp[1];
                precio = Double.parseDouble(temp[2]);
                cantidad = Integer.parseInt(temp[3]);
                helado = temp[4];
                precioFinal = Double.parseDouble(temp[5]);
                
                Boleta3 bebs = new Boleta3(dni,tipoBebida,precio,cantidad,helado,precioFinal);
                
                todo3.add(bebs);
            }*/
            
            
            
            br.close();
           /* br2.close();
            br3.close();*/
        }catch(Exception e)
        {
            System.out.println("error:"+e.toString());
        }
        
       // String todo = "Hola" + todo1 + "" + todo2 + "" + todo3;
        
        
    }
    
   // String i = "" + Obtener1() + Obtener2() + Obtener3();
    
    public void actionPerformed(ActionEvent ex){
        if (ex.getSource()==View.bFinalizar)
        {
            InterfazFinal i = new InterfazFinal();
            
            
            /*File archivo,archivo2,archivo3;
            try{
                archivo = new File("productos.txt");
                
                if(!archivo.exists())
                {
                    System.out.println("No existe");
                
                }
                else
                {
                archivo.delete();
                }
            
            
            
            }catch(Exception e)
            {
                System.out.println(e);
            }
                  */  
            
            //JOptionPane.showMessageDialog(View.bFinalizar, i);
            
            /*probando = new probando1();
            
            
            String cabecera3[] = {"DNI","Nombres", "Apellidos","Edad", "Direccion"};
            probando.model1.setDataVector(Obtener1(), cabecera3);
            probando.table1.setModel(View.model1);*/
            
            /*String cabecera1 [] = {"DNI","Tipo de Hamburguesa", "Cantidad","Precio unitario","Cremas","Precio Total"};
            probando.model2.setDataVector(Obtener2(), cabecera1);
            probando.table2.setModel(View.model2);
            
            String cabecera2[] = {"DNI","Tipo de bebidas", "Precio Unitario", "Cantidad","Helada o sin helar", "PrecioFinal"};
            probando.model3.setDataVector(Obtener3(), cabecera2);
            probando.table3.setModel(View.model3);*/
            
            
            /*try { 
                FileReader fr1= new FileReader("productos.txt");
                BufferedReader br1 = new BufferedReader(fr1);
                String t = "";
                String linea=""; 
                while(((linea = br1.readLine()) != null))
                {
                    t += linea + "\n";
                }
                View.taDatos.setText(t);
                       
            } catch (FileNotFoundException ex1) {
                Logger.getLogger(BoletaController.class.getName()).log(Level.SEVERE, null, ex1);
            } catch (IOException ex1) {
                Logger.getLogger(BoletaController.class.getName()).log(Level.SEVERE, null, ex1);
            }*/
        }
    }
    
}

