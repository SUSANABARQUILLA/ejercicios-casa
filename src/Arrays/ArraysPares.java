package Arrays;

public class ArraysPares {

	public static void main(String[] args) {

		int numero = 0;
		int[] contador = new int[100];
		int indice = 0;
		
		while (numero <= 200) {
			
			numero++;
			if (numero % 2 == 0) {				
				contador[indice] = numero;
				indice++;

			}

		}
		
		for (int i=0;i<contador.length;i++) {
			
			System.out.println("El numero " + contador[i]);
		}

	}
}
