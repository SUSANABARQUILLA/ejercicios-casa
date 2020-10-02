package Menus;

import java.util.Scanner;

public class Menu {
	// Declaracion variable

	private static Scanner sc = new Scanner(System.in);
	private static int opcionMenus;

	// logica

	private static void menu1() {

		System.out.println("Elige una opcion");
		System.out.println("1. Comprar");
		System.out.println("2. Vender");
		System.out.println("3. Salir");

		opcionMenus = sc.nextInt();

		System.out.println("Has elegido la opcion " + opcionMenus);
		
		
	}

	private static void menu2() {

		System.out.println("Elige una opcion");
		System.out.println("1. Cantar");
		System.out.println("2. Bailar");
		System.out.println("3. Ninguna");

		opcionMenus = sc.nextInt();

		System.out.println("Has elegido la opcion " + opcionMenus);

	}

	private static void menu3() {

		System.out.println("Elige una opcion");
		System.out.println("1. Romper");
		System.out.println("2. Pegar");
		System.out.println("3. Ninguna");

		opcionMenus = sc.nextInt();

		System.out.println("Has elegido la opcion " + opcionMenus);

	}

	public static void main(String[] args) {

		menu1();
		menu2();
		menu3();

	}
}
