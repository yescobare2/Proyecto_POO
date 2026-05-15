package polimorfismo2;

public class EntregaBicicleta extends PedidoComida {

	public EntregaBicicleta(int km) {
		super(km);
	}

	@Override
	public void tiempoEntrega() {
		int minutos = km * 8;
		System.out.println("El pedido llegara en aproximadamente " + minutos + " minutos");
	}
     
	
	
}
