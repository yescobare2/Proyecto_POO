package encapsulacion;

public class Prenda {
	
	private String nombre;
	private String color;
	private String talla;
	
	public Prenda(String nombre, String color, String talla) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.talla = talla;
	}
	
	public void mostrar() {
		System.out.println("Prenda: " + this.nombre + " Color: " + this.color + " Talla: " + this.talla);
	}

}
