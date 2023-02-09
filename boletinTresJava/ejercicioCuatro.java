
/*4. Crea tres funciones cuyo comportamiento sea como el de los métodos de String
startsWirth, contains y endsWith, pero sin utilizar ninguno de ellos.*/

package boletinTresJava;

public class ejercicioCuatro {


	public static void main(String[] args) {
		
		System.out.println(empiezaCon("hola buenos dias","hola"));
		System.out.println(contienePalabra("hola buenos dias","hola"));
		System.out.println(terminaCon("hola buenos dias","dias"));

	}
	
	public static Boolean empiezaCon(String cadena, String palabra) {
		
		return (cadena.substring(0, palabra.length()).equalsIgnoreCase(palabra));
	}
	
	public static Boolean contienePalabra(String cadena, String palabra) {
		
		return (cadena.indexOf(palabra)>=0);
	}
	
	public static Boolean terminaCon(String cadena, String palabra) {

		return (cadena.substring(cadena.length()-palabra.length(), cadena.length()).equalsIgnoreCase(palabra));
	}
}