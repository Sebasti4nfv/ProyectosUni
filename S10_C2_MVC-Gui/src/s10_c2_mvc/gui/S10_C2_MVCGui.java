/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s10_c2_mvc.gui;
import View.ImcView;
import Model.IMC;
import Controller.ImcController;

public class S10_C2_MVCGui {

    public static void main(String[] args) {
        IMC model = new IMC();
        ImcView view = new ImcView();
        ImcController controller = new ImcController(view, model);
        //controller.showView();      
    }
    
}
