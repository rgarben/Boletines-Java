
/*16. Pedir 10 valores numéricos que representan el salario mensual de 10 empleados.
Mostrar su suma y cuantos hay mayores de 1000€.*/

package boletinUnoJava;

import java.util.Scanner;

public class ejercicioDieciseis {

	public static void main(String[] args) {

		int numero =0;
		int suma = 0;
		int salario=0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<10;i++) {
			System.out.println("Introduce numeros de los salarios: ");
			numero=sc.nextInt();
			suma+=numero;
			if (numero>1000) {
				salario++;
			}
		}System.out.println("La suma de todos los salarios es: "+suma+"\nHay "+salario+" salarios mayores que 1000€");
	}
}