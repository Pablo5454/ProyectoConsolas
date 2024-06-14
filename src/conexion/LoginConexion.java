package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Usuario;

public class LoginConexion {

	
	public static Connection conexion() {
		
		Connection con = null;
		String URI = "jdbc:mysql://localhos:3306/almacen";
		String usuario = "root";
		String password = "";
		
		try {
			con = DriverManager.getConnection(URI, usuario, password);
		} catch (Exception e) {
			System.err.println("Error al importar datos de la BBDD.");
		}
		
		return con;
		
	}
	
	public static ArrayList<Usuario> loginUsuario(){
		
		Connection con = conexion();
		
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		try {
			Statement st = con.createStatement();
			String SQL = "SELECT * FROM almacen";
			ResultSet rs = st.executeQuery(SQL);
		} catch (SQLException e) {
			System.err.println("Error al crear el statement loginUsuario");		
		}
		
		
		return listaUsuarios;
	}
}
