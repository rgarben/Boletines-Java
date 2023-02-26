package banco;

import java.util.Scanner;

import banco.models.Cuenta;

public class menubanco {

	public static void main(String[] args) {
		
		int opcion=0;
		double dinero = 0;
		String salir="";
		
		Scanner sc = new Scanner(System.in);
		Cuenta cuenta = new Cuenta();
		
		System.out.println("Introduce el saldo inicial de tu cuenta: ");
		
		cuenta.ingreso(Double.valueOf(sc.nextLine()));
		
		
		System.out.println("1. Hacer un reintegro, se pedirá la cantidad a retirar.\n"
				+ "2. Hacer un ingreso, se pedirá la cantidad a ingresar.\n"
				+ "3. Consultar el saldo y el número de reintegros e ingresos realizados.\n"
				+ "4. Finalizar las operaciones.");
		opcion = Integer.valueOf(sc.nextLine());
		
		do {
		
			switch (opcion) {
			case 1:
				System.out.println("Introduce dinero que quieras retirar: ");
				dinero = Double.valueOf(sc.nextLine());
				cuenta.retirar(dinero);
				break;
				
			case 2:
				System.out.println("Introduce dinero que quieras ingresar: ");
				dinero = Double.valueOf(sc.nextLine());
				cuenta.ingreso(dinero);
				break;
				
			case 3:
				cuenta.toString();
				break;
				
			case 4:
				System.out.println("¿Quieres salir del programa?");
				salir = sc.nextLine();
				if (salir.equalsIgnoreCase("si")) {
					System.out.println("Programa terminado.");
					break;				
				}
				break;
	
			default:
				break;
			}
	
		}while (opcion !=4 || !salir.equalsIgnoreCase("si"));
		sc.close();
	}
	
}
