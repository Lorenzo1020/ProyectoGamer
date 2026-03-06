package Dominio;

public class VideoJuegos {
	
	private String nombre;
	private float precio;
	private String genero;
	private boolean estatus;
	
	public VideoJuegos(String nombre, float precio, String genero, boolean estatus) {
		this.nombre = nombre;
		this.precio = precio;
		this.genero = genero;
		this.estatus = estatus;
	}
	
	
	@Override
	public String toString() {
		return "VideoJuegos [nombre=" + nombre + ", precio=" + precio + ", genero=" + genero + ", estatus=" + estatus
				+ "]\n";
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	

}
