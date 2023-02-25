package s7ejercicio_diazevie;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

public final class InterfazDiam {
    DefaultTableModel model;
    ErroresDiam err;
    JButton bProcesar;
    JFrame f;
    JLabel lPromedio, lIngresar;
    JPanel p;
    JScrollPane s;
    JTable tDiametro;
    JTextField tfPromedio, tfIngresar;
    Random r;
    String nomDiametro[];
    Vector<Integer> valDiametro;
    
    public InterfazDiam(){}
    
    public InterfazDiam(int x){
        
        //Clase errores
        err = new ErroresDiam();
        
        
        //Frame
        f = new JFrame("Diámetros");
        f.setSize(500,600);
        
        
        //Rellenar tabla
        model = new DefaultTableModel();
        model.addColumn("#");
        model.addColumn("Diametro(mm)");
        
        this.ArregloDiam(x);
        
        tDiametro = new JTable(model);
        s = new JScrollPane(tDiametro);
        s.setPreferredSize(new Dimension(500,300));

        
        //Labels
        lPromedio = new JLabel("Promedio de diámetros(mm): ");
        lIngresar = new JLabel("Ingresar diámetro: ");
        lPromedio.setBounds(50, 10, 200, 50);
        lIngresar.setBounds(50, 70, 200, 50);
        
        
        //TextField
        tfPromedio = new JTextField();
        tfPromedio.setText(String.valueOf(this.promArray()));
        tfPromedio.setEditable(false);
        
        tfIngresar = new JTextField();
        
        tfPromedio.setBounds(50, 130, 200, 50);
        tfIngresar.setBounds(50, 190, 200, 50);
        
        
        //Panel
        p = new JPanel(new GridLayout(5,1,10,20));
        p.setSize(300,300);
        
        
        //Botones
        bProcesar = new JButton("Procesar");
        bProcesar.addActionListener((e) -> {
            err.errorDato(tfIngresar, f, 0, 0);
            if(!err.getB()){
               this.estadoCant(this.cantInferior(err.getNum()));
            }      
        });
        
        
        //Agregar a panel
        p.add(lPromedio);
        p.add(tfPromedio);
        p.add(lIngresar);
        p.add(tfIngresar);
        p.add(bProcesar);
        
        
        //Agregar a frame
        f.add(s, BorderLayout.NORTH);
        f.add(p, BorderLayout.CENTER);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    //Añadir números aleatorios a tabla y vector
    public void ArregloDiam(int n){
        r = new Random();
        valDiametro = new Vector();
        
        for(int i=0; i<n; i++){
            int nu = r.nextInt(5,30);
            valDiametro.add(nu);
            model.addRow(new Object[]{i+1,nu});
        }
    }
    
    
    //Retornar promedio de vector
    public double promArray(){
        double sum = valDiametro.stream().reduce(0, Integer::sum);
        return sum/valDiametro.size();
    }
    
    
    //Retornar cantidad de números inferiores a un parámetro específico
    public int cantInferior(int x){
        int cantidad = 0;
        for(int y:valDiametro){
            if(y<x){cantidad++;}
        }
        return cantidad;
    }
    
    
    //Se muestra un OptionPane de acuerdo a la cantidad inferior
    public void estadoCant(int x){
        if(x>valDiametro.size()/2){
            JOptionPane.showMessageDialog(f, "Lote defectuoso");
        }
        else{
            JOptionPane.showMessageDialog(f, x + " tienen diámetro inferior al ingresado.");
        }
    }
    
}
