//TRABAJADO CON SEBASTIAN JAVIER FONSECA
package poo2_p3_ayalasegundojuancarlos;
import Model.Avion;
import View.Interfaz;
import Controller.avionController;

public class POO2_P3_AyalaSegundoJuanCarlos {

    public static void main(String[] args) {
       
        Interfaz i = new Interfaz();
        Avion a = new Avion();
        avionController ac = new avionController(i,a);
        
    }
    
}
