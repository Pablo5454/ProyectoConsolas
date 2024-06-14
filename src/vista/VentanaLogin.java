package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import conexion.LoginConexion;
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
		
		
		JButton btnEnviar = new JButton("Enviar");
		
		jf.add(lblTitulo);
		jf.add(lblUsuario);
		jf.add(txtUsuario);
		jf.add(btnEnviar);
		
		
		btnEnviar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String user = txtUsuario.getText();
					Usuario s = LoginConexion.loginUsuario(user);
					System.out.println(s.getId());
					if(user.equalsIgnoreCase(s.getId())) {
						System.out.println("LOGIN CORRECTO");
						
						jf.setVisible(false);
						VentanaPrincipal.ventana();
					} else {
						System.out.println("LOGIN INCORRECTO");
					}
				
				
			}
		});
		
		jf.setVisible(true);
		
		}

}
