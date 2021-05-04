package co.geo;

public abstract class FormasDosD {
	
	private double ancho;
	private double altura;
	
	@Override
	public String toString() {
		return "el ancho es: "
				+ this.ancho
			    + " la altura es: "
				+ this.altura;
	}

	public double getAncho() {
		return this.ancho;
	}
	public void setAncho(double ancho) {
		this.ancho=ancho;
	}
	
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double altura) {
		this.altura=altura;
	}
}
