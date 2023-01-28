
/*4. Elabora un programa que codifique una cadena, de tal modo que en el resultado se
inviertan cada 2 caracteres. Los caracteres intercambiados no pueden volver a
intercambiarse. Ejemplo:
Entrada -> Hola mundo
Salida ->  oHalm nuod*/

package boletinDosJava;

import java.util.Scanner;

public class ejercicioCuatro {

	public static void main(String[] args) {
		
		String cadena;
		String mensaje="";
		int i =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		cadena = sc.nextLine();
		
		for (i = 1;i<(cadena.length());i+=2) {
			mensaje+=cadena.charAt(i);
			mensaje+=cadena.charAt(i-1);
		}
		if (cadena.length()%2!=0) {
			mensaje+=cadena.charAt(cadena.length()-1);
		}
		System.out.println(mensaje);
	}
}