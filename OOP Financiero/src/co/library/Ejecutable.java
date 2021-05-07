package co.library;

import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {	
		
		boolean bandera= true;
		int selectorDePublicacion;		
		Scanner lineaComandos = new Scanner(System.in);	
		
		do {
			
			selectorDePublicacion = selectorPublicacion(lineaComandos);
			
			switch(selectorDePublicacion) {
			case 1:								
				mostrarInformacion(crearLibro(lineaComandos));					
				break;
			case 2:
				break;
			case 3:
				bandera = false;
				break;
			default:
				bandera = false;
				break;		
					
			}
			
			
		}while(bandera);
		
		System.out.println("Gracias por llenar la información");
	
	}
	private static void  mostrarInformacion(Publicacion publicacion) {
		System.out.println(publicacion.mostrar());
	}
	
	private static int selectorPublicacion(Scanner lineaComandos) {		
		System.out.println("######### Bienvenido a discos Stu ######");
		System.out.println("1. Crear Libro");
		System.out.println("2. Crear Disco");
		System.out.println("3. Salir");
		return  lineaComandos.nextInt();
	}
	
	private static Libro crearLibro(Scanner lineaComandos) {
		int  numeroPaginas,anioPublicacion;
		String titulo;
		double precio;
		System.out.println("###### Datos para ingresar Libro #######");
		System.out.println("Ingresar el título:");
		titulo = lineaComandos.next();
		System.out.println("ingrese el precio:");
		precio = lineaComandos.nextDouble();
		System.out.println("número de páginas:");
		numeroPaginas = lineaComandos.nextInt();
		System.out.println("año de publicación:");
		anioPublicacion = lineaComandos.nextInt();				
		return new Libro(titulo, precio, numeroPaginas, anioPublicacion);
	}
	
	

}
