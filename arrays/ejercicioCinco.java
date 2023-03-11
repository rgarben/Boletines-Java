package arrays;

import java.util.Scanner;

public class ejercicioCinco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder jugador1 = new StringBuilder();
		StringBuilder jugador2 = new StringBuilder();
		String numeros [] = {"1","2","3","4","5","6","7","9","10","11","12"};
		String palos [] = {"espada","copas","bastos","oros"};
		String cartas1 [] = new String[24];
		String cartas2 [] = new String[24];
		String mirar="";
		int contador=0;
		int contador2=0;
		
		
		System.out.println("Introduce el numero de cartas para cada jugador: ");
		int num = Integer.valueOf(sc.nextLine());

		for(int i=0;i<num;i++) {
			
			mirar=" "+numeros[(int) (Math.random()*11+1)-1]+" "+palos[(int) (Math.random()*4+1)-1]+",";
			
			if(contador==0) {
				jugador1.append(mirar);
				cartas1[contador]=mirar;
				contador++;
			}else if(mirar!=cartas1[contador-1] && mirar!=cartas2[contador2-1]) {
				jugador1.append(mirar);
				cartas1[contador]=mirar;
				contador++;
			}
			
			mirar="";
			mirar=" "+numeros[(int) (Math.random()*11+1)-1]+" "+palos[(int) (Math.random()*4+1)-1]+",";
			if(contador2==0 && mirar!=cartas1[0]) {
				jugador2.append(mirar);
				cartas2[contador2]=mirar;
				contador2++;
			}else if(mirar!=cartas2[contador-1] && mirar!=cartas1[contador-1]) {
				jugador2.append(mirar);
				cartas2[contador2]=mirar;
				contador2++;
			}
			mirar="";
			
		}
		
		System.out.println("Cartas jugador 1:\n"+jugador1);
		System.out.println("Cartas jugador 2:\n"+jugador2);
		
		sc.close();
	}

}
