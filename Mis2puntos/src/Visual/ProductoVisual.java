
package Visual;
import Modelo.Producto;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ProductoVisual implements ActionListener{

    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    JButton b1,b2,b3,b4;
    
    
    public ProductoVisual()
       {
           
           f  = new JFrame();
           
           l1 = new JLabel("Ingresar Productos");
           l1.setBounds(80, 20, 250, 30);
           l1.setForeground(Color.red);
           l1.setFont(new Font("Serif", Font.PLAIN, 25));


           l2 = new JLabel("Producto:");
           l2.setBounds(20, 60, 100, 25);
           tf1 = new JTextField();
           tf1.setBounds(100, 60, 100, 25);
           
           l3 = new JLabel("Código:");
           l3.setBounds(20, 90, 100, 25);
           tf2 = new JTextField();
           tf2.setBounds(100, 90, 100, 25);
           
           l4 = new JLabel("Stock:");
           l4.setBounds(20, 120, 100, 25);
           tf3 = new JTextField();
           tf3.setBounds(100, 120, 100, 25);
           
           l5 = new JLabel("Precio:");
           l5.setBounds(20, 150, 100, 25);
           tf4 = new JTextField();
           tf4.setBounds(100, 150, 100, 25);
           
           l6 = new JLabel("Descuento:");
           l6.setBounds(20, 180, 100, 25);       
           tf5 = new JTextField();
           tf5.setBounds(100, 180, 100, 25);
           
           //botones
           b1 = new JButton("Registrar");
           b1.setBounds(250,60,100,30);
           
           b2 = new JButton("Modificar");
           b2.setBounds(250,100,100,30);
           
           b3 = new JButton("Eliminar");
           b3.setBounds(250,140,100,30);
           
           b4 = new JButton("Listar");
           b4.setBounds(250,180,100,30);
           
           
           //agregando al frame
           f.add(l1);
           f.add(l2);
           f.add(l3);
           f.add(l4);
           f.add(l5);
           f.add(l6);
           f.add(tf1);
           f.add(tf2);
           f.add(tf3);
           f.add(tf4);
           f.add(tf5);
           f.add(b1);
           f.add(b2);
           f.add(b3);
           f.add(b4);
           
           f.setSize(400,400);
           f.setLayout(null);
           f.setVisible(true);
           f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
    public void actionPerformed (ActionEvent e)
    {
    String produc,cod;
    int stock;
    double descuento,precio;
    
    produc = tf1.getText();
    cod = tf2.getText();
    stock = Integer.parseInt(tf3.getText());
    precio = Double.parseDouble(tf4.getText());
    descuento = Double.parseDouble(tf5.getText());
    
    Producto p = new Producto(produc,cod,stock,precio,descuento);
    }
}
