package laboratorio;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class problema1 implements ActionListener{

    JFrame f;
    JButton b;
    JTextArea txt1, txt2, txt3, txt4;
    JLabel l1, l2, l3, l4;

    public problema1(){

    f = new JFrame("Calculadora de area");
    l1 = new JLabel("Ingrese Altura 1(A) ");
    l1.setBounds(50, 50, 200, 30);
    l2 = new JLabel("Ingrese Altura 2 (C) ");
    l2.setBounds(50, 100, 200, 30);
    l3 = new JLabel("Ingrese Base (B) ");
    l3.setBounds(50, 150, 200, 30);
    l4 = new JLabel("Resultado");
    l4.setBounds(50, 200, 200, 30);

    txt1 = new JTextArea();
    txt1.setBounds(200,50,200,30);
    txt2 = new JTextArea();
    txt2.setBounds(200,100,200,30);
    txt3 = new JTextArea();
    txt3.setBounds(200,150,200,30);
    txt4 = new JTextArea();
    txt4.setBounds(200,200,200,30);
    txt4.setEditable(false);


    b = new JButton("CALCULAR");
    b.setBounds(200, 250, 100, 50);
    b.addActionListener(this);


    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(txt1);
    f.add(txt2);
    f.add(txt3);
    f.add(txt4);
    f.add(b);

    f.setSize(500,400);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void actionPerformed(ActionEvent e){
        
        String n1 = txt1.getText();
        String n2 = txt2.getText();
        String n3 = txt3.getText();
        
        int num1= Integer.parseInt(n1);
        int num2= Integer.parseInt(n2);
        int num3= Integer.parseInt(n3);
        
        double num4 =0;
        double  num5=0;       
        double num6 =0;
        
        if(e.getSource() == b){
        
        num4 = (num1 - num2)*num3/2 ;
            num5 = num2 * num3;
            num6 = num4 + num5;
        }
        
        String resul = String.valueOf(num6);
        txt4.setText(resul);
        
        try{

        }catch (Exception ex){System.out.println("Error: " + ex.toString());}
    }

}
