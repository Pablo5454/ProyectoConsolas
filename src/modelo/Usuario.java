package modelo;

public class Usuario {
	private String id;
	private String nombre;
	private String direccion;
	private String codPostal;
	private String telefono;
	public Usuario(String id, String nombre, String direccion, String codPostal, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.telefono = telefono;
	}
	public Usuario() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", codPostal=" + codPostal
				+ ", telefono=" + telefono + "]";
	}
	
	
}
