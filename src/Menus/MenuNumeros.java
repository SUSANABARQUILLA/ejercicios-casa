package Menus;

import java.util.Scanner;

public class MenuNumeros {

	private static Scanner sc = new Scanner(System.in);
	private static int numero1;
	private static int numero2;
	private static int menu;
	
	private static void opcionMenu() {
		
		System.out.println("Elige una opcion");		
		System.out.println("1. Pedir un numero");
		System.out.println("2. Pedir dos numeros");
		
		menu =sc.nextInt();
		
		if(menu==1) {
						
			System.out.println("Dame un numero");
			numero1=sc.nextInt();
			System.out.println("El numero es " + numero1);
			
		}else {
			
			System.out.println("Dame dos numeros");
			numero1=sc.nextInt();
			numero2=sc.nextInt();
			System.out.println("Los numeros son el " + numero1 +  " y el " + numero2);
		}
						
							
				}
	
			public static void main(String[] args) {
		
		opcionMenu();

	}

}
