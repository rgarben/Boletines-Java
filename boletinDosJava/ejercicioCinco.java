
/*5. Realizar un método llamado esMultiplo que recibirá dos números y devuelva True si
el primer número es múltiplo del segundo.*/

package boletinDosJava;

public class ejercicioCinco {

	public static void main(String[] args) {
		
		System.out.println(esMultiplo(4, 2));

	}
	
	public static String esMultiplo(int num1,int num2) {
		
		String mensaje="";
		if (num1%num2==0) {
			mensaje+="Es multiplo.";
		}else {
			mensaje="No es multiplo";
		}
	    return mensaje;
	}
}