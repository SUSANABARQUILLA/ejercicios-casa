package Numeros;

import java.util.Scanner;

public class Pares {

	private static Scanner sc = new Scanner(System.in);
	private static int numero;
	
	
	private static void pares() {
		
		System.out.println("dame un numero");
		numero = sc.nextInt();
		
		if(numero%2==0) {
			
			System.out.println("El numero es par");
			
		}else {
			
			System.out.println("El numero es impar");
		}
		
	}
	
	public static void main(String[] args) {
		
	pares();
	
		
		

	}

}
