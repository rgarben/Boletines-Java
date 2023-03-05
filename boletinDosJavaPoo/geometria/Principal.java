package geometria;

import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
		
		Punto p1 = new Punto(1, 3);
		Punto p2 = new Punto(4, 5);
		
		Linea linea1 = new Linea(p1, p2);

		Scanner sc = new Scanner(System.in);
		int opcion=0;
		int opcionMoverLinea=0;
		
		do {
			
			System.out.print("Elija una opcion: \n"
					+ "       1. Mover linea \n"
					+ "       2. Mostrar linea \n"
					+ "       3. Salir \n"
					+ "-->");
			opcion=Integer.valueOf(sc.nextLine());
			
			switch (opcion) {
				case 1: {
					System.out.println("Donde quieres mover la linea: "
							+ "1 Arriba.\n"
							+ "2 Abajo.\n"
							+ "3 Izquierda\n"
							+ "4 Derecha.");
					opcionMoverLinea=Integer.valueOf(sc.nextLine());
					System.out.println("¿Que distancia quieres mover la linea?");
					double distancia=Double.valueOf(sc.nextLine());
					
						switch (opcionMoverLinea) {
							case 1: {
								linea1.subir(distancia);
								break;
							}
							case 2: {
								linea1.bajar(distancia);
								break;
							}
							case 3: {
								linea1.izquierda(distancia);
								break;
							}
							case 4: {
								linea1.derecha(distancia);
								break;
							}						
						}
					break;
				}
				case 2:{
					System.out.println("\n"+linea1+"\n");
					break;
				}
			
			}
			
		}while(opcion!=3);
	sc.close();
	}
	
}
