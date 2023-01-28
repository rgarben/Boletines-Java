
/*
 * 1. Realiza un método que reciba dos números y devuelva True 
 * si uno es múltiplo del otro.
 * */

package boletinUnoJava;

import java.util.Scanner;

public class ejercicioUno {

	public static void main(String[] args) {
		
		int num1,num2;
		
		Scanner sc = new Scanner(System.in);
		num1 = Integer.valueOf(sc.nextLine());
		num2 = Integer.valueOf(sc.nextLine());
		if (num1>num2) {
			if (num1%num2==0) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}else if (num2>num1) {
			if (num2%num1==0) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}
	}
}