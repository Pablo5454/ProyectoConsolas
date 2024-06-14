package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Usuario;

public class VentanaLogin {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		jf.setLocationRelativeTo(null);
		jf.setSize(150, 200);
		jf.setLayout(new FlowLayout());
		
		JLabel lblTitulo = new JLabel("------LOGIN------");
		JLabel lblUsuario = new JLabel("Usuario");
		JTextField txtUsuario = new JTextField(10);
		JLabel lblContrasenya = new JLabel("Contraseña");
		JTextField txtContrasenya = new JTextField(10);
		
		JButton btnEnviar = new JButton("Enviar");
		
		jf.add(lblTitulo);
		jf.add(lblUsuario);
		jf.add(txtUsuario);
		jf.add(lblContrasenya);
		jf.add(txtContrasenya);
		jf.add(btnEnviar);
		
		btnEnviar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String user = txtUsuario.getText();
			
		});
		
		
		jf.setVisible(true);
		
	}

}
