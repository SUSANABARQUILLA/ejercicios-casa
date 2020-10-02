package Menus;

import java.util.Scanner;

public class MenuComprasCambiado {

	private static Scanner sc = new Scanner(System.in);
	private static int opcionMenu;

	private static void opcionMenu() {

		System.out.println("Elige una opcion");
		System.out.println("1. Compras");
		System.out.println("2. Ventas");
		System.out.println("3. Facturar");
		System.out.println("4. Salir");

		opcionMenu = sc.nextInt();
	}

	private static void comprar() {

		System.out.println("1. Comprar casas");
		System.out.println("2. Comprar coches");
		System.out.println("3. Comprar alimentacion");

		opcionMenu = sc.nextInt();

		if (opcionMenu == 1) {
			System.out.println("Has entrado en comprar casas");

		} else if (opcionMenu == 2) {

			System.out.println("Has entrado en comprar coches");

		} else if (opcionMenu == 3) {

			System.out.println("Has entrado en comprar alimentacion");
		}

		opcionMenu = 0;
	}

	private static void vender() {

		System.out.println("1. Vender casas");
		System.out.println("2. Vender coches");
		System.out.println("3. Vender alimentacion");

		opcionMenu = sc.nextInt();

		if (opcionMenu == 1) {

			System.out.println("Has entrado en vender casas");

		} else if (opcionMenu == 2) {

			System.out.println("Has entrado en vender coches");

		} else if (opcionMenu == 3) {

			System.out.println("Has entrado en vender alimentacion");
		}

		opcionMenu = 0;
	}

	private static void facturar() {

		System.out.println("1.Facturar casas");
		System.out.println("2.Facturar coches");
		System.out.println("3.Facturar alimentacion");

		opcionMenu = sc.nextInt();

		if (opcionMenu == 1) {

			System.out.println("Has entrado en facturar casas");

		} else if (opcionMenu == 2) {

			System.out.println("Has entrado en facturar coches");

		} else if (opcionMenu == 3) {
			System.out.println("Has entrado en facturar alimentacion");

		}
		opcionMenu = 0;
	}

	private static void salir() {

		System.out.println("Has salido");

	}

	private static void opcionNoValida() {

		System.out.println("Opcion no valida");

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

		if (opcionMenu == 4) {
			salir();
		}

		if (opcionMenu >= 0) {
			opcionNoValida();
		}
	}

}
