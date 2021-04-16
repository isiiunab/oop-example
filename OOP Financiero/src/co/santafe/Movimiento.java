package co.santafe;

import java.util.ArrayList;

public class Movimiento {
	
	private ArrayList<String> movimientos;
	
	public Movimiento() {
		movimientos = new ArrayList<>();
	}
	
	public void registroMovimiento(String mensaje) {
		this.movimientos.add(mensaje);
		
	}
	public String imprimirMovimientos() {		
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < this.movimientos.size(); i++) {
			buffer.append(movimientos.get(i)+ "\n");
		}
		return buffer.toString();
	}

}
