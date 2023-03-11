package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioUno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entero = 0, contador = 9;
		int[] listaNumero = new int[10];
		
		while (contador>-1) {
			System.out.println("Introduce un numero: ");
			entero = Integer.valueOf(sc.nextLine());
			listaNumero[contador]=entero;
			contador--;
		}
		System.out.println(Arrays.toString(listaNumero));
		sc.close();
	}
	
}
