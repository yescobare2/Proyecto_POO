package overloadingAndOverriding;

public class Lampara {
	
	public void encender() {
		System.out.println("La lampara esta encendida");
	}
	
	public void encender(String color) {
		System.out.println("La lampara esta encendida con luz de color " + color );
	}

}
