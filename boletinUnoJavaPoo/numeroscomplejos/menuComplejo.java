package numeroscomplejos;

import java.util.Scanner;

import numeroscomplejos.complejos.Complejo;

public class menuComplejo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion=0,real=0,imaginario=0;
		
		System.out.println("Introduce la parte real del 1º numero complejo: ");
		real  = Integer.valueOf(sc.nextLine());
		System.out.println("Introduce la parte imaginaria del 1º numero complejo: ");
		imaginario = Integer.valueOf(sc.nextLine());
		Complejo numero1 = new Complejo(real,imaginario);
		System.out.println("Introduce la parte real del 2º numero complejo: ");
		real  = Integer.valueOf(sc.nextLine());
		System.out.println("Introduce la parte imaginaria del 2º numero complejo: ");
		imaginario = Integer.valueOf(sc.nextLine());
		Complejo numero2 = new Complejo(real,imaginario);
		System.out.println(numero1.restarComplejo(numero2));
		
		do {
			System.out.println("Introduce una opcion: \n"
					+"1.- Sumar complejos.\n"
					+"2.- Restar complejos\n"
					+"3.- Salir.");
			opcion = Integer.valueOf(sc.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println(numero1.sumarComplejo(numero2));
				break;
			case 2:			
				System.out.println(numero1.restarComplejo(numero2));
				break;
			case 3:
				System.out.println("Programa terminado.");
				break;
			default:
				System.out.println("Opcion no valida.\n");
				break;
			}
		}while (opcion!=3);
		sc.close();
	}

}
