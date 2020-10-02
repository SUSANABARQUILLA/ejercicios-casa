package MenuOperaciones;

import java.util.Scanner;

public class MenuOperaciones {

	private static Scanner sc = new Scanner (System.in);
	private static int numero1;
	private static int numero2;
	private static int resultado;
	private static int opcionMenu;
	
	
	private static void dameNumeros() {
		
		System.out.println("Dame un numero");
		numero1 = sc.nextInt();
		
		System.out.println("Dame otro numero");
		numero2 = sc.nextInt();		
		
	}
		
	private static void opcionMenu() {
					
		System.out.println("Elige una opcion");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Resto");
		System.out.println("6. Salir");
			
		opcionMenu = sc.nextInt();
		
			}
	
	
	private static void sumar() {
		
		
		
		if(opcionMenu==1) {
			
			if(numero1>numero2) {
				System.out.println("Para sumar el numero 1 tiene que ser menor al numero 2");
				
			}
		
			if(numero1<numero2) {
					
				resultado = numero1+numero2;
				System.out.println("El resultado de la suma es " + resultado);
			}
	
			
		}
	}
		
	
	private static void restar() {
		
		if(opcionMenu==2) {
			
			if(numero1<numero2) {
				
				System.out.println("Para restar el numero 1 tiene que ser mayor que el numero 2");
			}
			
			if(numero1>numero2) {
				
				resultado = numero1-numero2;
				System.out.println("El resultado de la resta es " + resultado);
			}
		}
		
		
	}
		
	private static void multiplicar() {
		
		if(opcionMenu==3) {
			
			if(numero1==numero2) {
				
				System.out.println("Para multiplicar los numeros no pueden ser iguales");
			}
			
			if(numero1!=numero2) {
				resultado = numero1*numero2;
				System.out.println("El resultado de la multiplicacion es " + resultado);
				
			}
		}
		
		
	}
	
	private static void dividir() {
		
		if(opcionMenu==4) {
			
			if(numero1<numero2) {
				System.out.println("Para dividir el numero 1 tiene que ser mayor que el numero 2");
			}
			
			if(numero1>numero2) {
				
				resultado = numero1/numero2;
				System.out.println("El resultado de la division es " + resultado);
			}
		}
		
		
	}
	
	private static void resto() {
		
		if(opcionMenu==5) {
			
			if(numero1<numero2) {
				
				System.out.println("Para calcular el resto de la division el numero 1 tiene que ser mayor al numero 2");
			}
			
			if(numero1>numero2) {
				
				resultado =numero1&numero2;
				System.out.println("El resultado del resto de la division es " + resultado);
				
			}
		}
		
	
	}
	
	private static void salir() {
	
		if(opcionMenu==6) {
			
			System.out.println("Has salido ");
		}
	}
	public static void main(String[] args) {
		
		dameNumeros();
		opcionMenu();
		sumar();		
		restar();
		multiplicar();
		dividir();
		resto();
		salir();
		
	}
}

