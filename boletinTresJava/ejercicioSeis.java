
/*6. Haciendo uso de la función anterior crea una función esCapicúa que acepte
números tanto enteros como decimales.*/

package boletinTresJava;

public class ejercicioSeis {

	public static void main(String[] args) {

		System.out.println(esCapicua(46664.46664));

	}
	
	public static Boolean esCapicua(int numero) {
		
		String cadena = String.valueOf(numero);
		String vuelta = "";
		
		for (int i=cadena.length()-1;i>=0;i--) {
			vuelta += cadena.charAt(i);
		}
		
		return (vuelta.equalsIgnoreCase(cadena));
	}
	
	public static Boolean esCapicua(double numero) {
		
		String cadena = String.valueOf(numero);
		String vuelta = "";
		
		for (int i=cadena.length()-1;i>=0;i--) {
			vuelta += cadena.charAt(i);
		}
		
		return (vuelta.equalsIgnoreCase(cadena));
	}
}