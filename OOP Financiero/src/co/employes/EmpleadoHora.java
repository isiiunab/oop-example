package co.employes;

public class EmpleadoHora extends Empleado {
	private int horasTrabajadas;
	private double valorHora;
	private double totalPagar;
	
	
	public EmpleadoHora(Empleado empleado, int horasTrabajadas, double valorHora) {
		super(empleado.getNombre(),empleado.getApellido(), empleado.getArea());
		this.horasTrabajadas = horasTrabajadas;
		this.valorHora = valorHora;
	}
	public EmpleadoHora(String nombre, String apellido, String area, int horasTrabajadas, double valorHora) {
		super(nombre, apellido, area);
		this.horasTrabajadas= horasTrabajadas;
		this.valorHora = valorHora;
	}
	
	@Override
	public String mostrarInfo() {
		return super.mostrarInfo()
				+ " el empleado por hora, trabajó "+ this.horasTrabajadas + " horas"
				+ " el valor de la hora es: "+ this.valorHora
				+ " el total del sueldo fue: "+ this.calcularSueldo();
	}
	
	@Override
	public double calcularSueldo() {
		this.totalPagar = this.horasTrabajadas * this.valorHora;
		return this.totalPagar;
	}
	
}
