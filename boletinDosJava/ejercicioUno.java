
/*1. Realizar un método llamado numeroSolucionesEcuacionSegundoGrado que reciba
los coeficientes de una ecuación de segundo grado y devuelva el número de
soluciones que tiene. Si los argumentos no son válidos (el primer coeficiente tiene
que ser distinto de cero) debe devolver un -1.*/

package boletinDosJava;

public class ejercicioUno {

	public static void main(String[] args) {
		
		System.out.println(ecuacionSegundo(1,-4,2));

	}
	public static String ecuacionSegundo(int a,int b,int c) {
		
	    double discriminante =  b * b - 4 * a * c;
	    String mensaje = "";
	    if (discriminante < 0) {
	    	mensaje+="No se puede calcular en numeros reales.";
	    }else {
	        if (discriminante != 0) {
	        	mensaje+="Tiene 2 resultados.";
	        }
	        else {
	        	mensaje+="Tiene 1 resultado.";
	        }	            
	    }
	    return mensaje;
	}
}