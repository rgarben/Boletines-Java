
/*14. Realiza un programa que vaya pidiendo números hasta que se introduzca un
número negativo y nos diga cuántos números se han introducido, la media de los
impares y el mayor de los pares. El número negativo sólo se utiliza para indicar el
final de la introducción de datos pero no se incluye en el cómputo.*/

package boletinUnoJava;

import java.util.Scanner;

public class ejercicioCatorce {

	public static void main(String[] args) {

		int max=0;
		int numero;
		int contador=0;
		int suma=0;
		int media=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Introdusca un numero positivo o uno negativo para finalizar: ");
			numero = sc.nextInt();
			if (numero>0) {
				contador++;
				if (numero%2==1) {
					suma+=numero;
				}else if (numero%2==0 && numero>max){
					max=numero;
				}
			}	
		}while (numero>0);
		media=suma/contador;
		System.out.println("Numero introducidos: "+contador+"\nLa media de los numeros impares es: "+media+"\nEl mayor de los pares es: "+max);
	}
}