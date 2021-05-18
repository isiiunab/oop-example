package co.employes;

public class EmpleadoHora extends Empleado {
	
	private PrestacionEmpleado prestacion;	
	private double totalPagar;
	
	
	public EmpleadoHora(Empleado empleado, PrestacionEmpleado prestacion) {
		super(empleado.getNombre(),empleado.getApellido(), empleado.getArea());
		this.prestacion = prestacion;
	}	
	
	
	@Override
	public double obtenerMontoPagado() {
		return this.calcularSueldo();
	}
	@Override 
	public String display() {
		return this.mostrarInfo();
	}
	@Override
	public String mostrarInfo() {
		return super.mostrarInfo()
				+ " el empleado por hora, trabajó "+ this.prestacion.getHorasTrabajadas() + " horas"
				+ " el valor de la hora es: "+ this.prestacion.getValorHora()
				+ " el total del sueldo fue: "+ this.calcularSueldo();
	}
	
	@Override
	public double calcularSueldo() {
		this.totalPagar = this.prestacion.getHorasTrabajadas()* this.prestacion.getValorHora();
		return this.totalPagar;
	}
	
}
