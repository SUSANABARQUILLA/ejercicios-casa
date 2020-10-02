package Mensajes;


public class MostrarMensajes {
	
	private static int numeroA =5;
	private static int numeroB =2;	
	
	private int mostrarValorNumeros = 0;
	
	private static void mostrarValorNumeros() {
		
		System.out.println("*****Has entrado en el metodo mostrarValorNumeros******");		
		
		System.out.println(numeroA);
		System.out.println(numeroB);
		
		System.out.println("El valor de la numeroA es " + numeroA);
		System.out.println("El valor de la numeroB es " + numeroB);
		
		System.out.println("-----Has salido del metodo mostrarValorNumeros------\n");
		
	}

	private static void resultadoOperaciones() {
		
		System.out.println("Has entrado en el metodo resultadoOperaciones");
		
		System.out.println(numeroA + numeroB);
		System.out.println(numeroA - numeroB);
		System.out.println(numeroA * numeroB);
		System.out.println(numeroA / numeroB);
		System.out.println(numeroA % numeroB);
		
				
		System.out.println("El resultado de la suma es " + (numeroA + numeroB));
		System.out.println("El resultado de la resta es " + (numeroA - numeroB));
		System.out.println("El resultado de la multiplicacion es " + (numeroA * numeroB));
		System.out.println("El resultado de la division es " + (numeroA / numeroB));
		System.out.println("El resultado resto de la division es " + (numeroA % numeroB));
		
		int suma = numeroA+numeroB;
		int resta = numeroA-numeroB;
		int multiplicacion = numeroA*numeroB;
		int division = numeroA/numeroB;
		int resto = numeroA%numeroB;
		
		
		System.out.println("El resultado de la variable suma es " + suma);
		System.out.println("El resultado de la variable resta es " + resta);
		System.out.println("El resultado de la variable multiplicacion es " + multiplicacion);
		System.out.println("El resultado de la variable division es " + division);
		System.out.println("El resultado del variable resto es " + resto);
		
		System.out.println("Has salido del metodo resultadoOperaciones\n");
		
	}
	private static void comparacionesNumeros() {
		
		System.out.println("Has entrado en el metodo comparacionesNumeros");
		
		System.out.println("Estos numeros son iguales " +  (numeroA==numeroB));
		System.out.println("Estos numeros son distintos " + (numeroA!=numeroB));
		System.out.println("El numeroA es mayor que numeroB es " +(numeroA>numeroB));
		System.out.println("El numeroA es menor que numeroB es " +(numeroA<numeroB));
		System.out.println("El numeroB es mayor que numeroA es " +(numeroB>numeroA));
		System.out.println("El numeroB es menor que numeroA es " +(numeroB<numeroA));
		System.out.println("El numeroA es mayor o igual que numeroB es " +(numeroA>=numeroB));
		System.out.println("El numeroA es menor o igual que numeroB es " +(numeroA<=numeroB));
		System.out.println("El numeroB es mayor o igual que numeroA es " +(numeroB>=numeroA));
		System.out.println("El numeroB es menor o igual que numeroA es " +(numeroB<=numeroA));
	
		boolean AigualB = numeroA==numeroB;
		boolean AdistintoB = numeroA!=numeroB;
		boolean AmayorB = numeroA>numeroB;
		boolean AmenorB = numeroA<numeroB;
		boolean BmayorA = numeroB>numeroA;
		boolean BmenorA = numeroB<numeroA;
		boolean AmayorigualB = numeroA>=numeroB;
		boolean AmenorigualB = numeroA<=numeroB;
		boolean BmayorigualA = numeroB>=numeroA;
		boolean BmenorigualA = numeroB<=numeroA;
		
		
		System.out.println("La variable AigualB es " + (AigualB));
		System.out.println("La variable AdistintoB es " + (AdistintoB));
		System.out.println("La variable AmayorB es " + (AmayorB));
		System.out.println("La variable AmenorB es " + (AmenorB));
		System.out.println("La variable BmayorA es " + (BmayorA));
		System.out.println("La variable BmenorA es " + (BmenorA));
		System.out.println("La variable AmayorigualB es " + (AmayorigualB));
		System.out.println("La variable AmenorigualB es " + (AmenorigualB));
		System.out.println("La variable BmayorigualA es " + (BmayorigualA));
		System.out.println("La variable BmenorigualA es " + (BmenorigualA));
		
		System.out.println("Has salido del metodo comparacionesNumeros\n");
		
	}
	
	private static void falsoVerdadero() {
		
		System.out.println("Has entrado en el metodo falsoVerdadero");
		
		boolean falso = false;
		
		System.out.println(falso);
		System.out.println("El boolean es " + falso);
		
		System.out.println("Has salido del metodo falsoVerdadero\n");
		
	}
	
	private static void caracteres() {
		
		System.out.println("Has entrado en el metodo caracteres");
		
		char caracter = '&';
		
		System.out.println(caracter);
		System.out.println("El caracter es " + caracter);
		
		System.out.println("Has salido del metodo caracteres\n");
		
	}
	
	public static void main(String[] args) {

		mostrarValorNumeros();

		resultadoOperaciones();
		
		comparacionesNumeros();
		
		falsoVerdadero();	
		
		caracteres();
		
		
	}
	
	

}
