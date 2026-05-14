package gettersAndSetters;

public class ControlVolumen {
	private int nivel;

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int valor) {
		if (valor >= 0 && valor <= 100) {
			this.nivel = valor;
			System.out.println("El nivel del volumen del dispositivo es: " + nivel);
			
		}  if(valor > 60 && valor < 100){
			System.out.println("El nivel del volumen del dispositivo puede llegar a ser perjudicial");
			
		} else {
			System.out.println("El volumen del dispositivo debe estar en un rango de 0 a 100");
		}
	}
}

