package co.translate;

public class Saludar {
	
	Presentador presentador;
	
	public Saludar(Presentador presentador) {
		this.presentador = presentador;
	}
	
	public String getSaludo() {
		return presentador.saludar();
	}
	public String getDespedida() {
		return presentador.despedirse();
	}
}
