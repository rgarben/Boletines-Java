
/*3. Diseña un programa que cuente el número de veces que aparece una palabra en
una cadena de texto.*/

package boletinTresJava;

public class ejercicioTres {

	public static void main(String[] args) {

	
		System.out.println(contarPalabraCadena("   hoperrola perro hoperrola perro   ","perro"));

	}
	
	public static Integer contarPalabraCadena(String cadena, String palabra) {
		
		int numeroAparece = 0;
		int indice=0;
		int indice2=0;
		int contador=0;
		
		do {			
			if (cadena.indexOf(palabra)>=0 && numeroAparece==0) {
				numeroAparece++;
				indice =cadena.indexOf(palabra);
			}else if (cadena.indexOf(palabra, indice)>=0 && numeroAparece>0 && (cadena.indexOf(palabra, indice)<=cadena.length()-1) && indice2>=0) {
				indice2 = cadena.indexOf(palabra, indice+1);
				indice=indice2;
				if (indice2>=0) {
					numeroAparece++;
				}
			}
			contador++;
		} while (contador<cadena.length());
		
		return numeroAparece;
	}
}