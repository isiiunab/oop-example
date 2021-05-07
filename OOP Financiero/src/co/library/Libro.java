package co.library;

public class Libro extends Publicacion {
	
	int numeroPaginas;
	int anioPublicacion;
	
	public Libro(String titulo, double precio, int numeroPaginas, int anioPublicacion) {
		super(titulo, precio);
		this.numeroPaginas = numeroPaginas;
		this.anioPublicacion = anioPublicacion;
	}
	
	@Override
	public String mostrar() {
		return super.mostrar()
				+ ". Siendo esta un Libro"
				+ " con número de páginas: "+ this.numeroPaginas
				+ " y se publicó en el año: " + this.anioPublicacion;
	}

}
