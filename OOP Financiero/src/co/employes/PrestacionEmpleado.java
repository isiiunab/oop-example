package co.employes;

public class PrestacionEmpleado {
	private int horasTrabajadas;
	private int valorHora;
	
	public PrestacionEmpleado () {
		
	}
	public PrestacionEmpleado (int horasTrabajadas, int valorHora) {
		this.horasTrabajadas = horasTrabajadas;
		this.valorHora = valorHora;
		
	}
	
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public int getValorHora() {
		return valorHora;
	}
	public void setValorHora(int valorHora) {
		this.valorHora = valorHora;
	}
	
	

}
