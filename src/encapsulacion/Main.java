package encapsulacion;

public class Main {

	public static void main(String[] args) {
		
		Prenda();
		Libro();

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
