
package promedioalumno;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class PromedioAlumno extends JFrame {

   private int na, contador;
	private double sumaPromedios;
	//Componentes
	private JLabel etiqNorte;
	private JTextField notaExFin, notaExPar, notaTrabFinal, promedFinal;
	private JTextArea promedAlumnos;
	private JButton btComputar;
	//Paneles
	private PanelNorte pnNorte;
	private PanelCentral pnCentro;
	private PanelSur pnSur;
	private PanelEste pnEste;
	
	public PromedioAlumno() {
		
		na = Integer.parseInt(
				JOptionPane.showInputDialog(this, "¿Cuántos alumnos va a introducir?",
						"Cantidad Alumnos", JOptionPane.QUESTION_MESSAGE));
		sumaPromedios = 0;
		contador = 0;
		
		iniciarComponentes();
		
		pnNorte = new PanelNorte();
		pnCentro = new PanelCentral();
		pnSur = new PanelSur();
		pnEste = new PanelEste();
		setLayout(new BorderLayout());
		add(pnNorte, BorderLayout.NORTH);
		add(pnCentro, BorderLayout.CENTER);
		add(pnSur, BorderLayout.SOUTH);
		add(pnEste, BorderLayout.EAST);
		
		setTitle("Promedios Alumnos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void iniciarComponentes() {
		etiqNorte = new JLabel();
		notaExFin = new JTextField(5);
		notaExPar = new JTextField(5);
		notaTrabFinal = new JTextField(5);
		promedFinal = new JTextField(5);
		promedFinal.setHorizontalAlignment(JTextField.CENTER);
		promedFinal.setEditable(false);
		promedAlumnos = new JTextArea(8,5);
		promedAlumnos.setEditable(false);
		btComputar = new JButton("Calcular");
		btComputar.addActionListener(new AccionComputar());
	}
	
	//Clases para modelar paneles
	private class PanelNorte extends JPanel {
		
		public PanelNorte() {
			
			etiqNorte.setForeground(Color.BLUE);
			etiqNorte.setFont(new Font("Arial", Font.BOLD, 30));
			add(etiqNorte);
			actualizaContador();
			setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createEmptyBorder(15, 25, 10, 25),
					BorderFactory.createLoweredSoftBevelBorder()));
			
		}
		public void actualizaContador() {
			contador++;
			etiqNorte.setText("NOTAS DE ALUMNO #" + contador + "/" + na);
		}
	}
	
	private class PanelCentral extends JPanel {
		public PanelCentral() {
			
			JPanel panelesNotas = new JPanel();
			panelesNotas.setLayout(new GridLayout(1,3,10,0));
			panelesNotas.add(new PanelNota(new JLabel("Nota Examen Final:"), notaExFin));
			panelesNotas.add(new PanelNota(new JLabel("Nota Examen Parcial:"), notaExPar));
			panelesNotas.add(new PanelNota(new JLabel("Nota Trabajo Final:"), notaTrabFinal));
			
			JPanel pnBoton = new JPanel();
			btComputar.setFont(new Font("Arial", Font.BOLD, 25));
			pnBoton.add(btComputar);
			
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			add(panelesNotas);
			add(pnBoton);
			setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createEmptyBorder(25, 25, 25, 25),
					BorderFactory.createRaisedSoftBevelBorder()));
		}
		
		public void limpiarCampos() {
			notaExFin.setText(null);
			notaExPar.setText(null);
			notaTrabFinal.setText(null);
		}
	}
	
	private class PanelSur extends JPanel {
		public PanelSur() {
			JLabel etiq = new JLabel("Promedio Total Alumnos:");
			etiq.setFont(new Font("Arial", Font.PLAIN, 25));
			add(etiq);
			
			promedFinal.setFont(new Font("Arial", Font.BOLD, 25));
			promedFinal.setForeground(Color.BLUE);
			add(promedFinal);
			
			setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createEmptyBorder(10,25,15,25),
					BorderFactory.createRaisedSoftBevelBorder()));
		}
	}
	
	private class PanelEste extends JPanel {
		public PanelEste() {
			
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			add(new JLabel("Promedios Alumnos"));
			JScrollPane scroll = new JScrollPane(promedAlumnos);
			add(scroll);
			setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createCompoundBorder(
							BorderFactory.createEmptyBorder(10, 10, 25, 25),
							BorderFactory.createLoweredSoftBevelBorder()),
					BorderFactory.createEmptyBorder(10, 10, 10, 10)
					));
		}
	}
	
	private class PanelNota extends JPanel {
		public PanelNota(JLabel texto, JTextField campo) {
			add(texto);
			add(campo);
		}
	}

	
	//Clase Listener
	private class AccionComputar implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String nota1 = notaExFin.getText();
			String nota2 = notaExPar.getText();
			String nota3 = notaTrabFinal.getText();
			
			if (nota1.isBlank() || nota2.isBlank() || nota3.isBlank())
				JOptionPane.showMessageDialog(null, "Ha de completar los tres campos",
						"Rellenar notas", JOptionPane.WARNING_MESSAGE);
			else {
				try {
					//Parseamos notas
					double valor1 = Double.parseDouble(nota1);
					double valor2 = Double.parseDouble(nota2);
					double valor3 = Double.parseDouble(nota3);
					//Calculamos promedio
					double promedio = (((valor1*0.55)+(valor2*0.3)+(valor3*0.15)));
					//Acumulamos para luego scar promedio final
					sumaPromedios += promedio;
					//Actualizamos lista de promedios
					promedAlumnos.append(String.format("Alumno #%d: %.2f\n", contador, promedio));
					//Limpiamos campos
					pnCentro.limpiarCampos();
					//Comprobamos si hemos terminado
					if (contador == na) { //Hemos terminado
						//Desactivamos interfaz
						btComputar.setEnabled(false);
						notaExFin.setEnabled(false);
						notaExPar.setEnabled(false);
						notaTrabFinal.setEnabled(false);
						//Calculamos promedio final y mostramos
						double promFin = sumaPromedios / na;
						promedFinal.setText(String.format("%.2f", promFin));
						//Anunciamos fin de proceso
						JOptionPane.showMessageDialog(null, "Fin de inserción de datos",
								"Fin", JOptionPane.INFORMATION_MESSAGE);
					}
					else //No hemos terminado
						pnNorte.actualizaContador(); //Pasamos al siguiente alumno
				}
				catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Introduzca solo valores numéricos",
							"Computar notas", JOptionPane.WARNING_MESSAGE);
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new PromedioAlumno();	
			}
		});
	}
    
}
