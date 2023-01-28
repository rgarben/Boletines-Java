
/*8. Método que pida 15 números y realice su suma.*/

package boletinUnoJava;

import java.util.Scanner;

public class ejercicioOcho {

	public static void main(String[] args) {
		int numero=0;
		int i=0;
		int suma=0;
		Scanner sc = new Scanner(System.in);
		
		while (i!=15) {
			i++;
			System.out.println("Introduce el numero "+i+": ");
			numero = sc.nextInt();
			suma+=numero;
		}
		if (i==15) {
			System.out.println(suma);
		}
	}
}
