
package View;
import javax.swing.*;

public class InterfazDatos {
    public String dni;
    public JFrame f;
    public JLabel lTitulo, lNombre, lApellido, lEdad, lDireccion;
    public JTextField tfNombre, tfApellido,tfEdad,tfDireccion,tfDni;
    public JButton bGuardar, bTerminar;
    
    public InterfazDatos(String dni)
    {
        this.dni = dni;
        f = new JFrame();
        lTitulo = new JLabel("Registre sus datos completos");
        lTitulo.setBounds(100,25,200,25);
        
        lNombre = new JLabel("Ingrese sus Nombres:");
        lNombre.setBounds(30, 55, 150, 20);
        tfNombre = new JTextField();
        tfNombre.setBounds(30, 85, 150, 25);
        
        lApellido = new JLabel("Ingrese sus Apellidos:");
        lApellido.setBounds(30, 115, 150, 20);
        tfApellido = new JTextField();
        tfApellido.setBounds(30, 145, 150, 25);
        
        lEdad = new JLabel ("Ingrese su edad:");
        lEdad.setBounds(200, 55, 150, 20);
        tfEdad = new JTextField();
        tfEdad.setBounds(200,85, 150, 25);
        
        lDireccion = new JLabel("Ingrese su dirección:");
        lDireccion.setBounds(200,115,150,20);
        tfDireccion = new JTextField();
        tfDireccion.setBounds(200, 145, 150, 25);
        
        tfDni = new JTextField();
        tfDni.setText(dni);
        
        //buttons
        
        bGuardar = new JButton ("Guardar");
        bGuardar.setBounds(70, 260, 100, 25);
        bTerminar = new JButton ("Finalizar");
        bTerminar.setBounds(210, 260,100, 25);
        
        
        
        f.add(lTitulo);
        f.add(lNombre);
        f.add(tfNombre);
        f.add(lApellido);
        f.add(tfApellido);
        f.add(lEdad);
        f.add(tfEdad);
        f.add(lDireccion);
        f.add(tfDireccion);
        f.add(bGuardar);
        f.add(bTerminar);
                
        f.setSize(400,350);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
}
