/*9. Escribir una función que devuelva el número de palabras, frases y párrafos que
existen en una cadena de texto que recibe como parámetro. Ten en cuenta que entre
dos palabras puede haber más de un blanco, las frases se separan por puntos y los
párrafos por saltos de línea.*/

package boletinTresJava;

public class ejercicioNueve {

	public static void main(String[] args) {
		
		System.out.println(contarPalabrasFrasesParrafos("   Pepe   juan   el de los palotes. Huele mal.   "));

	}

	public static String contarPalabrasFrasesParrafos(String cadena) {
		
		String quitarBlancosAlanteAtras = cadena.trim();
		String total ="";
		int frases = 0;
		int palabra = 1;
		
		for (int i = 0;i<=quitarBlancosAlanteAtras.length()-1;i++) {
			if(Character.valueOf(quitarBlancosAlanteAtras.charAt(i)).equals('.')) {
				frases++;
			}
			if (Character.isWhitespace(quitarBlancosAlanteAtras.charAt(i)) && Character.isLetter(quitarBlancosAlanteAtras.charAt(i+1))){
				palabra++;
			}
		}total = "Hay "+palabra+" palabras, "+frases+" frases y "+quitarBlancosAlanteAtras.lines().count()+" parrafos.";
		return total;
	}
}