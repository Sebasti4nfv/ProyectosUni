package s7ejercicio_diazevie;
import javax.swing.*;
import java.awt.event.*;

public class InterfazMain{
    
    ErroresDiam err;
    InterfazDiam i;
    JButton bAnalizar;
    JFrame f;
    JLabel lTitulo, lPernos;
    JTextField tfPernos;
    
    public InterfazMain(){
        
        //Clase Errores
        err = new ErroresDiam();
        
        
        //Frame
        f = new JFrame("Tornillos S.A.");
        f.setSize(300, 300);
        
        
        //Labels
        lTitulo = new JLabel("TORNILLOS S.A.");
        lPernos = new JLabel("Número de pernos: ");
        
        lTitulo.setBounds(100, 20, 100, 30);
        lPernos.setBounds(20, 60, 150, 30);
        
        
        //TextField
        tfPernos = new JTextField();
        tfPernos.setBounds(100, 110, 100, 50);
        
        
        //Boton
        bAnalizar = new JButton("Analizar");
        bAnalizar.addActionListener((e) -> {
           err.errorDato(tfPernos, f, 0, 100);
           if(!err.getB()){
               i = new InterfazDiam(err.getNum());
               f.dispose();
           }
        });
        bAnalizar.setBounds(100,180,100,50);
        
        
        //Añadir a frame
        f.add(lTitulo);
        f.add(lPernos);
        f.add(tfPernos);
        f.add(bAnalizar);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
