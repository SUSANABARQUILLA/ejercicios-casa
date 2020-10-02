package Operar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Operaciones {
	
	private static Scanner sc = new Scanner(System.in);
	private static int numero1;
	private static int numero2;
	private static int resultado;
	
	
	private static void suma() {
		
		System.out.println("Dame un numero para la suma");		
		numero1 = sc.nextInt();
		System.out.println("Dame otro numero para la suma");
		numero2 = sc.nextInt();		
		resultado = numero1+numero2;
		System.out.println("El resultado de la suma es " + (resultado));
		
	}

	private static void resta() {
		
		System.out.println("Dame un numero para la resta");
		numero1 = sc.nextInt();
		System.out.println("Dame otro numero para la resta");
		numero2 = sc.nextInt();
		resultado = numero1-numero2;	
		System.out.println("El resultado de la resta es " + (resultado));
		
	}
	

	private static void multiplicacion() {
		
		System.out.println("Dame un numero para la multiplicacion");
		numero1 = sc.nextInt();
		System.out.println("Dame otro numero para la multiplicacion");
		numero2 = sc.nextInt();
		resultado = numero1*numero2;
		System.out.println("El resultado de la multiplicacion es " + (resultado));
		
	}
	

	private static void division() {
		
		System.out.println("Dame un numero para la division");
		numero1 = sc.nextInt();
		System.out.println("Dame un otro numero para la division");
		numero2 = sc.nextInt();
		resultado = numero1/numero2;
		System.out.println("El resultado de la division es " + (resultado));
		
	}
	

	private static void resto() {
		
		System.out.println("Dame un numero para el resto de la division");
		numero1 = sc.nextInt();
		System.out.println("Dame otro numero para el resto de la division");
		numero2 = sc.nextInt();
		resultado = numero1%numero2;		
		System.out.println("El resultado del resto de la division es " + (resultado));
		
	}
	
	public static void main(String[] args) {
			
		suma();
		resta();
		multiplicacion();
		division();
		resto();
								
	}

}
