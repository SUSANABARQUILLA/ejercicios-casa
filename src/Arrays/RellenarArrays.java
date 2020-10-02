package Arrays;

import java.util.Scanner;

public class RellenarArrays {

	public static void main(String[] args) {

		int menu = 0;
		int[] numeros = new int[5];
//		int indice = 0;
		

		while (menu != 7) {
			menu = mostrarMenu();

			if (menu == 1) {
				rellenarArray(numeros);

			} else if (menu == 2) {
				mostrarContenidoArray(numeros);

			} else if (menu == 3) {
				obtenerValorPosicion(numeros);
				
			} else if (menu == 4) {

				obtenerIndiceDeUnValor(numeros);

			} else if (menu == 5) {

				int valor = 0;
				System.out.println("Dame un valor");
				valor = sc.nextInt();
				int contador = 0;
				for (int valorArray : numeros) {
					if (valorArray == valor) {
						System.out.println("En valor dado si esta en el array");
						break;

					}
					contador++;
					if (contador == numeros.length) {
						System.out.println("El valor dado no esta en el array");
					}
				}
			} else if (menu == 6) {

				int indiceA = 0;
				int indiceB = 0;
				System.out.println("Dame el indice a cambiar");
				indiceA = sc.nextInt();
				System.out.println("Dame otro indice a cambiar");
				indiceB = sc.nextInt();
				int valorRecogido = numeros[indiceA];

				numeros[indiceA] = numeros[indiceB];
				numeros[indiceB] = valorRecogido;

				System.out.println("Los valores se han cambiado correctamente " );

			} else {

				System.out.println("Has salido");
			}
		}
	}
	
	private static int mostrarMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige una opcion");
		System.out.println("1. Dame un numero");
		System.out.println("2. Muestrame los numeros del array");
		System.out.println("3. Dime el valor de un indice del array");
		System.out.println("4. Dime el indice de un valor del array");
		System.out.println("5. Dime si un valor esta en el array");
		System.out.println("6. Cambiar el valor de un indice a otro");
		System.out.println("7. Salir");
		
		return sc.nextInt();
	}
	
	private static void rellenarArray(int[] numeros) {
		int indice = 0;
		while (indice < numeros.length) {
			System.out.println("Dame un numero");
			numeros[indice] = obtenerScanner().nextInt();
			indice++;
		}
	}
	


	private static void mostrarContenidoArray(int[] numeros) {
		int i = 0;
		System.out.print("El valor del array es: {");
		for (int numero : numeros) {
//		for (int i = 0; i < numeros.length; i++) {
//			int numero = numeros[i];
//			System.out.println("El numero del indice " + i + " es " + numero);
			System.out.print(numero + ",");
			i++;
		}
		System.out.println("}");
	}
	
	private static void obtenerValorPosicion(int[] numeros) {
		int posicion = 0;
		System.out.println("Dame una posicion");
		posicion = obtenerScanner().nextInt();
		
		if (posicion >= 0 && posicion < numeros.length) {
			System.out.println("El valor de la posicion " + posicion + " es " + numeros[posicion]);

		} else {
			System.out.println("Opcion no valida");
		}
		
	}
	
	private static void obtenerIndiceDeUnValor(int[] numeros) {
		int valor = obtenerValor(numeros);
		int contador = 0;

		for (int valorArray : numeros) {

			if (valorArray == valor) {
				System.out.println("El indice del valor " + valor + " es " + contador);

				break;
			}
			contador++;
			if (contador == numeros.length) {
				System.out.println("opcion no valida");

			}
		}
	}
	
	private static int obtenerValor(int[] numeros) {
		int valor = 0;
		System.out.println("Dame un valor");
		valor = obtenerScanner().nextInt();
		return valor;
	}
	
	private static Scanner obtenerScanner() {
//		return new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		return sc;
	}
	
}
