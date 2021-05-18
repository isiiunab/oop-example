package co.figura;

public class Cuadrado extends Figura {
	
	@Override
	public double area() {
		return super.base * super.altura;
	}
	
	public String estilo() {
		return "escaleno";
	}

}
