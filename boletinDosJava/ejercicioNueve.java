
/*9. Realiza un método llamado toDecimal que reciba un String con un valor numérico
en binario como argumento y devuelva un número con el número decimal
correspondiente.*/

package boletinDosJava;

public class ejercicioNueve {

	public static void main(String[] args) {

		System.out.println(toDecimal("1000"));

	}
	public static Integer toDecimal(String numero) {
		
		int decimal = 0;
		for (int i=0;i<=numero.length()-1;i++) {
			if (numero.charAt(i)=='1') {
				decimal += Math.pow(2, numero.length()-1-i);
			}
		}
	return decimal;
	}
}