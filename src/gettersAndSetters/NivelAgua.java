package gettersAndSetters;

public class NivelAgua {
	private double mlitros;

	public double getLitros() {
		return mlitros;
	}

	public void setLitros(double cantidad) {
		if (cantidad >= 0 && cantidad <= 1000) {
			this.mlitros = cantidad;
			System.out.println("El recipiente contiene:  " + cantidad + " mililitros ");
		}
		else {
			System.out.println("Capacidad fuera del rango (0-1000)");
		}
	}
	
	

}
