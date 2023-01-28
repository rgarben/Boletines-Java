
/*11. Realizar un método llamado minimoComunMultiplo que reciba dos números y
calcule el mínimo común múltiplo de dos números. Con el máximo común divisor de
una pareja de números podemos obtener fácilmente el mínimo común múltiplo de
dicha pareja. El mínimo común múltiplo de dos números es igual al producto de los
números dividido entre su máximo común divisor. Por ejemplo, el máximo común
divisor de 24 y 36 es 12, por tanto el mínimo común múltiplo de 24 y 36 es
(24×36)/12=72.*/

package boletinDosJava;

public class ejercicioOnce {

	public static void main(String[] args) {
		
		System.out.println(minimoComunMultiplo(24,36));

	}
	public static Integer gCD(int a,int b) {
		
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
	public static Integer minimoComunMultiplo(int a,int b) {
		
	return (a*b)/gCD(a, b);
	}
}