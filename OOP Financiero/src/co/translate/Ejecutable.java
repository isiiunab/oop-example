package co.translate;

public class Ejecutable {

	public static void main(String[] args) {
		
		Saludar mySaludo = new Saludar(new SaludarPortuges());
		
		System.out.println(mySaludo.getSaludo());
		System.out.println(mySaludo.getDespedida());

	}

}
