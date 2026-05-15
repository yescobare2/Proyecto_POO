package overloadingAndOverriding;

public class AvisoModoAhorro extends AvisoBateria{

	@Override
	public void mostrarAviso() {
		super.mostrarAviso();
		System.out.println(" Modo Ahorro de Energia Activado");
	}
	
	

}
