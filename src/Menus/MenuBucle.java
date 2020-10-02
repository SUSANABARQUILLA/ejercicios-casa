package Menus;

import java.util.Scanner;

public class MenuBucle {

	private static Scanner sc = new Scanner(System.in);
	private static int opcionMenu;
	private static int menu;

	public static void main(String[] args) {

		while (opcionMenu != 5) { 
			System.out.println("Elige una opcion");
			System.out.println("1. Comprar");
			System.out.println("2. Vender");
			System.out.println("3. Facturar");
			System.out.println("4. Cambiar");
			System.out.println("5. Salir");

			opcionMenu = sc.nextInt(); 

			if (opcionMenu == 1) {
				menu = 0;
				menuCompras();
			}

			if (opcionMenu == 2) {
				menu = 0;
				menuVentas();
			}

			if (opcionMenu == 3) {
				
				menu = 0;
				menuFacturar();
			}
			if (opcionMenu == 4) {
				menu = 0;

				menuCambiar();
			}
		}
	}

	private static void menuCambiar() {
		while (menu != 5) {
			System.out.println("1. Cambiar alimentacion");
			System.out.println("2. Cambiar bebidas");
			System.out.println("3. Cambiar juguetes");
			System.out.println("4. Cambiar drogueria");
			System.out.println("5. Salir");

			menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("Has entrado en cambiar alimentacion");
			} else if (menu == 2) {
				System.out.println("Has entrado en cambiar bebidas");
			} else if (menu == 3) {
				System.out.println("Has entrado en cambiar juguetes");
			} else if (menu == 4) {
				System.out.println("Has entrado en cambiar drogueria");
			} else if (menu == 5) {
				System.out.println("Has salido de cambiar");
			} else {
				System.out.println("Opcion no valida");
			}

		}
	}

	private static void menuFacturar() {
		while (menu != 5) {
			System.out.println("1. Facturar alimentacion");
			System.out.println("2. Facturar bebidas");
			System.out.println("3. Facturar juguetes");
			System.out.println("4. Facturar drogueria");
			System.out.println("5. Salir");

			menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("Has entrado en facturar alimentacion");
			} else if (menu == 2) {
				System.out.println("Has entrado en facturar bebidas");
			} else if (menu == 3) {
				System.out.println("Has entrado en facturar juguetes");
			} else if (menu == 4) {
				System.out.println("Has entrado en facturar drogueria");
			} else if (menu == 5) {
				System.out.println("Has salido de facturar");
			} else {
				System.out.println("Opcion no valida");
			}
		}
	}
	
	private static void menuCompras() {
		while (menu != 5) {
			System.out.println("1. Comprar alimentacion");
			System.out.println("2. Comprar bebidas");
			System.out.println("3. Comprar juguetes");
			System.out.println("4. Comprar drogueria");
			System.out.println("5. Salir");

			menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("Has entrado en comprar alimentacion");
			} else if (menu == 2) {
				System.out.println("Has entrado en comprar bebidas");
			} else if (menu == 3) {
				System.out.println("Has entrado en comprar juguetes");
			} else if (menu == 4) {
				System.out.println("Has entrado en comprar drogueria");
			} else if (menu == 5) {

				System.out.println("Has salido de compras");
			} else {
				System.out.println("Opcion no valida");
			}

		}
	}
	private static void menuVentas() {
		while (menu != 5) {
			System.out.println("1. Vender alimentacion");
			System.out.println("2. Vender bebidas");
			System.out.println("3. Vender juguetes");
			System.out.println("4. Vender drogueria");
			System.out.println("5. Salir");

			menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("Has entrado en vender alimentacion");
			} else if (menu == 2) {
				System.out.println("Has entrado en vender bebidas");
			} else if (menu == 3) {
				System.out.println("Has entrado en vender juguetes");
			} else if (menu == 4) {
				System.out.println("Has entrado en vender drogueria");
			} else if (menu == 5) {

				System.out.println("Has salido de ventas");
			} else {
				System.out.println("Opcion no valida");
			}

		}
	}
}
