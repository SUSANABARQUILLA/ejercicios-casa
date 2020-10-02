package Ejemplos;

import java.util.Scanner;

public class EjemploSwitch {

	private static int numero;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Dame un numero");
		numero = sc.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("El numero es primo");
			break;
		case 2:
			System.out.println("El numero es par");
			break;
		case 3:
			System.out.println("El numero es impar");
			break;

		default:
			System.out.println("El numero no esta entre 1 y 3");
			break;
		}
		

	}

}
