
package Model;
import View.Interfaz;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class Avion {
    
    private String Id;
    private int CapacidadMaxima;
    private double Pasajeros;

    public Avion() {
    }

    public Avion(String Id, int CapacidadMaxima, double Pasajeros) {
        this.Id = Id;
        this.CapacidadMaxima = CapacidadMaxima;
        this.Pasajeros = Pasajeros;
    }


    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(int CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public double getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(double Pasajeros) {
        this.Pasajeros = Pasajeros;
    }
    
    public double getPorcentaje(){
        
        double porce;
        porce = (Pasajeros/CapacidadMaxima);
        
        return porce;
    }
    public void getEstado(){
        String estado;
    
       
    }
    public void getPesoMaximo(){
        
        double Peso;
        
        Peso = Pasajeros * 70;
        if(Peso >= 6500 ){
            System.out.println("No se puede ingresar");
        }
    }
    public void Registro(ArrayList<Avion> arrayAvion, String Id, int CapacidadMaxima, double Pasajeros){
   
         
        Avion a = new Avion(Id, CapacidadMaxima, Pasajeros);
        
        arrayAvion.add(a);
        
        
    }
    public String Listar(ArrayList<Avion> arrayAvion){
        String rpt ="";
        
            for(int i= 0; i<arrayAvion.size();i++){
                
                rpt +="Avion"+String.valueOf(i+1)+"\n";
                rpt +="Id:"+arrayAvion.get(i).Id+"\n"+"Capacidad:"+arrayAvion.get(i).CapacidadMaxima+"\n"+"Pasajeros:"+arrayAvion.get(i).Pasajeros+"\n";
                
                rpt +="\n"+"-----"+"\n";
            }
        
        return rpt;
        
    }
    
    public void delate(ArrayList<Avion> arrayAvion, String Id){
        int i=0;
        Iterator itr = arrayAvion.iterator();
        while(itr.hasNext()){
            
            Avion I = (Avion) itr.next();
            if(I.Id.equals(Id)){
                i = arrayAvion.indexOf(I);
            }
        }
        arrayAvion.remove(i);
    }
    
    public void edit(ArrayList<Avion> arrayAvion, String Id, int CapacidadMaxima, double Pasajeros ){
        int i=0;
        Iterator itr = arrayAvion.iterator();
        while(itr.hasNext()){
            
            Avion I = (Avion) itr.next();
            if(I.Id.equals(Id)){
                i = arrayAvion.indexOf(I);
            }
            
        }
        arrayAvion.get(i).setCapacidadMaxima(CapacidadMaxima);
        arrayAvion.get(i).setPasajeros(Pasajeros);
        
       
    }
    
}
