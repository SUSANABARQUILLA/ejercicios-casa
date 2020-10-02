package Multiplos;

import java.util.Scanner;

public class Multiplos {
	
	private static Scanner sc = new Scanner(System.in);
	private static int numero;
	

	private static void multiplos() {
		
		System.out.println("Dame un numero");
		numero = sc.nextInt();
									
			if(numero%2==0) {
				
				System.out.println("El numero es multiplo de 2 ");
			}
				
			if(numero%3==0) {
				
				System.out.println("El numero es multiplo de 3 ");			
		}
			
			if(numero%5==0) {
				
				System.out.println("El numero es multiplo de 5 ");
			}
			
			if(numero%7==0) {
				
				System.out.println("El numero es multiplo de 7 ");
			}
			
	}
	
	
	public static void main(String[] args) {
		
		multiplos();
			
	}

}
