
/*10. Realiza un método llamado gcd (greaterCommonDivisor) que recibirá dos números y
devuelva el máximo común divisor según el algoritmo de Euclides.*/

package boletinDosJava;

public class ejercicioDiez {

	public static void main(String[] args) {

		System.out.println(greaterCommonDivisor(24,36));

	}
	public static Integer greaterCommonDivisor(int a,int b) {
		
		int c = a%b;
		int guardar1 = 0;
		int guardar2 = 0;
		int guardar3 = 1;
		int ag=a;
		int bg=b;
		while (guardar3!=0) {
			
			guardar2=c;
			if (c==0) {
				c=ag>bg?b:guardar3;
				guardar3=0;
			}else {
				if (c==guardar2) {
					c = b%guardar2;
				}else {
					c = b%guardar3;
				}
				if (c==0) {
					guardar3=c;
					c=guardar2;
				}else {
		   			guardar3=c;
		 			b=guardar2;
		 			if (c==0) {
		 				c=guardar1;
		 			}else {
		 				guardar1=guardar2%c;
		 				c=guardar1;
		 			}
				}
			}
		}
	return c;
	}
}