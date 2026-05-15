package overloadingAndOverriding;

public class AvisoBateria {
	
	public void mostrarAviso() {
		System.out.println(" ¡Bateria Baja! Conecte el cargador");
	}

	public void mostrarAviso(int porciento) {
		System.out.println("Nivel de bateria al " + porciento + "%. Conecte el cargador");
	}
}
