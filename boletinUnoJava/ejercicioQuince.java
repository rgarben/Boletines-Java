
/*15. Crea un programa que permita sumar N números. El usuario decide cuándo termina
de introducir números al indicar la palabra ‘fin’.*/

package boletinUnoJava;

import java.util.Scanner;

public class ejercicioQuince {

	public static void main(String[] args) {

		int suma=0;
		int num=0;
		String numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero para sumar o escribe fin para termina: ");
		numero = sc.nextLine();
		
		while(numero.equalsIgnoreCase("fin") == false) {

			num = Integer.valueOf(numero);
			suma+=num;
			System.out.println("Introduce un numero para sumar o escribe fin para termina: ");
			numero = sc.nextLine();
		}
		System.out.println("La suma de los numeros es: "+suma);
		System.out.println("Programa terminado.");
	}
}