package Ejemplos.Objetos;

public class Principal {

	public static void main(String[] args) {
		System.out.println("el codigo empieza por aqui");
		Operaciones op = new Operaciones();
		op.sumar();
		op.restarConParametros(8, 3);
		op = new Operaciones(7,4);
		op.sumar();
		int resultado = op.restarConParametros(8, 3);
		System.out.println("El resultado de la resta es " + resultado);
	}
	
}
