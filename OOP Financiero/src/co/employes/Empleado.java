package co.employes;

public abstract class Empleado {
	private String nombre;
	private String apellido;
	private String area;
	
	public Empleado() {
		
	}
	public Empleado(String nombre, String apellido, String area) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.area=area;
	}
	
	public String mostrarInfo() {
		return this.toString();
	}
	
	
	public double calcularSueldo() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "El empleado: " + this.nombre + " " + this.apellido
				+ " trabaja en el área de: "+ this.area;
	}

}
