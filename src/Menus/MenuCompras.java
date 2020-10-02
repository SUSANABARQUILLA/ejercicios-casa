package Menus;

import java.util.Scanner;

public class MenuCompras {

	private static Scanner sc = new Scanner(System.in);
	private static int opcionMenu;

	private static void opcionMenu() {

		System.out.println("Elige una opcion");
		System.out.println("1. Compras");
		System.out.println("2. Ventas");
		System.out.println("3. Facturar");

		opcionMenu = sc.nextInt();

	}

	private static void comprar() {

		

			System.out.println("1. Comprar casas");
			System.out.println("2. Comprar coches");
			System.out.println("3. Comprar Alimentacion");

			opcionMenu = sc.nextInt();

			if (opcionMenu == 1) {

				System.out.println("Has entrado en comprar Casas");

			}

			if (opcionMenu == 2) {

				System.out.println("Has entrado en comprar Coches");

			}

			if (opcionMenu == 3) {

				System.out.println("Has entrado en comprar Alimentacion");

			}

		opcionMenu=-1;

	}

	private static void vender() {

			System.out.println("1. Vender Casas");
			System.out.println("2. Vender Coches");
			System.out.println("3. Vender Alimentacion");

			opcionMenu = sc.nextInt();

			if (opcionMenu == 1) {

				System.out.println("Has entrado en vender Casas");

			}

			if (opcionMenu == 2) {

				System.out.println("Has entrado en vender Coches");

			}

			if (opcionMenu == 3) {

				System.out.println("Has entrado en verder Alimentacion");

			}
		opcionMenu=0;

	}

	private static void facturar() {


			System.out.println("1. Facturar Casas");
			System.out.println("2. Facturar Coches");
			System.out.println("3. Facturar Alimentacion");

			opcionMenu = sc.nextInt();

			if (opcionMenu == 1) {

				System.out.println("Has entrado en facturar casas");

			}

			if (opcionMenu == 2) {

				System.out.println("Has entrado en facturar coches");

			}

			if (opcionMenu == 3) {

				System.out.println("Has entrado en facturar alimentacion");

			}
			
			opcionMenu=0;
		
	}

	public static void main(String[] args) {

		opcionMenu();
		if (opcionMenu == 1) {
			comprar();
		}
		if (opcionMenu == 2) {
			vender();
		}
		if (opcionMenu == 3) {
			facturar();
		}
		

	}
	
}
