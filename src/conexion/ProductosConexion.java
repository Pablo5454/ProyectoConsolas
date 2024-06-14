package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Producto;

public class ProductosConexion {

	public static Connection conexion() {
		
		Connection con = null;
		String URI = "jdbc:mysql://localhost:3306/almacen";
		String usuario = "root";
		String password = "";
		
		try {
			con = DriverManager.getConnection(URI, usuario, password);
		} catch (Exception e) {
			System.err.println("Error al conectar con la BBDD.");		}
		
		return con;
	}
	
	public static ArrayList<Producto> verProductos(){
		
		Connection con = conexion();
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		
		try {
			Statement st = con.createStatement();
			String sql = "SELECT * FROM productos";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				Producto p = new Producto();
				p.setId(rs.getInt(1));
				p.setNombre(rs.getString(2));
				p.setProveedor(rs.getString(3));
				p.setPrecio(rs.getDouble(4));
				p.setExistencias(rs.getInt(5));
				
				listaProductos.add(p);
			}
		} catch (SQLException e) {
			System.err.println("Error al crear el statement verProductos");		
		}
		
		return listaProductos;
	}
		
}
