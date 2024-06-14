package vista;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import conexion.ProductosConexion;
import modelo.Producto;

public class VentanaVer {
	private static JTable jt = new JTable();
	private static DefaultTableModel dtm = new DefaultTableModel();
	public static void ventana() {
		
		JFrame jf = new JFrame("Ventana VER");
		jf.setLocationRelativeTo(null);
		jf.setSize(500, 500);
		jf.setLayout(new FlowLayout());
		
		
		JScrollPane sp = new JScrollPane(jt);
		jf.add(sp);
		
		if(dtm.getColumnCount()==0) {
			dtm.addColumn("ID");
			dtm.addColumn("NOMBRE");
			dtm.addColumn("PROVEEDOR");
			dtm.addColumn("PRECIO");
			dtm.addColumn("EXISTENCIAS");

		}
		
		jt.setModel(dtm);
		
		ArrayList<Producto> p = ProductosConexion.verProductos();
		 for(Producto pr: p) {
			 dtm.addRow(new Object[] {pr.getId(), pr.getNombre(), pr.getProveedor(), pr.getPrecio(), pr.getExistencias()});
		 }
		
		
		jf.setVisible(true);
	}
}
