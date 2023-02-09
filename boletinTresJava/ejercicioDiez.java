
/*10. El cifrado César es un tipo de cifrado por sustitución en el que una letra del alfabeto
es sustituida por otra que se encuentra situada en el abecedario
(abcdefghijklmnñopqrstuvwxyz) un número dado de posiciones desde la primera,
como puede observarse en la siguiente imagen:
Así, por ejemplo, la palabra CASADO, con un cifrado de tres posiciones pasaría a
ser FDVDGR.
a. Realiza una función que cifre un carácter según el cifrado César y un
desplazamiento dado.
b. Elabora una función que, haciendo uso de la anterior, reciba una palabra y un
número fijo de posiciones y la codifique según este algoritmo.
c. Diseña otra función que reciba dos palabras y compruebe si son equivalentes
según este tipo de cifrado e indique el nivel de sustitución utilizado, es decir,
si cifrando una de ellas podemos obtener la otra.
Ej: Si recibe CASADO y FDVDGR debe indicar que son equivalentes
y utilizan un nivel de codificación 3
Si recibe CASADO y AAAABD debe indicar que no son equivalentes.
El programa no debe distinguir entre mayúsculas y minúsculas.*/

package boletinTresJava;

public class ejercicioDiez {

	public static void main(String[] args) {

		System.out.println(comprararCifradoCesarDosPalabras("aBc","AbC",3));

	}
	
	public static Character cifradoCesar(char c, int posicion) {
		
		char cesar = 0;
		int posicionCesar = 0;
		String minus=String.valueOf(c).toLowerCase();
		String abcd ="abcdefghijklmnñopqrstuvwxyz";
		posicionCesar = abcd.indexOf(minus)+posicion;
		
		if (posicionCesar>26) {
			posicionCesar = posicionCesar%26;
		}else {
			cesar = abcd.charAt(posicionCesar);
		}cesar = abcd.charAt(posicionCesar);
		
		return cesar;
	}
	
	public static String cifradoCesarPalabra(String palabra,int posi) {
		
		String palabraCifrada = "";
		
		for (int i=0;i<palabra.length();i++){			
			palabraCifrada+=cifradoCesar(palabra.charAt(i),posi);			
		}		
		return palabraCifrada;
	}
	
	public static String comprararCifradoCesarDosPalabras(String palabra1,String palabra2, int posis) {
		
		String equivalente = "No son equivalentes.";
		
		if (cifradoCesarPalabra(palabra1,posis).equalsIgnoreCase(cifradoCesarPalabra(palabra2,posis))) {
			equivalente = "Son equivalentes.";
		}
		
		return equivalente;
	}
}


