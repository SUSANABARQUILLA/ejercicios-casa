package Numeros;

import java.util.Scanner;

public class NumerosPares {

	private static int numero;
	private static int contador;

	public static void main(String[] args) {
		numero=0;
		while (numero <= 100) {
			
			numero++;

			if (numero%2==0) {
				System.out.println(numero);
				
			}
		}

	}
	
}
