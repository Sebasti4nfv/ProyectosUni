
package poo2_p1_fonsecavicentesebastianjavier_n1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class cInterfaz implements ActionListener {
     JFrame f;
    JLabel ltitulo,lTiempo, lSatisfaccion,lEdad;
    JTextArea tf1;
    JButton bGenerar,bPorcentaje,bPromedio,bListar, bregistrar;
    ArrayList<Integer> vecEnteros = new ArrayList<Integer>();
    ArrayList<String> vecLetras = new ArrayList<String>();
    public cInterfaz(){
    
     f = new JFrame ("");
     f.setSize(500,500);
     
     ltitulo = new JLabel("Lista de jugadores");
     ltitulo.setBounds(50, 40, 200 , 25);
    
     bGenerar = new JButton("Generar n jugadores");
     bGenerar.setBounds(40, 100, 150, 25);
     bGenerar.addActionListener(this);
     bListar = new JButton("Listado por tiempo");
     bListar.setBounds(150, 100,120,25);
     bListar.addActionListener(this);
     
     bPromedio = new JButton("Total");
     bPromedio.setBounds(260, 100,120,25);
     bPromedio.addActionListener(this);
    
     tf1 = new JTextArea("");
     tf1.setBounds(40, 200, 70, 70);
     
     f.add(ltitulo);
     f.add(bListar);
     f.add(bPromedio);
     f.add(bGenerar);
     f.add(tf1);
    }
    
    public void actionPerformed(ActionEvent e)
    {
    
       if(e.getSource()== bGenerar)
       {
           //generar los tiempos aleatorios
        for (int i = 0; i < 25; i++)
        {
        
        vecEnteros.add(ThreadLocalRandom.current().nextInt(0, 1000 + 1));
        
        }
       //letras aleatorias
        for (int i = 0; i < vecEnteros.size(); i++)
        {
        
            char c =(char)(Math.random()*26 + 'a');
            
            switch(c){
        
                case'a':
                case'd':
                case'm':
                case'e':
                    //intente ponerlo en un array
                    vecLetras.add(ThreadLocalRandom.current().nextText(0, 1000 + 1));
        }
        
        
        }
       }
    
    }
}
