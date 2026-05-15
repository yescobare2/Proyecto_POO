package polimorfismo;

public class DescuentoEstudiante extends Streaming{
	
	private double tarifaFinal = tarifa *0.60;

	@Override
	public void calcularCosto() {
		System.out.println("Tarifa de suscripcion a pagar aplicando descuento de estudiante (40%): " + tarifaFinal );
		
	}
	
	
	
	

}
