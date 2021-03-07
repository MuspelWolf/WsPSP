package modelo;

public class Videojuego {
	
	private int id;
	private String nombre;
	private String comp;
	private int precio;
	private int punt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPunt() {
		return punt;
	}
	public void setPunt(int punt) {
		this.punt = punt;
	}
	
	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", comp=" + comp + ", precio=" + precio + ", punt="
				+ punt + "]";
	}
}
