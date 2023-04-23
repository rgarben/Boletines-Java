package boletin1EstructuraDatosAvanzados.ejercicio7GranAlmacen;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Almacen ikea = new Almacen("Ikea");		
		Scanner sc = new Scanner(System.in);
		String opcion="";
		int num=0;
		
		final String MENU="Programa de control de cajas:\n"+"1. Abrir caja."+"\n2. Cerrar caja."+"\n3. Nuevo cliente."
				+ "\n4. Atender cliente."+"\n5. Salir.";
		
		
		try {

			do {
				
				System.out.println(MENU);
				opcion=sc.nextLine();
				
				switch (opcion) {
				case "1":
					System.out.println("Introduce numero de caja que quieres abrir.");
					num=Integer.valueOf(sc.nextLine());
						ikea.abrirCaja(num);
					break;
				case "2":
					System.out.println("Introduce numero de caja que quieres cerrar.");
					num=Integer.valueOf(sc.nextLine());
						ikea.cerrarCaja(num);
					break;
				case "3":
					ikea.nuevoCliente();
					break;
				case "4":
					System.out.println("Introduce numero de caja que esta el cliente.");
					num=Integer.valueOf(sc.nextLine());
						ikea.cerrarCaja(num);
					ikea.atenderCliente(num);
					break;
				case "5":
					System.out.println("Programa terminado.");
					break;				
				default:
					System.out.println("Opcion del menu no valida.");
					break;
				}				
				
			}while(!opcion.equalsIgnoreCase("5"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}sc.close();
		
	}

}
