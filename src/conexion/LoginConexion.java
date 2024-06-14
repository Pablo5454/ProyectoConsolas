package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class LoginConexion {

	
	public Connection conexion() {
		
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
}
