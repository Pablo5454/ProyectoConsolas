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
		String URI = "jdbc:mysql://localhost:3306/almacen";
		String usuario = "root";
		String password = "";
		
		try {
			con = DriverManager.getConnection(URI, usuario, password);
		} catch (Exception e) {
			System.err.println("Error al importar datos de la BBDD.");
		}
		
		return con;
		
	}
	
	public static Usuario loginUsuario(String id){
		
		Connection con = conexion();
		
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		Usuario u = new Usuario();

		try {
			Statement st = con.createStatement();
			String SQL = "SELECT * FROM clientes WHERE id = '"+id+"'";
			ResultSet rs = st.executeQuery(SQL);
			while(rs.next()) {
				u.setId(rs.getString(1));
				u.setNombre(rs.getString(2));
				u.setDireccion(rs.getString(3));
				u.setCodPostal(rs.getString(4));
				u.setTelefono(rs.getString(5));
				
			}
		} catch (SQLException e) {
			System.err.println("Error al crear el statement loginUsuario");		
		}
		
		return u;
	}
}
