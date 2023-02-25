
package View;
import javax.swing.*;

public class ImcView {
    
    public JFrame f;
    public JLabel lblPeso, lblAltura;
    public JTextField txtPeso, txtAltura;
    public JButton btnCalcular;
    
    public ImcView(){
        
        f = new JFrame();
        
        lblPeso = new JLabel("Peso");
        lblPeso.setBounds(30, 30, 80, 20);
        txtPeso = new JTextField();
        txtPeso.setBounds(30, 60, 80, 20);
        
        lblAltura = new JLabel("Altura");
        lblAltura.setBounds(30, 80, 80, 20);
        txtAltura = new JTextField();
        txtAltura.setBounds(30, 110, 80, 20);
        
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(50, 140, 110, 20);
        
        f.add(lblPeso);
        f.add(txtPeso);
        f.add(lblAltura);
        f.add(txtAltura);
        f.add(btnCalcular);
        
        f.setSize(250, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void verImc(double peso, double altura, double imc, String estado){
        JOptionPane.showMessageDialog(f, "Peso: " + peso + 
                                         "\nAltura: " + altura + 
                                         "\nIMC: " + imc + 
                                         "\nEstado: " + estado);
    }
    
}
