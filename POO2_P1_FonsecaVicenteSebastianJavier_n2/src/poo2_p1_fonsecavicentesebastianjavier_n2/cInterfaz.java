
package poo2_p1_fonsecavicentesebastianjavier_n2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class cInterfaz implements ActionListener{
    
    JFrame f;
    JLabel ltitulo,lTiempo, lSatisfaccion,lEdad;
    JTextField tf1, tf2;
    JComboBox cb, cb2;
    JButton bGenerar,bPorcentaje,bPromedio,bListar, bregistrar;
    
    ArrayList<cLogica> listEncuestas = new ArrayList();
    
    public cInterfaz()
    {
     f = new JFrame ("");
     f.setSize(500,500);
     
     ltitulo = new JLabel("Encuesta de Satisfaccion");
     ltitulo.setBounds(50, 40, 200 , 25);
     
     lTiempo = new JLabel("¿Desde cuando es cliente?");
     lTiempo.setBounds(20,100,300,20);
     String respuestas1[] = {"A. Menos de un año", "B. Entre 1 a 3 años", "C.Entre 4 a 8 años", "D.Más de 8 años"};
     
     cb = new JComboBox(respuestas1);
     cb.setBounds(350, 100, 90, 25);
     
     lSatisfaccion = new JLabel("¿Cual es su grado de satisfacción con el servicio brindado?");
     lSatisfaccion.setBounds(20, 150, 350, 20);
     String respuestas2[] = {"A. Excelente", "B. Muy Bueno", "C.Bueno", "D.Regular", "E. Malo"};

     cb2 = new JComboBox (respuestas2);
     cb2.setBounds(370,150,90,25);
     
     lEdad = new JLabel("Ingrese su edad:");
     lEdad.setBounds(20, 200, 100, 20);
     
     tf1 = new JTextField("");
     tf1.setBounds(300, 200, 90, 20);
     
     bregistrar = new JButton("Registrar");
     bregistrar.setBounds(250, 300, 120, 25);
     bregistrar.addActionListener(this);
     
     bGenerar = new JButton("Mostrar N clientes");
     bGenerar.setBounds(40, 250, 120, 25);
     bGenerar.addActionListener(this);
     bPorcentaje = new JButton("Porcentaje");
     bPorcentaje.setBounds(160, 250,120,25);
     bPorcentaje.addActionListener(this);
     bPromedio = new JButton("Promedio");
     bPromedio.setBounds(280, 250,120,25);
     bPromedio.addActionListener(this);
     bListar = new JButton("Listado por edad");
     bListar.setBounds(100, 300,120,25);
     bListar.addActionListener(this);
     
     
     //Ingresar todo al frame
     f.add(cb);
     f.add(bListar);
     f.add(cb2);
     f.add(bregistrar);
     f.add(lSatisfaccion);
     f.add(lTiempo);
     f.add(lEdad);
     f.add(tf1);
     f.add(bGenerar);
     f.add(bPorcentaje);
     f.add(bPromedio);
     f.add(ltitulo);
    
     
     
     f.setVisible(true);
     f.setLayout(null);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== bregistrar )
        {
            cLogica cl = new cLogica();
            String rpta = "" ;
             String rpta2 = "";
              rpta+= cb.getItemAt(cb.getSelectedIndex());
              
              rpta2+= cb2.getItemAt(cb2.getSelectedIndex());
           
        
         
         cl.rp1 = rpta;
         
         cl.rp2 = rpta2;
   
         cl.rp3 = tf1.getText();
         
        JOptionPane.showMessageDialog(null,"Información Agregada al Array");
        listEncuestas.add(cl);
        tf1.setText("");
        
        }else if(e.getSource() == bGenerar)
        {
        
        
        }
    }
}
