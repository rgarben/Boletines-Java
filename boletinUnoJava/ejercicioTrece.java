
/*13. Programa que reciba 10 números y nos indique el valor máximo y mínimo.*/

package boletinUnoJava;

import java.util.Scanner;

public class ejercicioTrece {

	public static void main(String[] args) {

		int numero;
		int max=0;
		int min=Integer.MAX_VALUE;
		int contador=0;
		
		Scanner sc = new Scanner(System.in);

		while (contador!=10) {
			System.out.println("Introduce numeros para saber el maximo y el minimo: ");
			contador++;	
			numero=sc.nextInt();

			if (numero>max) {
				max=numero;
			}
			if (numero<min) {
				min=numero;
			}
		}
		System.out.println("El numero maximo: "+max+"\nEl numero minimo: "+min);
	}
}