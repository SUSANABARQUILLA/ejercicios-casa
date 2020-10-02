package Ejemplos.Objetos;

public class Operaciones {
	
	int numero;
	int numero2;
	
	public Operaciones() {
		numero = 5;
		numero2 = 2;
	}

	public Operaciones(int numero, int numero2) {
		this.numero = numero;
		this.numero2 = numero2;
	}

	
	public void sumar() {
		int resultado = numero + numero2;
		System.out.println("El resultado de la suma es " + resultado );
	}
	
	public int restarConParametros(int numero1, int numero2) {
		int resultado = numero1 - numero2;
		return resultado;
	}

}
