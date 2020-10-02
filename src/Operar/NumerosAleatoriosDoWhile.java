package Operar;

import java.util.Scanner;

public class NumerosAleatoriosDoWhile {

	private static Scanner sc = new Scanner(System.in);
	private static int numero;
	private static int contador;

	private static void metodoDoWhile() {

		if (numero >= 10 && numero <= 20) {

			do {

				System.out.println("El numero es " + numero);
				numero++;// Esta linea es igual a numero = numero + 1//

			} while (numero <= 20);

		}

		if (numero >= 30 && numero <= 40) {

			do {

				System.out.println("El numero es " + numero);
				numero = numero+2;
				

			} while (numero <= 100);
		}

		if (numero >= 50 && numero <= 60) {
			contador=0;
			
			do {
				
				contador ++;
				System.out.println("El numero es " + numero);
				numero ++;				

			} while (contador <10);
		}

		if (numero >= 70 && numero <= 80) {

			do {
				System.out.println("El numero es " + numero);
				numero--;

			} while (numero >= 0);
		}

	}

	private static void opcionNoValida() {

		if (numero <= 9 || 
				(numero >= 21 && numero <= 29) || 
				(numero >= 41 && numero <= 49) || 
				(numero >= 61 && numero <= 69) ||
				numero >= 81) {

			System.out.println("opcion no valida");

		}

	}

	private static void pedirNumeros() {

		System.out.println("Dame un numero");
		numero = sc.nextInt();

	}

	public static void main(String[] args) {

		pedirNumeros();
		metodoDoWhile();
		opcionNoValida();

	}

}
