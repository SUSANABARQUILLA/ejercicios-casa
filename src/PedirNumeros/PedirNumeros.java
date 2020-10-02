package PedirNumeros;

import java.util.Scanner;

public class PedirNumeros {

	private static Scanner sc = new Scanner(System.in);
	private static int numero;

	private static void pedirNumero() {

		System.out.println("Dame un numero entre el 1 y el 100");
		numero = sc.nextInt();

		if (numero <= 10) {

			System.out.println("Tu numero esta entre el 1 y el 10");

		} else if (numero <= 20) {

			System.out.println("Tu numero esta entre el 11 y el 20");

		} else if (numero <= 30) {

			System.out.println("Tu numero esta entre el 21 y el 30");

		} else if (numero <= 40) {

			System.out.println("Tu numero esta entre el 31 y el 40");

		} else if (numero <= 50) {

			System.out.println("Tu numero esta entre el 41 y el 50");

		} else if (numero <= 60) {

			System.out.println("Tu numero esta entre el 51 y el 60");

		} else if (numero <= 70) {

			System.out.println("Tu numero esta entre el 61 y el 70");

		} else if (numero <= 80) {

			System.out.println("Tu numero esta entre el 71 y el 80");

		} else if (numero <= 90) {

			System.out.println("Tu numero esta entre el 81 y el 90");

		} else if (numero <= 100) {

			System.out.println("Tu numero esta entre el 91 y el 100");

		} else {

		}

	}

	private static void opcionNoValida() {

		System.out.println("El numero no esta entre 1 y 100");

	}

	public static void main(String[] args) {

		pedirNumero();
		opcionNoValida();

	}

}
