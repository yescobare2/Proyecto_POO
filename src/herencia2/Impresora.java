package herencia2;

public class Impresora extends Dispositivos {
	private String conexion;

	public Impresora(String marca, String conexion) {
		super(marca);
		this.conexion = conexion;	
	}
	
	public void imprimir() {
		System.out.println("La marca de la impresora es: " + marca + " conectada mediante " + conexion);
	}
}
