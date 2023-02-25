
package laboratorio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class problema2  {
   
    JFrame f;
    JLabel l,la,lb,la1,lb1,lr,ll;
    JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7;
    JButton b;
    JComboBox cb;
    
    
    public problema2(){
    
    f = new JFrame ("Calcular Areas");
    
    l = new JLabel ("Qué opción desea:");
    l.setBounds(25,50 ,150, 25);
    
    b = new JButton ("Calcular");
   b.setBounds(150, 200, 100, 30);
  
    
    txt7 = new JTextField ("");
    txt7.setBounds(275, 125, 100, 25);
    txt7.setEditable(false);
    String areas[] ={"Triangulo", "Rectangulo", "Circulo","Cuadrado", "Salir"};
    
    cb = new JComboBox(areas);
    cb.setBounds(150, 50, 110, 25);
    
    cb.addActionListener(new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
        
            String prog = (String) cb.getSelectedItem();
            
            if (prog == "Triangulo"){
                
            la = new JLabel ("Altura");
            la.setBounds(100, 100, 50, 25);
            lb = new JLabel ("Base");
            lb.setBounds(100, 150, 50, 25);
            txt1 = new JTextField();
            txt1.setBounds(150, 100, 100, 25);
            txt2 = new JTextField();
            txt2.setBounds(150, 150, 100, 25);
             
            f.add(la);
            f.add(lb);
            f.add(txt1);
            f.add(txt2);
        
            
            
            f.remove(cb);
            
            }
            else if( prog == "Rectangulo")
            {
            la1 = new JLabel ("Altura");
            la1.setBounds(100, 100, 50, 25);
            lb1 = new JLabel ("Base");
            lb1.setBounds(100, 150, 50, 25);
            txt3 = new JTextField();
            txt3.setBounds(150, 100, 100, 25);
            txt4 = new JTextField();
            txt4.setBounds(150, 150, 100, 25);
           
            f.add(la1);
            f.add(lb1);
            f.add(txt3);
            f.add(txt4);
            
            f.remove(cb);
         
            }
            else if( prog == "Circulo")
            {
            lr = new JLabel ("Radio");
            lr.setBounds(100, 100, 50, 25);
            txt5 = new JTextField();
            txt5.setBounds(150, 100, 100, 25);
            
            f.add(lr);
            f.add(txt5);
            
            f.remove(cb);
           
            }
            else if (prog == "Cuadrado")
            {
            
            ll = new JLabel ("Lado");
            ll.setBounds(100, 100, 50, 25);
            txt6 = new JTextField();
            txt6.setBounds(150, 100, 100, 25);
            
            f.add(ll);
            f.add(txt6);
            
            f.remove(cb);
           
            }
            
        }
    });
        
    f.add(l);
    f.add(cb);
    f.add(b);
    f.add(txt7);
  
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    
     b.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ex){
        
            String a1 = txt1.getText();
            String bas1 = txt2.getText();
            String a2 = txt3.getText();
            String bas2 = txt4.getText();
            int Ar1 = Integer.parseInt(a1);
            int Ba1 = Integer.parseInt(bas1);
            int Ar2 = Integer.parseInt(a2);
            int Ba2 = Integer.parseInt(bas2);
            double areat = 0;
        
            if(ex.getSource()== b){
        
             areat = (Ar1 * Ba1)/2;
        
                 }
            if (cb.getSelectedItem()== "Triangulo")
                if (ex.getSource()== b)
                {
                areat = Ar2* Ba2;
                }
 
             String resul =String.valueOf(areat);
            txt7.setText(resul);
        
        }
     });
     
    }
}
