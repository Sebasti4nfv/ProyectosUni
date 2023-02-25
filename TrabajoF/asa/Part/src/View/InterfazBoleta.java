
package View;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class InterfazBoleta {
    
    public String dni;
    public String datos;
    
    public JFrame f;
    public JLabel lTitulo;
    public DefaultTableModel model1,model2,model3;
    public JTable table1,table2,table3;
    public JTextArea taDatos;
    public JTextField tfDatos, tfBebidas, tfProducto;
    public JButton bFinalizar;
    
    public JLabel lbldni,lblDatos;
    public JTextField tfdni;
    public JTextArea taDatos2;
    JScrollPane scroll,scroll2,scroll3;
    
    public InterfazBoleta(String dni,String datos) {
        
        this.dni = dni;
        this.datos = datos;
        
        f= new JFrame();
        
        model1 = new DefaultTableModel();
        table1 = new JTable();
        
        scroll = new JScrollPane(table1);
        scroll.setBounds(30, 400, 400 , 100);
        
        model2 = new DefaultTableModel();
        table2 = new JTable();
        
        scroll2 = new JScrollPane(table2);
        scroll2.setBounds(30, 500, 600, 100);
        
        model3 = new DefaultTableModel();
        table3 = new JTable();
        
        scroll3 = new JScrollPane(table3);
        scroll3.setBounds(30, 600, 600, 100);
        
        lTitulo = new JLabel("BOLETA DE COMPRA");
        lTitulo.setBounds(30, 30, 200, 25);
        
        //taDatos = new JTextArea();
        //taDatos.setBounds(10, 50, 350, 250);
        
        lbldni = new JLabel(" ");
        lbldni.setBounds(20, 30, 100, 20);
        
        tfdni = new JTextField();
        tfdni.setBounds(220, 30, 100, 20);
        tfdni.setText(dni);
        tfdni.setEditable(false);
        
        lblDatos = new JLabel("Datos del conductor");
        lblDatos.setBounds(50, 100, 100, 20);
        
        taDatos = new JTextArea();
        taDatos.setBounds(50, 150, 200, 200);
        taDatos.setText(datos);
        taDatos.setEditable(false);
        bFinalizar = new JButton("Conclusion");
        bFinalizar.setBounds(300, 300, 100, 20);
       
        
        f.add(lbldni);
        f.add(tfdni);
        f.add(lblDatos);
        f.add(taDatos);
        f.add(scroll);
        f.add(scroll2);
        f.add(scroll3);
        
        bFinalizar = new JButton("Conclusion");
        bFinalizar.setBounds(300, 250, 100, 20);
        f.add(lTitulo);
        //f.add(taDatos);
        //f.add(tfBebidas);
        //f.add(tfProducto);
        f.add(bFinalizar);
        
        f.setSize(1000,800);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
    
    
}
