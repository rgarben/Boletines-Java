
/*6. Realizar un método llamado horaMayor que recibirá seis valores enteres, los tres
primeros representarán la hora, minuto y segundos de la primera hora y los otros
tres de la segunda hora. Se deberá devolver un 1 si la primera hora es mayor que la
segunda, un 2 si la segunda hora es mayor que la primera, un 0 si son iguales y un
-1000 si los datos no son correctos.*/

package boletinDosJava;

public class ejercicioSeis {

	public static void main(String[] args) {
		
		System.out.println(horaMayor(04, 45, 23, 23, 23, 13));

	}
	public static Integer horaMayor(int hora1,int minutos1,int segundos1,int hora2,int minutos2,int segundos2) {
		
		int resultado=0;
		if (hora1<=23 && hora1>=0 && minutos1<=59 && minutos1>=0 && segundos1<=59 && segundos1>=0 && hora2<=23 && hora2>=0 && minutos2<=59 && minutos2>=0 && segundos2<=59 && segundos2>=0) {
			if (hora1==hora2 && minutos1==minutos2 && segundos1==segundos2) {
				resultado=0;
			}else if (hora1>hora2) {
					if (minutos1>minutos2) {
						if (segundos1>segundos2) {
							resultado=1;
						}else {
							resultado=2;
						}
						
					}else {
						resultado=2;
					}
				}else {
					resultado=2;
				}
		}else {
			resultado=-1000;
		}
		return resultado;
	}
}