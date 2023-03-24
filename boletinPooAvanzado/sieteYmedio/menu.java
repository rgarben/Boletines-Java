package sieteYmedio;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) throws Exception {

		Baraja b = new Baraja();
		b.barajar();
		int contador1=0;
		int contador2=0;
		double suma1=0;
		double suma2=0;
		String otraPartida="";
		String pedirCarta = "";
		String pedirCarta2= "";
		Scanner sc = new Scanner(System.in);		
		Carta jugador1[] = new Carta[15];		
		Carta jugador2[] = new Carta[15];

		try {
			new Carta(20,Palos.BASTOS);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		do {

				do {

					jugador1[contador1]=b.siguiente();
					if(jugador1[contador1].getNumero()==10 || jugador1[contador1].getNumero()==11 || jugador1[contador1].getNumero()==12) {
						suma1+=0.5;
					}else {
						suma1+=jugador1[contador1].getNumero();
					}
					contador1++;

					System.out.println("Jugador 1");
					for (Carta c1: jugador1) {
						if (c1!=null) {
							System.out.println(c1);
						}
					}
					System.out.println("-----------------------");
					System.out.println("Valor de tus cartas: "+suma1);
					
					if(suma1<7.5) {
						System.out.println("-----------------------");
						System.out.println("¿Quieres carta?");
						pedirCarta = sc.nextLine();	
					}else if(suma1==7.5) {
						System.out.println("-----------------------");
						System.out.println("Tienes 7.5, pasamos a la banca.");
						pedirCarta = "no";
					}else {
						System.out.println("Te pasaste de 7.5.");
					}
					
				}while(!pedirCarta.equalsIgnoreCase("no")&&suma1<7.5);

				do {
					jugador2[contador2]=b.siguiente();
					if(jugador2[contador2].getNumero()==10 || jugador2[contador2].getNumero()==11 || jugador2[contador2].getNumero()==12) {
						suma2+=0.5;
					}else {
						suma2+=jugador2[contador2].getNumero();
					}
					
					contador2++;
					
					System.out.println("Jugador 2");
					for (Carta c1: jugador2) {
						if (c1!=null) {
							System.out.println(c1);
						}
					}
					System.out.println("-----------------------");
					System.out.println("Valor de tus cartas: "+suma2);
					if(suma2<7.5) {
						System.out.println("-----------------------");
						System.out.println("¿Quieres carta?");
						pedirCarta2 = sc.nextLine();	
					}else if(suma2==7.5) {
						System.out.println("-----------------------");
						System.out.println("Tienes 7.5, pasamos a la banca.");
						pedirCarta2 = "no";
					}else {
						System.out.println("Te pasaste de 7.5.");
					}
					
				}while(!pedirCarta2.equalsIgnoreCase("no")&&suma2<7.5);
			
			if((suma1<=7.5 && suma1>suma2)||(suma2>7.5&&suma1<=7.5)) {
				System.out.println("Jugador gana con "+suma1+" frente a "+suma2+" de la banca.");
			}else {
				System.out.println("La banca gana con "+suma2+" frente a "+suma1+" del jugador.");
			}

			suma1=0;
			contador1=0;
			for(int i=0;i<jugador1.length;i++) {
				jugador1[i]=null;
			}
			suma2=0;			
			contador2=0;
			for(int i=0;i<jugador2.length;i++) {
				jugador2[i]=null;
			}
			
			for(int i=0;i<jugador2.length;i++) {
				jugador2[i]=null;
			}
			
			System.out.println("------------------------------------");
			for (Carta c1: jugador2) {
				if (c1!=null) {
					System.out.println(c1);
				}
			}
			b.reiniciarPartida();
			b.barajar();
			System.out.println("¿Otra partida?");
			otraPartida = sc.nextLine();
		} while (!otraPartida.equalsIgnoreCase("no"));
		
	}

}
