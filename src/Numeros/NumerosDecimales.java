package Numeros;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class NumerosDecimales {

	private static Scanner sc = new Scanner(System.in);
	private static double numero;

	private static void pedirNumero() {

		System.out.println("Dame un numero entre 1 y -1");
		numero = sc.nextDouble();
	}

	private static void positivoOnegativo() {

		if (numero > 0) {

			if (numero != 1) {
				System.out.println("El numero es positivo y tiene decimales");
				
			}else {
				System.out.println("el numero es positivo");
				
			}

		}

		if (numero < -0) {

			
			if (numero != -1) {

				System.out.println("El numero es negativo y tiene decimales");

			}else {
				System.out.println("El numero es negativo");
				
			}

		}

		if (numero == 0) {

			System.out.println("El numero es neutro");

		}

	}

	public static void main(String[] args) {

		pedirNumero();
		positivoOnegativo();

	}

}
