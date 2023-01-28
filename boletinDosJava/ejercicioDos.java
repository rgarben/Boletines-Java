
/*. Realiza un programa que pida un número por teclado y que después muestre ese
número al revés.*/

package boletinDosJava;

import java.util.Scanner;

public class ejercicioDos {

	public static void main(String[] args) {
		
		String numero = "0";
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero para que salga al reves");
		numero = sc.nextLine();
		
		String mensaje = "";
		
		for (int i=numero.length()-1;i>=0;i--) {
			mensaje+=numero.charAt(i);
		}
		System.out.println(mensaje);
	}
}