package Ejemplos;

import java.util.Scanner;

public class EjemploAndOr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero");
		int numero = sc.nextInt();
		if (numero > 0 && numero <= 10) {
				System.out.println("El numero esta entre 1 y 10");
		}else if (numero > 10 && numero <= 20) {
			System.out.println("El numero esta entre 11 y 20");
		}
		

	}

}
