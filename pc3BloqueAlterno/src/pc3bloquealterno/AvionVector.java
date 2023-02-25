/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc3bloquealterno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class AvionVector 
{
    // atributos
    private ArrayList<Avion> avionesVector = new ArrayList<>();
    
    // constructor
    public AvionVector() 
    {
        cargardatos_archivo_vector();
    }
    
    //metodos
    public void  cargardatos_archivo_vector()
    {
        System.out.println("cargando datos al archivovector...");
        BufferedReader  lector;
        String          linea;
        String          partes[] = null;
        crearArchivoSEGUNDAFORMA();
        try
        {
            lector = new BufferedReader(new FileReader("ListaAviones.csv"));
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                // crear objeto
                Avion objAvion = new Avion();
                
                // seteeando datos
                // === seteando en el orden de los at irbutos de la clase
                objAvion.setID(Integer.parseInt(partes[0]));
                objAvion.setCapacidadMaxima( Integer.parseInt(partes[1]) );
                objAvion.setPasajerosActuales(Integer.parseInt(partes[2]));
                objAvion.setPorcentajeOcupabilidad(Integer.parseInt(partes[3]));
                objAvion.setEstado(partes[4]);
                objAvion.setPesoMaximo(Integer.parseInt(partes[5]));
                
                // arreglando al arreglo
                agregarAvion(objAvion);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
    public void agregarAvion(Avion objAvion)
    {
        avionesVector.add(objAvion);
    }
    
    public int correlativo()
    {
        if(avionesVector.size() == 0)
        {
            return 1;
        }
        else
        {
            int codigoRetorno = ( avionesVector.get( avionesVector.size() -1).getID() )+ 1;
            
            return codigoRetorno;
        }
    }
    
    public void crearArchivoSEGUNDAFORMA()
    {
        try 
        {
            File myObj = new File("ListaAviones.csv");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
        } 
        catch (IOException e) 
        {
          System.out.println("Ocurrio en un error en metodo crearSArchivo.");
          e.printStackTrace();
        }
    }
    
    public void crearArchivoBACKUP()
    {
        try 
        {
            File myObj = new File("ListaAvionesBACKUP.csv");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
        } 
        catch (IOException e) 
        {
          System.out.println("Ocurrio en un error en metodo crearSArchivo.");
          e.printStackTrace();
        }
    }
    
    public void grabarEnArchivo(Avion objAvion)
    {
        crearArchivoSEGUNDAFORMA();
        try
        {           
            FileWriter f                = new FileWriter("ListaAviones.csv",true);
            BufferedWriter b            = new BufferedWriter(f);
            PrintWriter pw              = new PrintWriter(b);

            pw.println(objAvion.getID()+ "," + objAvion.getCapacidadMaxima()+ "," + objAvion.getPasajerosActuales()+ ","
                        + objAvion.getPorcentajeOcupabilidad()+ "," + objAvion.getEstado()+ "," + objAvion.getPesoMaximo() );
            pw.flush();
            pw.close();
        }
        catch( Exception e )
        {
            System.out.println(e);
        }
    }
    
    public int rows()
    {
      return avionesVector.size();
    }
    
    public Avion get(int pos)
    {
      return avionesVector.get(pos);
    }
  
    public Avion buscarcodigo(int cod)
    {
        
        Avion objAvioErrorn = new Avion();
        objAvioErrorn.setID(-1);
        for(Avion x:avionesVector)
        {
            if( cod == x.getID() )
            {
                return x;
            }
        }
        return objAvioErrorn;
    }
    
    
    public boolean modificarCapacidadMaxima(Avion avionEncontrado, int modifyCapcicadMax) // entregarle el objeto ya encontrado por id
    {
        if (avionEncontrado.getID() != -1)
        {
            avionEncontrado.setCapacidadMaxima(modifyCapcicadMax);
            return true;
        }
        return false;
    }
    public boolean modificarPasajeroActual(Avion avionEncontrado, int modifyPasajeroActual) // entregarle el objeto ya encontrado por id
    {
        if (avionEncontrado.getID() != -1)
        {
            avionEncontrado.setPasajerosActuales(modifyPasajeroActual);
            return true;
        }
        return false;
    }
    public boolean modificarPorcentajeOcupabilidad(Avion avionEncontrado, int modifyPercentage) // entregarle el objeto ya encontrado por id
    {
        if (avionEncontrado.getID() != -1)
        {
            avionEncontrado.setPorcentajeOcupabilidad(modifyPercentage);
            return true;
        }
        return false;
    }
    public boolean modificarEstado(Avion avionEncontrado, String modifyEstado) // entregarle el objeto ya encontrado por id
    {
        if (avionEncontrado.getID() != -1)
        {
            avionEncontrado.setEstado(modifyEstado);
            return true;
        }
        return false;
    }
    public boolean modificarPesoMaximo(Avion avionEncontrado, int modifyPesoMax) // entregarle el objeto ya encontrado por id
    {
        if (avionEncontrado.getID() != -1)
        {
            avionEncontrado.setPesoMaximo(modifyPesoMax);
            return true;
        }
        return false;
    }
   
    public void grabarModificareliminar()
    {
        crearArchivoSEGUNDAFORMA();
        try
        {
            FileWriter f = new FileWriter("ListaAviones.csv",false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            
            for(Avion x:avionesVector)
            {
               pw.println(x.getID()+ "," + x.getCapacidadMaxima()+ "," + x.getPasajerosActuales()+ ","
                        + x.getPorcentajeOcupabilidad()+ "," + x.getEstado()+ "," + x.getPesoMaximo() ); 
            }

            pw.flush();
            pw.close();
        } 
        catch ( Exception e )
        {
             System.out.println(e);
        }
    }
    
    public void actualizarDatos()
    {
        ArrayList<Avion> backupAviones = new ArrayList<>();
        // guardando los datos al archivo del backup
            for (int i = 0; i < avionesVector.size(); i++)
            {
                Avion objAvion = avionesVector.get(i);
                //objAvion.setID(0);
                backupAviones.add(objAvion);
                
            } // para cuando termin el for ya deberia estar cargado todos los datos
            
            // tenemos q vaciar los datos 
            vaciarDatos();
            
            // ahora se tienen q volver a llenar
            for (Avion x: backupAviones)
            {
                x.setID( correlativo() );
                agregarAvion(x);
                grabarEnArchivo(x);
            }
    }
    
    void eliminar(Avion objAvion)
    {
        avionesVector.remove(getposarray(objAvion));
    }
    
    public void vaciarDatos()
    {
        avionesVector.clear();
        try
        {
            FileWriter f = new FileWriter("ListaAviones.csv",false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            
            for(Avion x:avionesVector)
            {
               pw.println(x.getID()+ "," + x.getCapacidadMaxima()+ "," + x.getPasajerosActuales()+ ","
                        + x.getPorcentajeOcupabilidad()+ "," + x.getEstado()+ "," + x.getPesoMaximo() ); 
            }

            pw.flush();
            pw.close();
            System.out.println("se han eliminado todos los datos exitosamente");
        } 
        catch ( Exception e )
        {
             System.out.println(e);
        }
    }
    
    int getposarray(Avion objAvion)
    {
        for(int i=0; i<rows(); i++)
        {
            if(objAvion.getID() == (avionesVector.get(i).getID()))
            {
                return i;
            }
        }

        return -1;
    }
    
}
