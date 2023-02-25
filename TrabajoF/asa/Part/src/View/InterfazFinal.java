
package View;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class InterfazFinal {
    public JFrame f;
    public JLabel l;

public InterfazFinal()
{
    f = new JFrame();
    
    l = new JLabel("¡Gracias por su Compra!");
    l.setBounds(75,150,450,300);
    l.setForeground(Color.red);
    l.setFont(new Font("arial",Font.PLAIN,40));
    
    f.add(l);
    f.setSize(600,650);
        f.setLayout(null);
        f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}








    
}

