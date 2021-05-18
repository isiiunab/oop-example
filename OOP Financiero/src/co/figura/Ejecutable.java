package co.figura;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura myFigura = new Figura();
		myFigura.altura = 5;
		myFigura.base = 10;
		
		System.out.println("el área es: "+ myFigura.area());
		
		Cuadrado myCuadrado = new Cuadrado();
		myCuadrado.altura = 5;
		myCuadrado.base = 5;
		
		System.out.println("el área es: "+ myCuadrado.area() + "m2");
		
		Figura myFigura2 = new Cuadrado();
		myFigura2.altura=5;
		myFigura2.base = 5;
		
		System.out.println("el área es: "+ myFigura2.area() + "m2");
		

	}

}
