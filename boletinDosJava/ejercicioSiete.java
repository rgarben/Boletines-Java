
/*7. Realizar un método llamado segundosEntre que recibirá seis valores enteros, los
tres primeros representarán la hora, minuto y segundos de la primera hora y los
otros tres de la segunda hora. Se deberá devolver el número de segundos que hay
entre la primera hora y la segunda (el valor debe ser siempre en positivo). Si los
datos no son correctos se deberá devolver -1000.*/

package boletinDosJava;

public class ejercicioSiete {

	public static void main(String[] args) {
		
		System.out.println(segundosEntre(6, 34, 50, 5, 23, 30));

	}
	public static Integer segundosEntre (int hora1,int minutos1,int segundos1,int hora2,int minutos2,int segundos2) {
		
		int resultado=0;
		
		if (hora1<=23 && hora1>=0 && minutos1<=59 && minutos1>=0 && segundos1<=59 && segundos1>=0 && hora2<=23 && hora2>=0 && minutos2<=59 && minutos2>=0 && segundos2<=59 && segundos2>=0) {
			if (segundos1>segundos2) {
				resultado = segundos1-segundos2;
			}else {
				resultado = segundos2-segundos1;
			}
		}else {
			resultado = -1000;
		}
		
		return resultado;
	}
}