package encapsulacion;

import gettersAndSetters.ControlVolumen;
import gettersAndSetters.NivelAgua;

public class Main {

	public static void main(String[] args) {
		
		Prenda();
		Libro();

		System.out.println("------------------------------------------");
		System.out.println("Getters y Setters");
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
		
	}

	private static void Prenda() {
		Prenda p1 = new Prenda("Pantalon", "Negro", "M");
		Prenda p2 = new Prenda ("Vestido", "Rosado", "S");
		
		System.out.println("Clases, objetos y encapsulamiento");
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
