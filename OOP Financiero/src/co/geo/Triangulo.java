package co.geo;

public class Triangulo extends FormasDosD  {
	
	private String estilo;
	
	public double calcularArea() {
		return (super.getAncho() * super.getAltura()) / 2;
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+" con estilo: "
				+ this.estilo;
	}
	
}
