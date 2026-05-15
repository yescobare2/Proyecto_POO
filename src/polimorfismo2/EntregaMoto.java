package polimorfismo2;

public class EntregaMoto extends PedidoComida{

	public EntregaMoto(int km) {
		super(km);
	}

	@Override
	public void tiempoEntrega() {
		int minutos = km * 4;
		System.out.println("El pedido llegara en aproximadamente: " + minutos + " minutos ");
	}
	
	

}
