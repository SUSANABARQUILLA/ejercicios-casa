package Numeros;

public class NumerosPrimos {

	private static int numero;
	private static int contadorInterno;
	
	public static void main(String[] args) {
	
		numero = 3;
				

		while(numero <= 100) {
			
			numero++;
			
			contadorInterno = numero - 1;
			
			while(contadorInterno >=2) {
				
				if (numero%contadorInterno == 0) {
					
					break;
			
				}
				
				if(contadorInterno==2) {
					
					System.out.println(numero);
					
				}
				
			contadorInterno--;
			
		}

	}
	}
}
