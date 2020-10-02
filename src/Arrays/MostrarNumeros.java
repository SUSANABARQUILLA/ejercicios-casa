package Arrays;

import java.util.Scanner;

public class MostrarNumeros {

	public static void main(String[] args) {

		int[] numeros = new int[5];
		int indice = 0;
		Scanner sc = new Scanner(System.in);

		while (indice < numeros.length) {
			System.out.println("Dame un numero");
			numeros[indice] = sc.nextInt();

			indice++;

		}

		int posicion = 0;
		while (posicion != 9) {
			System.out.println("Dame una posicion");
			posicion = sc.nextInt();

			if (posicion >= 0 && posicion < numeros.length) {
				System.out.println("El valor de la posicion " + posicion + " es " + numeros[posicion]);
			} else if ((posicion < 0 || posicion >= numeros.length) && posicion != 9) {
				System.out.println("La posicion no es valida");
				
			}
		}
	}

}
