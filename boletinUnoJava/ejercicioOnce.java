
/*11. Realiza un programa que pida números y muestre su cuadrado, repitiendo el
proceso hasta que se introduzca un número negativo.*/

package boletinUnoJava;

import java.util.Scanner;

public class ejercicioOnce {

	public static void main(String[] args) {
		
		int numero;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero positivo para saber su \ncuadrado o negativo para terminar el programa: ");
		numero = sc.nextInt();
		
		while (numero>0)	{
			num=numero*numero;
			System.out.println("El cuadrado de "+numero+"² es: "+num);
			System.out.println("\nIntrodusca otro numero positivo o negativo para terminar el programa: ");
			numero = sc.nextInt();
		}
		System.out.println("Programa terminado.");
	}
}