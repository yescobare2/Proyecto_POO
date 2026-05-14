package encapsulacion;

import gettersAndSetters.ControlVolumen;
import gettersAndSetters.NivelAgua;
import herencia.Programador;
import herencia2.Impresora;
import herencia2.Monitor;

public class Main {

	public static void main(String[] args) {
		
		Prenda();
		Libro();

		System.out.println("------------------------------------------");
		System.out.println("GETTERS AND SETTERS");
		System.out.println("------------------------------------------");
		
		System.out.println("---Nivel del agua---");
		NivelAgua recipiente1 = new NivelAgua ();
		recipiente1.setLitros(600);
		recipiente1.setLitros(-100);
		
		System.out.println("---Control de volumen---");
		ControlVolumen disp1 = new ControlVolumen();
		disp1.setNivel(50);
		disp1.setNivel(80);
		disp1.setNivel(145);
		
		System.out.println("------------------------------------------");
		System.out.println("HERENCIA");
		System.out.println("------------------------------------------");
		System.out.println("---Ejercicio 1---");
		Programador prog1 = new Programador("Yesmy", "Java"); 
		prog1.programar();
		
		System.out.println("---Ejercicio 2---");
		Monitor mon1 = new Monitor("Dell", "4k");
		mon1.descripcion();
		
		Impresora imp1 = new Impresora("Canon", "Wi-Fi");
		imp1.imprimir();
	}

	private static void Prenda() {
		Prenda p1 = new Prenda("Pantalon", "Negro", "M");
		Prenda p2 = new Prenda ("Vestido", "Rosado", "S");
		
		System.out.println("------------------------------------------");
		System.out.println("CLASES, OBJETOS Y ENCAPSULAMIENTO");
		System.out.println("------------------------------------------");
		System.out.println("---Prendas agregadas---");
		p1.mostrar();
		p2.mostrar();
		
	}
	
	
	private static void Libro() {
		Libro lib1 = new Libro ("Indigno de ser humano", "Osamu Dazai", 124, 1948);
		Libro lib2 = new Libro ("Coraline", "Neil Gaiman", 160, 2002);
		
		System.out.println("---Libros agregados---");
		lib1.mostrarLibro();
		lib2.mostrarLibro();
	}
	
	
}
