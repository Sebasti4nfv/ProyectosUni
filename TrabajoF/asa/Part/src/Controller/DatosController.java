
package Controller;

import Model.Boleta;
import Model.Datos;
import View.InterfazBoleta;

import Controller.BoletaController;
import Model.Boleta2;
import Model.Boleta3;

import View.InterfazDatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;


public class DatosController implements ActionListener{
 
    private InterfazDatos View;
    private InterfazBoleta ViewB;
    private Datos Model;
    private Boleta2 Model2;
    private Boleta3 Model3;
    private RandomAccessFile archivo;
     private RandomAccessFile archivo2;
     private RandomAccessFile archivo3;
    private ArrayList<Datos> Lista;
    private ArrayList<Boleta2> Lista2;
    private ArrayList<Boleta3> Lista3;
    private BoletaController bol;
    
    
    public DatosController(InterfazDatos View, Datos Model, Boleta2 Model2, Boleta3 Model3)
    {
      this.View = View;
      this.Model = Model;
      this.Model2 = Model2;
      this.Model3 = Model3;
      
      Lista = new ArrayList<>();
      Lista2 = new ArrayList<>();
      Lista3 = new ArrayList<>();
      
      this.View.bGuardar.addActionListener(this);
      this.View.bTerminar.addActionListener(this);
      
      try{
      
         archivo = new RandomAccessFile("Datos.txt", "rw");
         archivo2 = new RandomAccessFile("producto.txt","rw");
         archivo3 = new RandomAccessFile("bebidas.txt","rw");
         
         Datos();
         Datos2();
         Datos3();
        }catch(Exception ex)
        {
          System.out.println("Error" + ex.toString());
        }
    }
    public void setNombres(String Nombres){Model.setNombres(Nombres);}
    public void setApellidos(String Apellidos){Model.setApellidos(Apellidos);}
    public void setEdad(String Edad){Model.setEdad(Edad);}
    public void setDireccion(String Direccion){Model.setDireccion(Direccion);}
    public String getNombres(){return Model.getNombres();}
    public String getApellidos(){return Model.getApellidos();}
    public String getEdad(){return Model.getEdad();}
    public String getDireccion(){return Model.getDireccion();}
    
    //producto
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
    
    //bebidas
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
    
    public void Archivo()
    {
        try       
        {
           FileWriter fw = new FileWriter("Datos.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw); 
            
            for(Datos datos:Lista)
            {
            String re = datos.getDni()+ ";" +datos.getNombres() + ";" + datos.getApellidos() + ";" + datos.getEdad() + ";" + datos.getDireccion();
            pw.println(re);
            }
            
        }catch(Exception exs){
         System.out.println("ERROR"+exs.toString());
        }
    
    }
    
    public void Agregar(Datos datos){
        try{
            FileWriter fw = new FileWriter("Datos.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Lista.add(datos);
            String re = "Dni:"+ datos.getDni() +";"+ "Nombres:" + datos.getNombres() +";"+"Apellidos:" + datos.getApellidos() +";"+"Edad:" + datos.getEdad()+";"+"Direccion:" + datos.getDireccion();
            pw.append(re+"\n");
            pw.close();
            
        }catch(Exception ex){
            System.out.println("Error"+ex.toString());
        }
    }
    public Object [][] Obtener(){
        Object datos [][] = new Object[Lista.size()][5];
        if(Lista.size() != 0){
            try{
                for(int i=0; i < Lista.size();i++){
                    datos[i][0] = Lista.get(i).getDni();
                    datos[i][1] = Lista.get(i).getNombres();
                    datos[i][2] = Lista.get(i).getApellidos();
                    datos[i][3] = Lista.get(i).getEdad();
                    datos[i][4] = Lista.get(i).getDireccion();
                }
            }catch(Exception ex){
                 System.out.println("Error"+ex.toString());
            }
        }
        
        return datos;
    }
    public Object [][] Obtener2(){
          Object datos1 [][] = new Object[Lista2.size()][6];
          
          if(Lista2.size() != 0){
              try{
                  for(int i = 0; i<Lista2.size(); i++){
                      datos1[i][0] = Lista2.get(i).getDni();
                      datos1[i][1] = Lista2.get(i).getTipoHambu();
                      datos1[i][2] = Lista2.get(i).getCantidadP();
                      datos1[i][3] = Lista2.get(i).getPrecioP();
                      datos1[i][4] = Lista2.get(i).getTipoCrema();
                      datos1[i][5] = Lista2.get(i).getPrecioFP();
                  }
              }catch(Exception ex){
                  System.out.println("Error"+ ex.toString());
              }
          }
          
          return datos1;
    }
    public Object [][] Obtener3(){
          Object datos [][] = new Object[Lista3.size()][6];
          
          if(Lista3.size() != 0){
              try{
                  for(int i = 0; i<Lista3.size(); i++){
                      datos[i][0] = Lista3.get(i).getDni();
                      datos[i][1] = Lista3.get(i).getTipoBebi();
                      datos[i][2] = Lista3.get(i).getCantidadB();
                      datos[i][3] = Lista3.get(i).getPrecioB();
                      datos[i][4] = Lista3.get(i).getCantidadB();
                      datos[i][5] = Lista3.get(i).getPrecioFB();
                  }
              }catch(Exception ex){
                  System.out.println("Error"+ ex.toString());
              }
          }
          
          return datos;
    }
    public void Datos(){
        try{
            String Dni,Nombres, Apellidos,Edad,Direccion;
            BufferedReader br = new BufferedReader(new FileReader("Datos.txt"));
            String l;
            
            while((l = br.readLine())!= null){
                String [] temp = new String [5];
                temp = l.split(";");
                Dni =temp[0];
                Nombres = temp[1];
                Apellidos = temp[2];
                Edad = temp[3];
                Direccion = temp[4];
                
                Datos datos = new Datos(Dni,Nombres,Apellidos,Edad,Direccion);
                Lista.add(datos);
            }
            br.close();
        }catch(Exception ex){
            System.out.println("Error"+ex.toString());
        }
    }
    public void Datos2(){
    
      try
        {
        String Dni, TipoHamburguesa,TipoCrema;
        double cantidadP,precioP,precioPF;
        BufferedReader br2 = new BufferedReader(new FileReader("productos.txt"));
        String ln;
        
        while ((ln = br2.readLine()) != null)
            {
                String[] temp = new String[6];
                temp = ln.split(";");
                Dni = temp[0];
                TipoHamburguesa = temp[1];
                cantidadP = Double.parseDouble(temp[2]);
                precioP = Double.parseDouble(temp[3]);
                TipoCrema = temp[4];
                precioPF = Double.parseDouble(temp[5]);
                
                Boleta2 b2= new Boleta2(Dni,TipoHamburguesa,cantidadP,precioP,TipoCrema,precioPF);
                Lista2.add(b2);
            }
        br2.close();
        }catch(Exception e)
        {
            System.out.println("error:"+e.toString());
        }
    
    }
    public void Datos3(){
    
        try
        {
            String dni,tipoBebida,helado;
            double precio,precioFinal;
            int cantidad;
            BufferedReader br3 = new BufferedReader(new FileReader("bebidas.txt"));
            String l3;
            while((l3 = br3.readLine()) != null){
                String[] temp = new String[6];
                temp = l3.split(";");
                dni = temp[0];
                tipoBebida = temp[1];
                precio = Double.parseDouble(temp[2]);
                cantidad = Integer.parseInt(temp[3]);
                helado = temp[4];
                precioFinal = Double.parseDouble(temp[5]);
                
                Boleta3 bebs = new Boleta3(dni,tipoBebida,precio,cantidad,helado,precioFinal);
                
                Lista3.add(bebs);
            }
            
            br3.close();                  
         }catch(Exception e)
        {
            System.out.println("error:"+e.toString());
        }
    
    }
    
    public String CargarDatosConductor(){
        String[] x = {"Juan \nDni: 73033089 \nEdad: 40 \nNacionalidad: Venezolano \nPlaca: ACJ-765", "Sebastian \nDni:43209865 \nEdad: 25 \nNacionalidad: Peruano \nPlaca: BDP-932", "Villa \nDni:76543265 \nEdad: 34 \nNacionalidad: Chileno \nPlaca: VLA-502", "Jesus \nDni:98765436 \nEdad: 28 \nNacionalidad: Ecuatoriano \nPlaca: POO-345", "Olver \nDni:23456789 \nEdad: 22 \nNacionalidad: Argentino \nPlaca: ARG-936", "Claudia \nDni:09876567 \nEdad: 26 \nNacionalidad:  \nPlaca: TLS-559", "Aura \nDni:72345698 \nEdad: 21 \nNacionalidad: Peruana \nPlaca: DBP-046","Cesar \nDni:72947165 \nEdad: 39 \nNacionalidad: Chino \nPlaca: CPE-421"};
        Random rand = new Random();

        int n = rand.nextInt(7);
        String z = "El conductor es: " + x [n];

        System.out.println(z);
        
        return z;
    }
    
    public void actionPerformed(ActionEvent ex)
    {
        //guardar
        if(ex.getSource() == View.bGuardar){
            String Dni = View.tfDni.getText();
            String Nombres = View.tfNombre.getText();
            String Apellidos = View.tfApellido.getText();
            String Edad = View.tfEdad.getText();
            String Direccion = View.tfDireccion.getText();
            
            
            if (Edad.length()==2){
                Datos datos = new Datos(Dni,Nombres,Apellidos,Edad,Direccion);
                Agregar(datos);
                JOptionPane.showMessageDialog(View.f, "Registro Completado");
            } else {
                JOptionPane.showMessageDialog(View.f, "Has ingresado una edad equivocada");
            }
            
            View.tfNombre.setText("");
            View.tfApellido.setText("");
            View.tfEdad.setText("");
            View.tfDireccion.setText("");
            
            
        }
        
        
        if(ex.getSource()== View.bTerminar)
        {
            
            
                InterfazBoleta d = new InterfazBoleta(View.dni,CargarDatosConductor());
                Boleta d1 = new Boleta();
                BoletaController dc = new BoletaController(d,d1);
                
                Boleta2 d2 = new Boleta2();
                Boleta3 b3 = new Boleta3();
            
                String cabecera3[] = {"DNI","Nombres", "Apellidos","Edad", "Direccion"};
                d.model1.setDataVector(Obtener(), cabecera3);
                d.table1.setModel(d.model1);
        
                String cabecera1 [] = {"DNI","Tipo de Hamburguesa", "Cantidad","Precio unitario","Cremas","Precio Total"};
                d.model2.setDataVector(Obtener2(), cabecera1);
                d.table2.setModel(d.model2);
                
                String cabecera2[] = {"DNI","Tipo de bebidas", "Precio Unitario", "Cantidad","Helada o sin helar", "PrecioFinal"};
                d.model3.setDataVector(Obtener3(), cabecera2);
                d.table3.setModel(d.model3);
        }
    }
}

