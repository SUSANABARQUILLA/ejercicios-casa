package Numeros;

import java.util.Scanner;

public abstract class PositivoNegativo {

	private static Scanner sc = new Scanner(System.in);
	private static int numero;
	
	private static void mostrarNumero() {
		
		System.out.println("Dame un numero");
		numero = sc.nextInt();
	}
	
	private static void positivoOnegativo() {
		
		if (numero>=0) {
			
			System.out.println("El numero es positivo");
			
		}else {
			
			System.out.println("El numero es negativo");
					
		}
	}
	
	public static void main(String[] args) {
		
	mostrarNumero();
	positivoOnegativo();
		
	}

}
