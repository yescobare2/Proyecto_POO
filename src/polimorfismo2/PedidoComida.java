package polimorfismo2;

public class PedidoComida {
	protected int km;

	public PedidoComida(int distancia) {
		this.km = distancia;
	}
	
	public void tiempoEntrega() {
		System.out.println("Su pedido esta en camino (tipo de vehiculo desconocido)");
	}

}
