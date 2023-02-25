
package semana9;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;

public class cInterfaz implements ActionListener {
    JTextArea jtaTexto;
    JButton btnGuarda,bMostrar;
    JFrame f;
    FileWriter fw = null;
    PrintWriter pw = null;
    
    
    public cInterfaz(){
        
    f = new JFrame("Ejemplo de Clase File");
    jtaTexto = new JTextArea();
    jtaTexto.setBounds(50, 25, 250, 200);
    
    //Boton
    btnGuarda = new JButton("Guardar");
    btnGuarda.setBounds(100,300,120,30);
    btnGuarda.addActionListener(this);
    
    bMostrar = new JButton("Mostrar");
    bMostrar.setBounds(250,300,120,30);
    bMostrar.addActionListener(this);
    
    f.add(jtaTexto);
    f.add(btnGuarda);
    f.add(bMostrar);
    
    
    f.setSize(450,450);
    f.setLayout(null);
    f.setVisible(true);
           
        
    }
    
    public void actionPerformed(ActionEvent e){
    
        String texto = jtaTexto.getText();
        
        try{
            
            fw = new FileWriter("Miarchivo.txt");
            pw = new PrintWriter(fw);
            
            pw.println(texto);
            
            JOptionPane.showMessageDialog(null,"Archivo generado");
            
            pw.close();
            
        }catch(IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        
    }
}
