package co.library;

public class Disco extends Publicacion {
	double duracionMinima;
	
	public Disco (String titulo, double precio, double duracionMinima) {
		super(titulo, precio);
		this.duracionMinima= duracionMinima;
	}
	
	@Override
	public String mostrar() {
		return super.mostrar()
				+ ". Siendo esta un Disco"
				+ " con una duración mínima de: "+ this.duracionMinima;
				
	}
}
