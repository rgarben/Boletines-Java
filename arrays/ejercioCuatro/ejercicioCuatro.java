
/*
 * 4. Realizar un programa que solicite la fecha como tres datos numéricos
(día, mes y año). Deberá mostrar la fecha en formato largo.
Introduce el día de la fecha: 15
Introduce el mes de la fecha: 3
Introduce el año de la fecha: 2009
La fecha en formato largo es 15 de Marzo de 2009
Si la fecha introducida es incorrecta se mostrará un mensaje de error:
“Fecha incorrecta” y el programa terminará.
Crear la clase Fecha e incluir el método pasarAformatoLargo que
devuelva una cadena con formato largo.
NOTAS:
• Para guardar los meses del año, utilizar un array de String.
• Utilizar el método diasDeUnMes que devuelve el número de días
de un mes (Relación 4, ejercicio 4).
• Se deben tratar los errores con Excepciones.
 * */

package arrays.ejercioCuatro;

import java.util.Scanner;

import arrays.ejercioCuatro.Fechas.Fecha;

public class ejercicioCuatro {
	
	public static int diasDeUnMes(int mes,int anio) {
		
		int dia=0;
		
		if(mes==4 || mes==6 || mes==9 || mes==11) {
			dia = 30;
		}else if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
			dia = 31;
		}else {
			if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
				dia = 29;
			}else {
				dia = 28;
			}
		}
		
		return dia;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int dia = 0, mes = 0, anio = 0;

		System.out.println("Introduce el mes del año: ");
		mes = Integer.valueOf(sc.nextLine());
	
		System.out.println("Introduce el año: ");
		anio = Integer.valueOf(sc.nextLine());

		System.out.println("Introduce el dia del mes: ");
		dia = Integer.valueOf(sc.nextLine());

		if(mes>0 && mes<=12 && anio>=1500 && anio<=2100 && dia>0 && dia<=diasDeUnMes(mes,anio)) {
			Fecha fecha1 = new Fecha(dia,mes,anio);
			System.out.println(fecha1.pasarFormatoLargo()); 
		}else {
			System.out.println("Fecha incorrecta");
		}
		sc.close();
	}
}