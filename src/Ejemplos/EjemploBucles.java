package Ejemplos;

public class EjemploBucles {

	public static void main(String[] args) {
		buqleFor();
		bucleWhile();
		bucleDoWhile();
	}

	private static void bucleDoWhile() {
		System.out.println("\n***********************\n");
		int numero = 21;
		do {
			System.out.println("el valor del numero en el bucle do/while es " + numero);
			numero = numero +1;
		}while(numero < 0);
		
	}

	private static void bucleWhile() {
		System.out.println("\n***********************\n");
		int numero = 1;
		while(numero <= 10) { // while (menu.equals("A")
			
			System.out.println("El valor de numero en el bucle while es " + numero);
			numero = numero + 1;// = numero++
		}
		
	}

	private static void buqleFor() {
		System.out.println("\n***********************\n");
		for (int numero = 100;numero <= 200;numero += 5) {// numero += 5 == numero = numero + 5
			System.out.println("El valor de numero en el bucle for es " + numero);
		}
		
	}

}
