
/*10. Realiza un programa que sume los 100 números siguientes a un número entero y
positivo introducido por teclado. Se debe comprobar que el dato introducido es
correcto (que es un número positivo).*/

package boletinUnoJava;

import java.util.Scanner;

public class ejercicioDiez {

	public static void main(String[] args) {
		
		int numero;
		int suma=0;
		
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		if (numero>0) {
			for (int i=0;i<=100;i++) {
				numero++;
				if (i==100) {
					System.out.println(numero-1);
				}
			}		
		}else {
			System.out.println("El numero tiene que ser positivo.");
		}
	}
}