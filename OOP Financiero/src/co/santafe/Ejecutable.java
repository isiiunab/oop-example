package co.santafe;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monedero myMonedero = new Monedero(100000);
		
		// un mes despues
		
		myMonedero.agregarDinero(500000);
		
		// un mes 
		
		myMonedero.agregarDinero(500000);
		myMonedero.sacarDinero(50000);
		
		// en el banco
		
		System.out.println("el saldo es:" + myMonedero.consultarSaldo());
		
		// en el banco quiero ver mis movimientos
		
		System.out.println(myMonedero.imprimirMovimientos());

	}
	
	

}
