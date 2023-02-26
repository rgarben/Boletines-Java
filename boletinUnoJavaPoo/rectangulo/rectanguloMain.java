package rectangulo;

import java.util.Scanner;

import rectangulo.models.Rectangulo;

public class rectanguloMain {

	public static void main(String[] args) {
		
		Rectangulo recta = new Rectangulo(0,0);
		int ancho=0,longitud=0;
		Scanner sc = new Scanner(System.in);
				
		
		System.out.println("Inserta la longitud del Resctangulo: ");
		ancho = Integer.valueOf(sc.nextLine());
		System.out.println("Inserta la ancho del Resctangulo: ");
		longitud = Integer.valueOf(sc.nextLine());
		recta = new Rectangulo(longitud,ancho);
		
		System.out.println(recta);
		sc.close();
	}
	

}
