package herencia2;

public class Monitor extends Dispositivos{
	private String resolucion;

	public Monitor (String marca, String resolucion) {
		super(marca);
		this.resolucion = resolucion;
	}

	public void descripcion() {		
		System.out.println("El monitor es de marca: " + marca + " resolucion: " + resolucion);
	}
}

