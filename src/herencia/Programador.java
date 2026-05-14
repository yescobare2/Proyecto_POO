package herencia;

public class Programador extends Empleado {
	private String lenguaje;

	public Programador(String nombre, String lenguaje) {
		super(nombre);
		this.lenguaje = lenguaje;
	}
	
	public void programar()
	{
		System.out.println("El empleado: " + nombre + " esta programando en " + lenguaje);
	}	

}
