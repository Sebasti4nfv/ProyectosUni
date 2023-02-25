
package mante;

import View.Interfaz;
import Model.producto;
import Controller.productoController;

 class Mante {

    public static void main(String[] args) {
       
           Interfaz i = new Interfaz();
           producto p = new producto();
           productoController pc = new productoController(i , p);
    }
    
}
