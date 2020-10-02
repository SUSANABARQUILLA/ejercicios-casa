package Arrays;

import java.util.Scanner;

public class MenuArrays {

	public static void main(String[] args) {

		int menu = 0;
		int[] numeros = new int[5];
		int indice = 0;
		Scanner sc = new Scanner(System.in);

		while (menu != 5) {
			System.out.println("Elige una opcion");
			System.out.println("1. Pedir numeros");
			System.out.println("2. Mostrar todos los numeros");
			System.out.println("3. Mostrar numero por posicion");
			System.out.println("4. Actualiza posicion");
			System.out.println("5. Salir");

			menu = sc.nextInt();

			if (menu == 1) {
				while (indice < numeros.length) {
					System.out.println("Dame un numero");
					numeros[indice] = sc.nextInt();
					indice++;
				}

			}

			if (menu == 2) {
//				indice = 0;
//				while (indice < numeros.length) {
//					int numero = numeros[indice];
//					System.out.println("el numero de la posicion(indice del array) " + indice + " es " + numero);
//					indice++;
//				}
//				for (int i = 0; i < numeros.length; i++) {
//					int numero = numeros[i];
//					System.out.println("el numero de la posicion(indice del array) " + i + " es " + numero);
//				}
				int indiceFor = 0;
				for (int numero/* int numero = numeros[i]; */ : numeros/* int i = 0; i < numeros.length; i++ */) {

					System.out.println("el numero de la posicion(indice del array) " + indiceFor + " es " + numero);
					indiceFor++;
//					System.out.println("numero " + numero);

				}
			}

			if (menu == 3) {

				int posicion = 0;
				System.out.println("Dame una posicion");
				posicion = sc.nextInt();

				if (posicion >= 0 && posicion < numeros.length) {
					System.out.println("El valor de la posicion " + posicion + " es " + numeros[posicion]);

				} else {
					System.out.println("Opcion no valida");
				}

			}

			if (menu == 4) {

				System.out.println("Dime posicion a cambiar");
				indice = sc.nextInt();
				if (indice < 0 || indice >= numeros.length) {
					System.out.println("Opcion no valida");
				} else {
					System.out.println("Introduce el valor a cambiar");
					numeros[indice] = sc.nextInt();
				}

			}

			if (menu == 5) {

				System.out.println("Has salido");
			}
		}

	}

}
