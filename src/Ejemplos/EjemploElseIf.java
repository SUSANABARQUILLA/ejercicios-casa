package Ejemplos;


import java.util.Scanner;

public class EjemploElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("dame un mumero");
		int numero = sc.nextInt();
		if (numero == 0) {
			System.out.println("El numero es cero");
		} else if (numero == 1) {
			System.out.println("El numero es 1");
		} else if (numero == 2) {
			System.out.println("El numero es 2");
		} else if (numero == 3) {
			System.out.println("El numero es 3");
		} else if (numero == 4) {
			System.out.println("El numero es 4");
		} else {
			System.out.println("El numero no esta entre o y 4");
		}

	}

}
