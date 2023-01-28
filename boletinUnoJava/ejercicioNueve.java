
/*9.-Método que pida 5 números e imprima si alguno es múltiplo de 3.*/

package boletinUnoJava;

import java.util.Scanner;

public class ejercicioNueve {

	public static void main(String[] args) {
		
		int i=0;
		int numero=0;
		
		Scanner sc = new Scanner(System.in);
		
		while (i!=5) {
			i++;
			System.out.println("Introduce el numero "+i+": ");
			numero = sc.nextInt();
			if (numero%3==0) {
				System.out.println("El numero: "+numero+" es multiplo de 3.");
			}
		}
	}
}