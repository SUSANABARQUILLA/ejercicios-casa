package Ejemplos;

import java.util.Scanner;

public class EjemploArray {

	public static void main(String[] args) {
		// declaracion de array
		
		int[] numeros = new int[5];
		int indice = 0;
		Scanner sc = new Scanner(System.in);
		
		while (indice < numeros.length) {
			System.out.println("Dame un numero ");
			numeros[indice] = sc.nextInt();
			
			indice++;

		}
	
		for (int i=0;i<numeros.length;i++) {
			System.out.println("El numero del indice " + i + " es " + numeros[i]);
		}
	}

}
