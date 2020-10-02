package Operar;

import java.util.Scanner;

public class NumerosAleatoriosFor {

	private static Scanner sc = new Scanner(System.in);
	private static int numero;

	private static void metodoFor() {

		if (numero >= 10 && numero <= 20) {

			for (int contador = numero; contador <= 20; contador++) {

				System.out.println("El numero es " + numero);
				numero++;
			}
		}

		if (numero >= 30 && numero <= 40) {

			for (int contador = numero; contador <= 100; contador += 2) {
				System.out.println("El numero es " + numero);
				numero += 2;
			}

		}

		if (numero >= 50 && numero <= 60) {

			for (int contador = 1; contador <= 10; contador++) {
				System.out.println("El numero es " + numero);
				numero++;
			}
		}

		if (numero >= 70 && numero <= 80) {

			for (int contador = numero; contador >= 0; contador--) {
				System.out.println("El numero es " + numero);
				numero--;
			}
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
		metodoFor();
		opcionNoValida();

	}

}
