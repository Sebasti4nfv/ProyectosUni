
package View;

import View.interfazRegistro;
import javax.swing.*;

public class InterfazProducto {
    
    public String dni;
    
    public JFrame fp;
    public JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    public JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;
    public JTextField j1,j2,j3,j4,j5,j6;
    public JButton btn1,btn2,btn3;
    
    public InterfazProducto(String dni) {
        
        this.dni = dni;
        
        fp = new JFrame();
        l1 = new JLabel("Seleccione la hambuguesa que desea:");
        l1.setBounds(20,30,300,20);
        l2 = new JLabel("s/.8");
        l2.setBounds(50,70,50,20);
        l3 = new JLabel("s/.10");
        l3.setBounds(50,100,50,20);
        l4 = new JLabel("s/.8");
        l4.setBounds(50,130,50,20);
        l5 = new JLabel("s/.12");
        l5.setBounds(50,160,50,20);
        l6 = new JLabel("s/.15");
        l6.setBounds(50,190,50,20);
        c1 = new JCheckBox("Hamburguesa Clasica");
        c1.setBounds(80,70,200,20);
        c2 = new JCheckBox("Hamburguesa Royal");
        c2.setBounds(80,100,200,20);
        c3 = new JCheckBox("Pollo Deshilachado");
        c3.setBounds(80,130,200,20);
        c4 = new JCheckBox("Hamburguesa Doble");
        c4.setBounds(80,160,200,20);
        c5 = new JCheckBox("Hamburguesa Especial");
        c5.setBounds(80,190,200,20);
        j1 = new JTextField();
        j1.setBounds(350,70,50,20);
        j2 = new JTextField();
        j2.setBounds(350,100,50,20);
        j3 = new JTextField();
        j3.setBounds(350,130,50,20);
        j4 = new JTextField();
        j4.setBounds(350,160,50,20);
        j5 = new JTextField();
        j5.setBounds(350,190,50,20);
        
        l7 = new JLabel("Cantidad");
        l7.setBounds(350,30,50,20);
        l8 = new JLabel("Cremas:");
        l8.setBounds(50,230,100, 20);
        
        c6 = new JCheckBox("Mayonesa");
        c6.setBounds(50,260,100,20);
        c7 = new JCheckBox("Ketchup");
        c7.setBounds(150,260,100,20);
        c8 = new JCheckBox("Mostaza");
        c8.setBounds(250,260,100,20);
        c9 = new JCheckBox("Tartara");
        c9.setBounds(350,260,80,20);
        c10 = new JCheckBox("Golf");
        c10.setBounds(435,260,50,20);
        c11 = new JCheckBox("Aji");
        c11.setBounds(490,260,50,20);
        c12 = new JCheckBox("Ninguna");
        c12.setBounds(550, 260, 100, 20);
        
        btn1 = new JButton("SELECCIONAR");
        btn1.setBounds(250, 300, 200, 20);
        btn2 = new JButton("Eliminar");
        btn2.setBounds(250,330,200,20);
        btn3 = new JButton("Siguiente");
        btn3.setBounds(250,360, 200, 20);
        
        
        j6 = new JTextField();
        j6.setBounds(20,300,200,20);
        j6.setText(dni);
        j6.setEditable(false);
        
        fp.add(l1);
        fp.add(l2);
        fp.add(l3);
        fp.add(l4);
        fp.add(l5);
        fp.add(l6);
        fp.add(l7);
        fp.add(c1);
        fp.add(c2);
        fp.add(c3);
        fp.add(c4);
        fp.add(c5);
        fp.add(j1);
        fp.add(j2);
        fp.add(j3);
        fp.add(j4);
        fp.add(j5);
        fp.add(l8);
        fp.add(c6);
        fp.add(c7);
        fp.add(c8);
        fp.add(c9);
        fp.add(c10);
        fp.add(c11);
        fp.add(btn1);
        fp.add(j6);
        fp.add(btn2);
        fp.add(btn3);
        fp.add(c12);
       
        fp.setSize(650,450);
        fp.setLayout(null);
        fp.setVisible(true);
        fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
