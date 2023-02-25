package Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class producto {
 
    private String Nombre;
    private String Codigo;
    private String Precio;
    private String Peso;

    public producto(String Nombre, String Codigo, String Precio, String Peso) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.Peso = Peso;
    }
    
    public producto() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }
    
    public void Registro(ArrayList<producto> arrayProducto, String Nombre, String Codigo, String Precio, String Peso){
   
         
        producto p = new producto(Nombre, Codigo, Precio, Peso);
        
        arrayProducto.add(p);
        
        
    }
    public String Listar(ArrayList<producto> arrayProducto){
        String rpt ="";
        
            for(int i= 0; i<arrayProducto.size();i++){
                
                rpt +="Producto"+String.valueOf(i+1)+"\n";
                rpt +="Nombre"+arrayProducto.get(i).Nombre+"\n"+"Codigo"+arrayProducto.get(i).Codigo+"\n"+"Precio"+arrayProducto.get(i).Precio+"\n"+"Peso"+arrayProducto.get(i).Peso+"\n";
                
                rpt +="\n"+"-----"+"\n";
            }
        
        return rpt;
        
    }
    
    public void delate(ArrayList<producto> arrayProducto, String Codigo){
        int i=0;
        Iterator itr = arrayProducto.iterator();
        while(itr.hasNext()){
            
            producto cod = (producto) itr.next();
            if(cod.Codigo.equals(Codigo)){
                i = arrayProducto.indexOf(cod);
            }
        }
        arrayProducto.remove(i);
    }
    
    public void edit(ArrayList<producto> arrayProducto, String Nombre, String Codigo, String Precio, String Peso){
        int i=0;
        Iterator itr = arrayProducto.iterator();
        while(itr.hasNext()){
            
            producto cod = (producto) itr.next();
            if(cod.Codigo.equals(Codigo)){
                i = arrayProducto.indexOf(cod);
            }
            
        }
        arrayProducto.get(i).setNombre(Nombre);
        arrayProducto.get(i).setPrecio(Precio);
        arrayProducto.get(i).setPeso(Peso);
       
    }
}

