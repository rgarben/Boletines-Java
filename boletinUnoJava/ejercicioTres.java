
/*3. Escribir un método que reciba un carácter y devuelva el tipo de carácter que es.
Debe devolver una de los siguientes mensajes según corresponda:
◦ Letra mayúscula
◦ Letra minúscula
◦ Dígito entre 0 y 9
◦ Signo de puntuación
◦ Espacio en blanco
◦ Paréntesis () o llaves {}
◦ Otro carácter
 */

package boletinUnoJava;

import java.util.Scanner;

public class ejercicioTres {

	public static void main(String[] args) {
		
		char caracter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce caracter: ");
		caracter = sc.nextLine().charAt(0);
		if (Character.isDigit(caracter)) {
			System.out.println("Dígito entre 0 y 9");
		}else if (Character.isUpperCase(caracter)) {
			System.out.println("Letra mayúscula");
		}else if (Character.isLowerCase(caracter)) {
			System.out.println("Letra minúscula");
		}else if (Character.isWhitespace(caracter)) {
			System.out.println("Espacio en blanco");
		}else if (caracter=='.') {
			System.out.println("Signo de puntuación");
		}else if (caracter=='(' || caracter==')' || caracter=='{' || caracter=='}') {
			System.out.println("Paréntesis () o llaves {}");
		}else {
			System.out.println("Otro carácter");
		}

	}

}
