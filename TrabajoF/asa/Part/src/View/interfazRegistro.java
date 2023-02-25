
package View;
import javax.swing.*;

public class interfazRegistro {
    public JFrame f;
    public JLabel Ldni, Lpassword;
    public JTextField JTDni, JTpassword;
    public JButton Bregistrar, Bloguin;
    
    public interfazRegistro(){
        
        f= new JFrame();
        Ldni = new JLabel("Ingrese DNI");
        Ldni.setBounds(30,50,100,20);
         JTDni = new JTextField();
        JTDni.setBounds(30,100,200,20);
        Lpassword = new JLabel("Ingrese password");
        Lpassword.setBounds(30,150,200,20);
        JTpassword = new JTextField();
        JTpassword.setBounds(30,200,200,20);
        Bregistrar = new JButton("Registrar");
        Bregistrar.setBounds(30,250,100,20);
        Bloguin = new JButton("Ingresar");
        Bloguin.setBounds(150,250, 100, 20);
        
        
        f.add(Ldni);
        f.add(Lpassword);
        f.add(JTDni);
        f.add(JTpassword);
        f.add(Bregistrar);
        f.add(Bloguin);
        
        f.setSize(300,350);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
