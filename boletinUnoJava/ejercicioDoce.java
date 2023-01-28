
/*12. Realiza un programa que pida números hasta que se teclee uno negativo y muestre
cuántos números se han introducido.*/

package boletinUnoJava;

import java.util.Scanner;

public class ejercicioDoce {

	public static void main(String[] args) {

		int numero;
		int contador=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero positivo para contar los \nnumeros o uno negativo para terminar el programa: ");
		numero = sc.nextInt();
		
		while (numero>0)	{
			contador++;
			System.out.println("Introdusca otro numero positivo o uno negativo para terminar el programa: ");
			numero = sc.nextInt();
		}
		System.out.println("La cantidad de numeros es: "+contador+"\nPrograma terminado.");

	}

}
