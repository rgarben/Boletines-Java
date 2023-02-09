
/*7. Realizar una función que busque una palabra escondida dentro de un texto. Por
ejemplo, si la cadena es “shybaoxlna” y la palabra que queremos buscar es “hola”,
entonces si se encontrará y deberá devolver True, en caso contrario deberá devolver
False. Las letras de la palabra escondida deben aparecer en el orden correcto en la
cadena que la oculta:
shybaoxlna ⇒ hola: True
soybahxlna ⇒ hola: False*/

package boletinTresJava;

public class ejercicioSiete {

	public static void main(String[] args) {

		System.out.println(palabraEscondida("shybaoxlna","hola"));

	}
	
	public static Boolean palabraEscondida(String cadena, String palabra) {

		String guardar= "";
		int contador =0;
		
		for (int i = 0; i<=cadena.length()-1;i++) {
			if (contador<=palabra.length()-1) {
				String jaja = Character.toString(cadena.charAt(i));
				String jaja2 = Character.toString(palabra.charAt(contador));
				if (jaja.equalsIgnoreCase(jaja2) &&  contador<=palabra.length()-1) {
					contador++;
					guardar+=cadena.charAt(i);
				}
			}
		}
		return guardar.equalsIgnoreCase(palabra);
	}
}