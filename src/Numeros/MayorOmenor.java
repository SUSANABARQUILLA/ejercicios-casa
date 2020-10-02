package Numeros;

import java.io.InputStream;
import java.util.Scanner;

public class MayorOmenor {

	private static Scanner sc = new Scanner(System.in);
	private static int numero1;
	private static int numero2;
	
	private static void numeros(){
		
		System.out.println("Dame un numero");
		numero1=sc.nextInt();
		System.out.println("Dame otro numero");
		numero2=sc.nextInt();
		
		if(numero1>numero2) {
			
			System.out.println("El numero 1 es mayor que numero 2");
			
		}else {
			
			System.out.println("El numero 1 no es mayor que numero 2");
		}
		
	}
		
	
	public static void main(String[] args) {
		
		numeros();
	}

	
	}


