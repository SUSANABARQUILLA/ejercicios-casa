package Menus;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class MenuSwitch {

	private static Scanner sc = new Scanner(System.in);
	private static int opcionMenu;
	private static int menu;

	public static void main(String[] args) {

		while (opcionMenu != 5) {
			System.out.println("Elige una opcion");
			System.out.println("1. Comprar");
			System.out.println("2. Vender");
			System.out.println("3. Facturar");
			System.out.println("4. Devolver");
			System.out.println("5. Salir");

			opcionMenu = sc.nextInt();

			switch (opcionMenu) {

			case 1:
				menu = 0;
				menuCompras();
				break;

			case 2:
				menu = 0;
				menuVentas();
				break;
			case 3:
				menu = 0;
				menuFacturar();
				break;
			case 4:
				menu = 0;
				menuDevolver();
				break;
			case 5:
				System.out.println("Has salido");
				break;
			default:
				System.out.println("Opcion no valida");
				break;

			}
		}

	}

	private static void menuDevolver() {
		while (menu != 5) {
			System.out.println("Elige una opcion");
			System.out.println("1. Devolver alimentacion");
			System.out.println("2. Devolver tabaco");
			System.out.println("3. Devolver bebidas");
			System.out.println("4. Devolver juguetes");
			System.out.println("5. Salir");

			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Has entrado en devolver alimentacion");
				break;
			case 2:
				System.out.println("Has entrado en devolver tabaco");
				break;
			case 3:
				System.out.println("Has entrado en devolver bebidas");
				break;
			case 4:
				System.out.println("Has entrado en devolver juguetes");
				break;
			case 5:
				System.out.println("Has salido de devolver");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}
	}

	private static void menuFacturar() {
		while (menu != 5) {
			System.out.println("Elige una opcion");
			System.out.println("1. Facturar alimentacion");
			System.out.println("2. Facturar tabaco");
			System.out.println("3. Facturar bebidas");
			System.out.println("4. Facturar juguetes");
			System.out.println("5. Salir");

			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Has entrado en facturar alimentacion");
				break;
			case 2:
				System.out.println("Has entrado en facturar tabaco");
				break;
			case 3:
				System.out.println("Has entrado en facturar bebidas");
				break;
			case 4:
				System.out.println("Has entrado en facturar juguetes");
				break;
			case 5:
				System.out.println("Has salido de facturar");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}
	}

	private static void menuVentas() {
		while (menu != 5) {
			System.out.println("Elige una opcion");
			System.out.println("1. Vender alimentacion");
			System.out.println("2. Vender tabaco");
			System.out.println("3. Vender bebidas");
			System.out.println("4. Vender juguetes");
			System.out.println("5. Salir");

			menu = sc.nextInt();

			switch (menu) {

			case 1:
				System.out.println("Has entrado en  vender alimentacion");
				break;
			case 2:
				System.out.println("Has entrado en vender tabaco");
				break;
			case 3:
				System.out.println("Has entrado en vender bebidas");
				break;
			case 4:
				System.out.println("Has entrado en vender juguetes");
				break;
			case 5:
				System.out.println("Has salido de ventas");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}
	}

	private static void menuCompras() {
		while (menu != 5) {
			System.out.println("Elige una opcion");
			System.out.println("1. Comprar alimentacion");
			System.out.println("2. Comprar tabaco");
			System.out.println("3. Comprar bebidas");
			System.out.println("4. Comprar juguetes");
			System.out.println("5. Salir");

			menu = sc.nextInt();

			switch (menu) {

			case 1:
				System.out.println("Has entrado en comprar alimentacion");
				break;
			case 2:
				System.out.println("Has entrado en comprar tabaco");
				break;
			case 3:
				System.out.println("Has entrado en comprar bebidas");
				break;
			case 4:
				System.out.println("Has entrado en comprar juguetes");
				break;
			case 5:
				System.out.println("Has salido de compras");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}
	}

}
