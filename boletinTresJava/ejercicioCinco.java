
/*5. Diseña una función llamada esPalindromo que reciba una cadena de caracteres y
determine si constituye un palíndromo o no. Una palabra es un palíndromo si puede
leerse del mismo modo de izquierda a derecha que de derecha a izquierda. Obvia
los espacios en blanco y caracteres separadores, así como tildes, etc.
Ejemplos de palíndromos: ‘Ligar es ser ágil’, ‘Somos o no somos’.*/

package boletinTresJava;

public class ejercicioCinco {

	public static void main(String[] args) {

		System.out.println(esPalindromo("girafarig"));

	}
	
	public static Boolean esPalindromo(String cadena) {
		
		String vuelta = "";
		
		for (int i=cadena.length()-1;i>=0;i--) {
			vuelta += cadena.charAt(i);
		}
		
		return (vuelta.equalsIgnoreCase(cadena));
	}
}