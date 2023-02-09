
/*1. Escribe una función que reciba una cadena de texto y una variable bandera
(par/impar) e imprima solo los caracteres que se encuentran situados en las
posiciones pares o impares (según indique la variable bandera).
Desarrolla el código con un bucle for y después modifica el código para que utilice
una estructura while y do-while.*/

package boletinTresJava;

public class ejercicioUno {

	public static void main(String[] args) {
		
		System.out.println(imprimeCharParOimpartDoWhile("hola mundo", "par"));

	}
	
	public static String imprimeCharParOimpartFor(String cadena, String bandera) {
		
		String resultado = "";
		
		for (int i=0;i<=cadena.length()-1;i++) {
			if (i%2==0 && bandera.equals("par")) {
				if (i==0) {
					resultado += cadena.charAt(i);
				}else {
					resultado += " ,"+cadena.charAt(i);
				}
			}
			if (i%2==1 && bandera.equals("impar")) {
				if (i==0) {
					resultado += cadena.charAt(i);
				}else {
					resultado += " ,"+cadena.charAt(i);
				}
			}
		}
	return resultado;
	}
	public static String imprimeCharParOimpartWhile(String cadena, String bandera) {
		
		String resultado = "";
		int contador=0;
		
		while (contador<cadena.length()-1) {
			
			if (contador%2==0 && bandera.equals("par")) {
				if (contador==0) {
					resultado += cadena.charAt(contador);
					
				}else {
					resultado += " ,"+cadena.charAt(contador);
					
				}
			}
			if (contador%2==1 && bandera.equals("impar")) {
				if (contador==0) {
					resultado += cadena.charAt(contador);
					
				}else {
					resultado += " ,"+cadena.charAt(contador);
					
				}
			}
			contador++;
		}
	return resultado;
	}
	public static String imprimeCharParOimpartDoWhile(String cadena, String bandera) {
		
		String resultado = "";
		int contador=0;
		
		do{
			
			if (contador%2==0 && bandera.equals("par")) {
				if (contador==0) {
					resultado += cadena.charAt(contador);
					
				}else {
					resultado += " ,"+cadena.charAt(contador);
					
				}
			}
			if (contador%2==1 && bandera.equals("impar")) {
				if (contador==0) {
					resultado += cadena.charAt(contador);
					
				}else {
					resultado += " ,"+cadena.charAt(contador);
					
				}
			}
			contador++;
		}while (contador<cadena.length()-1);
	return resultado;
	}
}


