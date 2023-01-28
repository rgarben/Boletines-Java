
/*
 * 2. Escribe un método que reciba por parámetro el día de la semana (Lunes, Martes,
 *	Miércoles, etc) y devuelva qué asignatura toca a primera hora ese día.
 * */

package boletinUnoJava;

import java.util.Scanner;

public class ejercicioDos {

	public static void main(String[] args) {
		
		String dia;
		Scanner sc = new Scanner(System.in);
		dia = sc.nextLine();
		
		if (dia.equals("Lunes")) {
			System.out.println("Entorno de desarrollo.");
		}else if (dia.equals("Martes")) {
			System.out.println("Formación y orientación laboral.");
		}else if (dia.equals("Miercoles") || dia.equals("Viernes")) {
			System.out.println("Sistemas informáticos.");
		}else if (dia.equals("Jueves")) {
			System.out.println("Base de datos.");
		}else {
			System.out.println("Dia introducido no valido.");
		}
	}
}