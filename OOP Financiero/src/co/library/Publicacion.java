package co.library;

public class Publicacion {
	
	String titulo;
	double precio;
	
	public Publicacion(String titulo, double precio) {
		this.titulo = titulo;
		this.precio = precio;
	}
	
	public String mostrar() {
		return this.toString();
	}
	
	@Override
	public String toString() {
		return "L publicación tiene como título: "
				+ this.titulo
				+ " con un precio de: "
				+ this.precio;
	}

}
