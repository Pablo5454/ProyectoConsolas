package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaPrincipal {
	public static void ventana() {
		
		JFrame jf = new JFrame("Ventana principal");
		jf.setLocationRelativeTo(null);
		jf.setSize(300, 300);
		jf.setLayout(new GridLayout(2, 2));
		
		JButton btnVer = new JButton("Ver");
		JButton btnInsertar = new JButton("Insertar");
		JButton btnEliminar = new JButton("Eliminar");
		JButton btnCargarXml = new JButton("Cargar XML");
		
		jf.add(btnVer);
		jf.add(btnInsertar);
		jf.add(btnEliminar);
		jf.add(btnCargarXml);
		
		btnVer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaVer.ventana();
			}
		});
		
		
		jf.setVisible(true);
		
	}
}
