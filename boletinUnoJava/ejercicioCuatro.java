
/* 4. Calcular las calificaciones de un alumno con un método que reciba la nota de la
parte práctica, la nota de los problemas y la parte teórica. La nota final se calcula
según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale
el 50% y la parte teórica el 40%. Las notas deben estar entre 0 y 10, si no lo están,
deberá devolver un mensaje de error.
Realiza el método que calcule la media de tres notas y te devuelva la nota del
boletín (insuficiente, suficiente, bien, notable o sobresaliente). <>*/

package boletinUnoJava;

import java.util.Scanner;

public class ejercicioCuatro {

	public static void main(String[] args) {
		
		int partePractica, notaProblemas, parteTeorica;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la nota de la parte practica: ");
		partePractica = sc.nextInt();
		System.out.println("Introduce la nota de la parte practica: ");
		notaProblemas = sc.nextInt();
		System.out.println("Introduce la nota de la parte practica: ");
		parteTeorica = sc.nextInt();
		
		if (partePractica<=10 && partePractica>=0 && notaProblemas<=10 && notaProblemas>=0 && parteTeorica<=10 && parteTeorica>=0) {
			double notaFinal = partePractica*0.1+notaProblemas*0.5+parteTeorica*0.4;
			System.out.println(notaFinal);
			if (notaFinal<5) {
				System.out.println("Insuficiente.");
			}else if (notaFinal>=5 && notaFinal<5.99) {
				System.out.println("Suficiente.");
			}else if (notaFinal>=6.00 && notaFinal<=7.99) {
				System.out.println("Bien.");
			}else if (notaFinal>=8.00 && notaFinal<=9.99) {
				System.out.println("Notable.");
			}else {
				System.out.println("Sobresaliente.");
			}
		}else {
			System.out.println("Error: Las notas deberan estar comprendidas entre 0 y 10.");
		}
	}

}
