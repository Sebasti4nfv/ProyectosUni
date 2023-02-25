
package View;
import javax.swing.*;

public class InterfazBebidas {
    public String dni;
    
    public JFrame fb;
    
    public JLabel lblTitulo,lblCantidad,lblHelada,lbl1,lbl2,lbl3,lbl4,lbl5;
    public JCheckBox cb1,cb2,cb3,cb4,cb5;
    public JTextField tf1,tf2,tf3,tf4,tf5,tfDni;
    public JComboBox combo1,combo2,combo3,combo4,combo5;
    public JButton btSeleccionar,btEliminar,btExtras,btAtras;
    
    public InterfazBebidas(String dni){
        
        this.dni = dni;
        
        JFrame fb = new JFrame("Bebidas");
        
        lblTitulo = new JLabel("Seleccione el tipo de bebida que desee:");
        lblTitulo.setBounds(20,30,300,20);
        
        lbl1 = new JLabel("s/. 3");
        lbl1.setBounds(50,70,50,20);
        lbl2 = new JLabel("s/. 4");
        lbl2.setBounds(50,100,50,20);
        lbl3 = new JLabel("s/. 4");
        lbl3.setBounds(50,130,50,20);
        lbl4 = new JLabel("s/. 3");
        lbl4.setBounds(50,160,50,20);
        lbl5 = new JLabel("s/. 3");
        lbl5.setBounds(50,190,50,20);
        
        cb1 = new JCheckBox("Agua Mineral");
        cb1.setBounds(80,70,200,20);
        cb2 = new JCheckBox("Inca Kola");
        cb2.setBounds(80,100,200,20);
        cb3 = new JCheckBox("Coca Cola");
        cb3.setBounds(80,130,200,20);
        cb4 = new JCheckBox("Sprite");
        cb4.setBounds(80,160,200,20);
        cb5 = new JCheckBox("Guaraná");
        cb5.setBounds(80,190,200,20);
        
        lblCantidad = new JLabel("Cantidad");
        lblCantidad.setBounds(350,30,50,20);
        
        tf1 = new JTextField();
        tf1.setBounds(350,70,50,20);
        tf2 = new JTextField();
        tf2.setBounds(350,100,50,20);
        tf3 = new JTextField();
        tf3.setBounds(350,130,50,20);
        tf4 = new JTextField();
        tf4.setBounds(350,160,50,20);
        tf5 = new JTextField();
        tf5.setBounds(350,190,50,20);
  
        lblHelada = new JLabel("Helada/Sin Helar");
        lblHelada.setBounds(450,30,120,20);
        
        String productos[] = {" ","Helada","Sin helar"};
        
        combo1 = new JComboBox(productos);
        combo1.setBounds(450, 70, 90, 20);
        combo2 = new JComboBox(productos);
        combo2.setBounds(450, 100, 90, 20);
        combo3 = new JComboBox(productos);
        combo3.setBounds(450, 130, 90, 20);
        combo4 = new JComboBox(productos);
        combo4.setBounds(450, 160, 90, 20);
        combo5 = new JComboBox(productos);
        combo5.setBounds(450, 190, 90, 20);
        
        btSeleccionar = new JButton("Seleccionar");
        btSeleccionar.setBounds(250, 300, 200, 20);
        btEliminar = new JButton("Eliminar");
        btEliminar.setBounds(250,330,200,20);
        btExtras = new JButton("Pagar");
        btExtras.setBounds(250,360, 200, 20);
        //btAtras = new JButton("Atras");
        //btAtras.setBounds(440, 360, 90, 20);
        
        tfDni = new JTextField();
        tfDni.setBounds(20,300,200,20);
        tfDni.setText(dni);
        tfDni.setEditable(false);
        
        fb.add(lblTitulo);
        fb.add(lblCantidad);
        fb.add(lblHelada);
        
        fb.add(lbl1);
        fb.add(lbl2);
        fb.add(lbl3);
        fb.add(lbl4);
        fb.add(lbl5);
        
        fb.add(cb1);
        fb.add(cb2);
        fb.add(cb3);
        fb.add(cb4);
        fb.add(cb5);
        
        fb.add(tf1);
        fb.add(tf2);
        fb.add(tf3);
        fb.add(tf4);
        fb.add(tf5);
        
        fb.add(combo1);
        fb.add(combo2);
        fb.add(combo3);
        fb.add(combo4);
        fb.add(combo5);
        
        fb.add(btSeleccionar);
        fb.add(btEliminar);
        fb.add(btExtras);
       // fb.add(btAtras);
        
        fb.add(tfDni);
        
        
        fb.setSize(650,450);
        fb.setLayout(null);
        fb.setVisible(true);
        
    }
}
