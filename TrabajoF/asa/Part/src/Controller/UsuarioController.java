
package Controller;

import Model.Usuario;
import Model.Producto;
import View.interfazRegistro;
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

public class UsuarioController implements ActionListener  {
    
    private interfazRegistro View;
    private Usuario Model;
    private RandomAccessFile Archivito;
    private ArrayList<Usuario> Lista;

    public UsuarioController(interfazRegistro View, Usuario Model) {
        this.View = View;
        this.Model = Model;
        
        Lista = new ArrayList<>();
        
        
        this.View.Bregistrar.addActionListener(this);
        this.View.Bloguin.addActionListener(this);
        
        try{
            Archivito = new RandomAccessFile("usuarios.txt","rw");
            Datos();
        }catch(Exception ex){
            System.out.println("Error"+ex.toString());
        }
    }
    
    public void setDNI(String DNI){
        Model.setDNI(DNI);
    }
    public void setPassword(String Password){
        Model.setPassword(Password);
    }
    public String getDNI(){
        return Model.getDNI();
    }
    public String getPassword(){
        return Model.getPassword();
    }
    
    public void Archivo(){
        try{
            FileWriter fw = new FileWriter("usuarios.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            
            for(Usuario usuario:Lista){
            String re = usuario.getDNI()+";"+usuario.getPassword();
             pw.println(re);
        }
            pw.close();
        }catch(Exception exs){
            System.out.println("ERROR"+exs.toString());
        }
    }
    public void Agregar(Usuario usuario){
        try{
            FileWriter fw = new FileWriter("usuarios.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Lista.add(usuario);
            String re = "DNI:"+usuario.getDNI()+";"+"Password:"+usuario.getPassword();
            pw.append(re+"\n");
            pw.close();
            
        }catch(Exception ex){
            System.out.println("Error"+ex.toString());
        }
    }
    public void actionPerformed(ActionEvent ex){
        
        
        //Si la accion viene del boton REGISTRAR
        if(ex.getSource() == View.Bregistrar){
            String dni = View.JTDni.getText();
            String pass = View.JTpassword.getText();
            
            if (dni.length()==8){
                Usuario usuario = new Usuario(dni, pass);
                Agregar(usuario);
                JOptionPane.showMessageDialog(View.f, "Registro Completado");
            } else {
                JOptionPane.showMessageDialog(View.f, "Has ingresado un DNI Invalido");
            }
            
            View.JTDni.setText("");
            View.JTpassword.setText("");
            
        }
        
        //Si la accion viene del LOGIN
        if(ex.getSource()== View.Bloguin){
            
            String dni = View.JTDni.getText();
            String pass = View.JTpassword.getText();
            
            boolean encontrado = false;
            
            for (Usuario x: Lista){
                
                
                if( x.getDNI().equals(dni) ){
                    if ( x.getPassword().equals(pass) ){
                        encontrado = true;
                    }
                }
                
            }
            
            if( encontrado ){
                
                InterfazProducto ip = new InterfazProducto(dni);
                Producto p = new Producto();
                ProductoController pc = new ProductoController(ip, p);
                
            }else{
                JOptionPane.showMessageDialog(View.f, "Has ingresado algun dato incorrecto");
            }
        }
    }
    public Object [][] Obtener(){
        Object datos [][] = new Object[Lista.size()][2];
        if(Lista.size() != 0){
            try{
                for(int i=0; i < Lista.size();i++){
                    datos[i][0] = Lista.get(i).getDNI();
                    datos[i][1] = Lista.get(i).getPassword();
                }
            }catch(Exception ex){
                 System.out.println("Error"+ex.toString());
            }
        }
        
        return datos;
    }
    public void Datos(){
        try{
            String dni, password;
            BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
            String l;
            
            while((l = br.readLine())!= null){
                String [] temp = new String [2];
                temp = l.split(";");
                dni = temp[0].substring(4, 12);
                password = temp[1].substring(9);
                
                Usuario usuario = new Usuario(dni,password);
                Lista.add(usuario);
            }
            br.close();
        }catch(Exception ex){
            System.out.println("Error"+ex.toString());
        }
    }
   
}
