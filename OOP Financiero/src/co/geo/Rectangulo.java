package co.geo;

public class Rectangulo extends FormasDosD {
	
	public boolean esCuandrado() {
		if (super.getAltura() == super.getAncho()) {
			return true;
		}else {
			return false;
		}			
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	

}
