package jarras;

import java.util.Scanner;

import jarras.jarra.Jarra;

public class menu {

	public static void main(String[] args) {

		Jarra A = new Jarra();
		Jarra B = new Jarra();
		Scanner sc = new Scanner(System.in);
		int capa=0;
		String opcion="";
		int totalAgua=0;
		System.out.println("Introduce capacidad para la jarra A: ");
		capa = Integer.valueOf(sc.nextLine());
		A.setCapacidad(capa);
		System.out.println("Introduce capacidad para la jarra B: ");
		capa = Integer.valueOf(sc.nextLine());
		B.setCapacidad(capa);
		
		
		do {
			System.out.println("1. Llenar jarra.\n"
					+ "2. Vaciar jarra.\n"
					+ "3. Volcar jarra A en B.\n"
					+ "4. Volcar jarra B en A.\n"
					+ "5. Ver estado de las jarras.\n"
					+ "6. Salir.");
			opcion = sc.nextLine();
			switch (opcion) {
			case "1":
				System.out.println("¿Qué jarra desea llenar (A/B)?");
				opcion = sc.nextLine();
				if (opcion.equalsIgnoreCase("A")) {
					A.llenarJarra(A);
				}else {
					B.llenarJarra(B);
				}
				break;
			case "2":
				System.out.println("¿Qué jarra desea vaciar (A/B)?");
				opcion = sc.nextLine();
				if (opcion.equalsIgnoreCase("A")) {
					A.vaciarJarra(A);
				}else {
					B.vaciarJarra(B);
				}
				break;
			
			case "3":
				A.volcarJarra(B);
				break;
			case "4":
				B.volcarJarra(A);
				break;
			case "5":
				System.out.println(" Jarra A: \n"+A+" Jarra B "+B);
				break;
			case "6":
				System.out.println("Saliendo del programa, total de agua gastada: "+totalAgua+".");
				break;

			default:
				break;
			}
		}while (!opcion.equalsIgnoreCase("6"));
		sc.close();
	}

}
