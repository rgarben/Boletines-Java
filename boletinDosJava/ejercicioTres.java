
/*3. Diseña una función que, dada una cadena de entrada, comprueba si es una
contraseña fuerte o no. Se considera que una contraseña es fuerte si contiene 8 o
más caracteres, y entre ellos al menos hay una mayúscula, una minúscula, un signo
de puntuación y al menos un dígito.*/

package boletinDosJava;

import java.util.Scanner;

public class ejercicioTres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdusca una contraseña para ver si es fuerte: ");
		String pass = sc.nextLine();
		String mensaje = "";
		boolean tieneM=false,tieneMi=false,tieneN=false,tieneP=false;
		
		
		if (pass.length()>=8) {
			for (int i=0;i<=pass.length()-1;i++) {
				if (Character.isUpperCase(Character.valueOf(pass.charAt(i)))) {
					tieneM=true;
				}
				if (Character.isLowerCase(Character.valueOf(pass.charAt(i)))) {
					tieneMi=true;
				}
				if (Character.isDigit(Character.valueOf(pass.charAt(i)))) {
					tieneN=true;
				}
				if (Character.valueOf(pass.charAt(i))=='.') {
					tieneP=true;
				}				
			}
			if (tieneM==true && tieneMi==true && tieneN==true && tieneP==true) {
				mensaje="Es fuerte.";
			}else {
				mensaje="No es fuerte";
			}
		}else {
			mensaje="No es fuerte";
		}
		System.out.println(mensaje);
	}
}

