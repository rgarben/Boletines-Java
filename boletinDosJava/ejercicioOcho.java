
/*8. Realiza un método llamado toBinary que reciba un número decimal como
argumento y devuelva un String con el número binario correspondiente.*/

package boletinDosJava;

public class ejercicioOcho {

	public static void main(String[] args) {

		System.out.println(toBinary(6));

	}
	public static String toBinary(int numero) {
		
		int modulo;
		String binario="";
		while (numero>0) {
			modulo = numero%2;
			binario=modulo+binario;
			numero=numero/2;
		}
		return binario;
	}
}