package tarea1;
import tarea1.cConductor;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.*;


public class cVisual implements ActionListener {
    JFrame f,f2;
    JButton  b,b2,b3;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5;
    JTextArea txt;
    cArrayList arrayls;
    public cVisual()
    {
    
    f = new JFrame("Tarea1"); 
    f.setSize(500,500);
    f.setVisible(true);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //array
    
    arrayls = new cArrayList();
    arrayls.crearArraylist();
    
    f2 = new JFrame("Lista de taxistas"); 
    f2.setSize(500,500);
    f2.setLayout(null);
    f2.setVisible(false);
    
    l1 = new JLabel ("Registro De Conductores");
    l1.setForeground(Color.BLUE);
    l1.setFont(new Font("Arial", Font.BOLD, 30));
    l1.setBounds(70, 10, 500, 60);
    
    l2 = new JLabel ("Código del conductor : ");
    l2.setBounds(20,90,200,30);
    l2.setFont(new Font("Arial", Font.BOLD, 15));
    
    l3 = new JLabel ("Nombre del conductor : ");
    l3.setBounds(20,140,200,30);
    l3.setFont(new Font("Arial", Font.BOLD, 15));
    
    l4 = new JLabel ("Placa del Vehiculo : ");
    l4.setBounds(20,190,200,30);
    l4.setFont(new Font("Arial", Font.BOLD, 15));
    
    l5 = new JLabel ("Numero del celular : ");
    l5.setBounds(20,240,200,30);
    l5.setFont(new Font("Arial", Font.BOLD, 15));
    
    l6 = new JLabel ("Tipo de Vehiculo : ");
    l6.setBounds(20,290,200,30);
    l6.setFont(new Font("Arial", Font.BOLD, 15));
    
    t1 = new JTextField ("");
    t1.setBounds(220, 90, 110, 30);
    
    t2 = new JTextField ("");
    t2.setBounds(220, 140, 110, 30);
    
    t3 = new JTextField ("");
    t3.setBounds(220, 190, 110, 30);
    
    t4 = new JTextField ("");
    t4.setBounds(220, 240, 110, 30);
    
    t5 = new JTextField ("");
    t5.setBounds(220, 290, 110, 30);
    
    txt= new JTextArea ("");
    txt.setBounds(25, 25, 300, 300);
    txt.setEditable(false);
    
    
    b = new JButton("Borrar");
    b.setBounds(30, 390, 100, 25);
    b.addActionListener(this);
    b2 = new JButton("Agregar"); 
    b2.setBounds(160, 390, 100, 25);
    b2.addActionListener(this);
    b3 = new JButton("Listar");
    b3.setBounds(290, 390, 100, 25);
    b3.addActionListener(this);
    
    
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(l5);
    f.add(l6);
    f.add(b);
    f.add(b2);
    f.add(b3);
    f.add(t1);
    f.add(t2);
    f.add(t3);
    f.add(t4);
    f.add(t5);
    
    
     
    }
    
    public void actionPerformed(ActionEvent e){
    
    try{
        
        if(e.getSource()== b)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }else if (e.getSource()== b2)
        {
        String codigoC  = t1.getText();
        String nombrec  = t2.getText();
        String placaV  = t3.getText();
        String numcel  = t4.getText();
        String tipove  = t5.getText();
        
        int codC = Integer.parseInt(codigoC);
        int numc = Integer.parseInt(numcel);
        //meterle info al array
        cConductor ara1 = new cConductor(codC,nombrec,placaV,numc,tipove);
        
        arrayls.ingresarDatos(ara1);
        JOptionPane.showMessageDialog(null,"Información Agregada al Array");
        }else if (e.getSource()== b3)
        {
            f2.setVisible(true);
            txt.setVisible(true);
             f2.add(txt);
            
            txt.setText(arrayls.mostrarDatos());
            txt.setBackground(Color.gray);
        }
    
    }catch(Exception ex){ System.out.println("Error: "+ ex.toString());}
    
    }
}