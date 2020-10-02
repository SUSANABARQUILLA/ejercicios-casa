package Menus;

import java.util.Scanner;

class MenuInventado {

	private static Scanner scInt = new Scanner(System.in);
	private static Scanner scString = new Scanner(System.in);
	private static int opcionMenu;
	private static String menu;

	private static void opcionMenu() {

		System.out.println("Elige una opcion");
		System.out.println("1. Comprar");
		System.out.println("2. Vender");
		System.out.println("3. Restaurar");
		System.out.println("4. Cambiar");
		System.out.println("5. Salir");

		opcionMenu = scInt.nextInt();

	}

	private static void comprar() {

		System.out.println("A. Comprar ropa");
		System.out.println("B. Comprar juguetes");
		System.out.println("C. Comprar herramientas");
		System.out.println("D. Comprar madera");
		System.out.println("E. Comprar tela");

		menu = scString.nextLine();

		if (menu.equals("A")) {

			System.out.println("Has entrado en comprar ropa");

		} else if (menu.equals("B")) {

			System.out.println("Has entrado en comprar juguetes");

		} else if (menu.equals("C")) {

			System.out.println("Has entrado en comprar herramientas");

		} else if (menu.equals("D")) {

			System.out.println("Has entrado en comprar madera");
		} else if (menu.equals("E")) {

			System.out.println("Has entrado en comprar tela");

		} else {
			opcionNoValida();
		}

	}

	private static void vender() {

		System.out.println("A. Vender ropa");
		System.out.println("B. Vender juguetes");
		System.out.println("C. Vender herramientas");
		System.out.println("D. Vender madera");
		System.out.println("E. Vender tela");

		menu = scString.nextLine();

		if (menu.equals("A")) {

			System.out.println("Has entrado en vender ropa");

		} else if (menu.equals("B")) {

			System.out.println("Has entrado en vender juguetes");

		} else if (menu.equals("C")) {

			System.out.println("Has entrado en vender herramientas");

		} else if (menu.equals("D")) {

			System.out.println("Has entrado en vender madera");

		} else if (menu.equals("E")) {

			System.out.println("Has entrado en vender tela");

		} else {

			opcionNoValida();
		}
	}

	private static void restaurar() {

		System.out.println("A. Has entrado en restaurar armarios");
		System.out.println("B. Has entrado en restaurar sillas");
		System.out.println("C. Has entrado en restaurar sofas");
		System.out.println("D. Has entrado en restaurar cuadros");
		System.out.println("E. Has entrado en restaurar otras cosas");

		menu = scString.nextLine();

		if (menu.equals("A")) {

			System.out.println("Has entrado en restaurar armarios");

		} else if (menu.equals("B")) {

			System.out.println("Has entrado en restaurar sillas");

		} else if (menu.equals("C")) {

			System.out.println("Has entrado en restaurar sofas");

		} else if (menu.equals("D")) {

			System.out.println("Has entrado en restaurar cuadros");

		} else if (menu.equals("E")) {

			System.out.println("Has entrado en restaurar otras cosas");

		} else {

			opcionNoValida();
		}
	}

	private static void cambiar() {

		System.out.println("A. Has entrado en cambiar ropa");
		System.out.println("B. Has entrado en cambiar juguetes");
		System.out.println("C. Has entrado en cambiar herramientas");
		System.out.println("D. Has entrado en cambiar madera");
		System.out.println("E. Has entrado en cambiar tela");

		menu = scString.nextLine();

		if (menu.equals("A")) {

			System.out.println("Has entrado en cambiar ropa");

		} else if (menu.equals("B")) {

			System.out.println("Has entrado en cambiar juguetes");

		} else if (menu.equals("C")) {

			System.out.println("Has entrado en cambiar herramientas");

		} else if (menu.equals("D")) {

			System.out.println("Has entrado en cambiar madera");

		} else if (menu.equals("E")) {

			System.out.println("Has entrado en cambiar tela");

		} else {

			opcionNoValida();

		}

	}

	private static void salir() {

		System.out.println("Has salido del menu");

	}

	private static void opcionNoValida() {

		System.out.println("Opcion no valida");

	}

	public static void main(String[] args) {

		opcionMenu();

		if (opcionMenu == 1) {
			comprar();
		} else if (opcionMenu == 2) {
			vender();
		} else if (opcionMenu == 3) {
			restaurar();
		} else if (opcionMenu == 4) {
			cambiar();
		} else if (opcionMenu == 5) {
			salir();

		} else if (opcionMenu >= 0) {
			opcionNoValida();

		}
	}

}
