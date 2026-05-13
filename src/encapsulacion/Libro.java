package encapsulacion;

public class Libro {
	
	private String nombre;
	private String autor;
	private int paginas;
	private int pub;
	
	public Libro(String nombre, String autor, int paginas, int pub) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.paginas = paginas;
		this.pub = pub;
	}
	
	public void mostrarLibro() {
		System.out.println("Nombre del libro: " + this.nombre + " Autor: " + this.autor + " Numero de paginas: " + this.paginas + " Anio de publicacion: " + this.pub);
	}
	
}
