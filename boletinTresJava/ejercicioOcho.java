
/*8. Diseñar una función que reciba como parámetro tres cadenas, la primera será una
frase y deberá buscar si existe la palabra que recibe como segundo parámetro y
reemplazarla por la tercera.*/

package boletinTresJava;

public class ejercicioOcho {

	public static void main(String[] args) {

		System.out.println(sustituirPalabra("hola como estas", "como", "no"));

	}
	
	public static String sustituirPalabra(String cadena, String buscar, String reemplazar) {
		
		String cadenaReemplazada = cadena.replaceAll(buscar, reemplazar);

		return cadenaReemplazada;
	}
}