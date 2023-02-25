package s7ejercicio_diazevie;
import javax.swing.*;

public class ErroresDiam {
    boolean b;
    int num;        
    
    public ErroresDiam(){}
    
    
    //Setters and getters
    public boolean getB(){return this.b;}
    
    public void setB(boolean b){this.b = b;}
    
    public int getNum(){return this.num;}
    
    public void setNum(int num){this.num = num;}

    
    //Función para retornar errores
    public void errorDato(JTextField tf, JFrame f, int n1, int n2){
        this.setB(false);
        try {
            num = Integer.parseInt(tf.getText());
            if(n2 != 0){
                if(num<n1 || num>n2){
                    JOptionPane.showMessageDialog(f, "Ingrese valores del " + n1 + " al " + n2);
                    this.setB(true);
                }
            }
        } catch (Exception e) {
            if("".equals(tf.getText())){
                JOptionPane.showMessageDialog(f, "Llenar los campos en blanco");
                this.setB(true);
            }
            else{
                JOptionPane.showMessageDialog(f, "Solo se permiten enteros");
                this.setB(true);
            }
        }
        tf.setText("");
    }
    
}
