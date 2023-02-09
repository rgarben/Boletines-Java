
/*2. Un número es divisible por 3 si la suma de todas sus cifras reducidas a una cifra es
igual a 0, 3, 6 ó 9.
Por ejemplo, 156 ⇒ 1+5+6=12 ⇒ 1+2 = 3 es divisible,
pero 157 ⇒ 1+5+7 =13 ⇒ 1+3 =4 no lo es.
Elabora un programa que compruebe la divisibilidad por 3 según este algoritmo. El
programa debe comprobar que el número facilitado es válido.*/

package boletinTresJava;

public class ejercicioDos {

	public static void main(String[] args) {
		
		System.out.println(numeroDivisiblePorTres(157));

	}
	
	public static String numeroDivisiblePorTres(int numero) {
	
		int resultado = 0;
		String cadNumero = String.valueOf(numero);
		int contadorNumero = 0;
		String mensaje = "No es divisible por 3.";
		int num2=numero;
		
		for (int i = 0;i<cadNumero.length();i++) {
			if (Character.isDigit(cadNumero.charAt(i))) {
				contadorNumero++;
				if (contadorNumero==cadNumero.length()) {
					for (int j = 0;j<cadNumero.length();j++) {
						String num = String.valueOf(Integer.toString(num2).charAt(j));
						resultado+=Integer.parseInt(num);
						if (resultado==0 || resultado==3 || resultado==6 || resultado==9) {
							mensaje = "Numero es divisible por 3.";
						}else {
							mensaje = "No es divisible por 3.";
						}
					}
				}
			}else {
				mensaje = "Numero no valido.";
			}
		}		
	return mensaje;
	}
}

