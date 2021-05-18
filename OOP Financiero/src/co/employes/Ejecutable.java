package co.employes;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrestacionEmpleado prestacion = new PrestacionEmpleado(24,15000);
		Empleado myEmpleado = new Empleado("carlos","arguello","docencia");
		EmpleadoHora myEmpleadoHora = new EmpleadoHora(myEmpleado, prestacion);
		EmpleadoHora myEmpleadoHora2 = new EmpleadoHora(new Empleado("maria","camargo","docencia"), new PrestacionEmpleado(24,15000));
		
		Factura myFactura = new Factura("ACH3242","Marcadores",100,1000);
		
		List<PorPagar> deudaEmpresa = new ArrayList<>();
		
		deudaEmpresa.add(myEmpleadoHora);
		deudaEmpresa.add(myEmpleadoHora2);
		deudaEmpresa.add(myFactura);
		double total=0;
		for (PorPagar porPagar : deudaEmpresa) {
			total= total + porPagar.obtenerMontoPagado();			
		}
		
		System.out.println("el total de deuda de ACME es:"+ total);
		
		
		

	}

}
