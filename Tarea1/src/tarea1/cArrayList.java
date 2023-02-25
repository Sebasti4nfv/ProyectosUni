
package tarea1;

import java.util.ArrayList;


public class cArrayList {
    ArrayList<cConductor> arrayCondu;
    
    public cArrayList(){
        
     
    }
    public void crearArraylist(){
        arrayCondu = new ArrayList();
    }
    public void ingresarDatos(cConductor conductor){
        
        arrayCondu.add(conductor);
    }
    public  String mostrarDatos(){
        String informacion="";
        for (int i=0; i < arrayCondu.size();i++){
         
            informacion+= arrayCondu.get(i).toString()+"\n";
        }
        return informacion;
    }
}
