package Operar;

import java.util.Scanner;

public class NumerosAleatorioswhile {

	private static Scanner sc = new Scanner(System.in);
	private static int numero;
	private static int contador;

	public static void main(String[] args) {

		pedirNumeros();		
		opcionNoValida();
		metodoWhile();
	}

	private static void metodoWhile() {

		if (numero >= 10 && numero <= 20) {

			while (numero <= 20) {
				System.out.println("El numero es " + numero);
				numero ++;
			}

		}

		if (numero >= 30 && numero <= 40) {

			while (numero <= 100) {

				System.out.println("El numero es " + numero);
				numero +=2;

			}

		}

		if (numero >= 50 && numero <= 60) {
			contador = 1;
			while (contador <= 10) {
				contador++;

				System.out.println("El numero es " + numero);
				numero ++;

			}
		}

		if (numero >= 70 && numero <= 80) {

			while (numero >= 0) {

				System.out.println("El numero es " + numero);
				numero --;

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

}
