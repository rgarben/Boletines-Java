
/*7. Codifica las siguientes secuencias numéricas haciendo uso de estructuras: i) for, ii)
while, iii) do-while en cada una de ellas:
a. Crea un método que muestre los números del 1 al 100
b. Repite el ejercicio anterior, pero en formato descendente, es decir, del 100 al 1.
c. Crea un programa que calcule y escriba los números múltiplos de 5 de 0 a 100.
d. Escribe los números del 320 al 160, contando de 20 en 20 hacia atrás.*/

package boletinUnoJava;

public class ejercicioSiete {

	public static void main(String[] args) {
		
		for (int i = 0;i<=100;i++){
			System.out.println(i);
		}
		for (int i = 100;i>=0;i--){
			System.out.println(i);
		}
		for (int y = 0;y<=100;y++){
			if (y%5==0)
				System.out.println(y);
		}
		for (int z = 320;z>=160;z-=20) {
			System.out.println(z);
		}
	}
}