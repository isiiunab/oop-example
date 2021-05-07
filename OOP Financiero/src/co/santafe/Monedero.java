package co.santafe;

public class Monedero {
	private double dinero;
	private Movimiento movimientos;
	
	public Monedero(double dinero) {
		movimientos = new Movimiento();
		this.movimientos.registroMovimiento("[CREAR CUENTA] creación de cuenta con: "+ dinero);
		this.agregarDinero(dinero);		
		
	}
	
	public boolean agregarDinero(double dinero) {
		if (dinero > 0) {
			this.dinero += dinero;
			this.movimientos.registroMovimiento("[AGREGAR DINERO] se agregó: "+ dinero);			
			return true;			
		} else {
			return false;
		}
	}
	public boolean sacarDinero(double dinero) {
		if (this.dinero > dinero) {
			this.dinero -= dinero;
			this.movimientos.registroMovimiento("[SACAR DINERO] se sacó: "+ dinero);
			return true;
		}else {
			return false;
		}		
	}
	
	public double consultarSaldo() {
		return this.dinero;
	}
	
	public String imprimirMovimientos() {
		return this.movimientos.imprimirMovimientos();
	}

}
