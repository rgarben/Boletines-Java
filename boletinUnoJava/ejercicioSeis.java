
/*6. Programar un sistema de calefacción-refrigeración que compruebe en función del
día y el mes, la estación en la que estamos y dependiendo de la estación programe
la temperatura: Invierno→19º, Primavera→20º, Verano→24º, Otoño→19º.
El método deberá recibir como parámetro el mes y el día actual y devolver los
grados a los que deberemos programar el sistema.*/

package boletinUnoJava;

import java.util.Scanner;

public class ejercicioSeis {

	public static void main(String[] args) {

		int dia, mes;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el dia: ");
		dia = sc.nextInt();
		System.out.println("Introduce el mes:");
		mes = sc.nextInt();
		
		if ((dia >=20 && dia <=31 && mes==3) || (dia >=1 && dia <=30 && mes==4)||(dia >=1 && dia <=31 && mes==5)||(dia >=1 && dia <=21 && mes==6)) {
			System.out.println("La temperatura es de 20º");
		}else if ((dia >=21 && dia <=30 && mes==6) || (dia >=1 && dia <=31 && (mes==7 || mes==8))||(dia >=1 && dia <=23 && mes==9)) {
			System.out.println("La temperatura es de 24º");
		}else if (dia <0 || dia >31 || mes <0||mes>12) {
			System.out.println("Dia o mes introducido incorreto.");
		}else {
			System.out.println("La temperatura es de 19º.");
		}
		
	}

}
