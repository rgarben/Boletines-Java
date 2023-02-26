package maquinadecafe;

import java.util.Scanner;

import maquinadecafe.depositos.Deposito;

public class menuMaquinaCafe {

	public static void main(String[] args) {
		
		int opcion;
		double monedas = 0;
		
		Scanner sc = new Scanner(System.in);
		Deposito maquina = new Deposito();
		
		System.out.println("1. Servir café solo (1 euro)\n"
				+ "2. Servir leche (0,8 euros)\n"
				+ "3. Servir café con leche (1,5 euros)\n"
				+ "4. Consultar estado máquina.\n"
				+ "5. Apagar máquina y salir");
		
		do  {
			
			switch (opcion=Integer.valueOf(sc.nextLine())) {
			case 1:
				maquina.cafeSolo(monedas);
				break;
			case 2:
				maquina.leche(monedas);
				break;
			case 3:
				maquina.cafeConLeche(monedas);
				break;
			case 4:
				maquina.toString();
				break;
			case 5:
				System.out.println("Maquína apagada.");
				break;	
			default:
				System.out.println("Error introduce una opción del menú: "
						+ "1. Servir café solo (1 euro)\n"
						+ "2. Servir leche (0,8 euros)\n"
						+ "3. Servir café con leche (1,5 euros)\n"
						+ "4. Consultar estado máquina.\n"
						+ "5. Apagar máquina y salir");
				break;
			}
	
		}while (opcion!=5);
		sc.close();
	}		
	
}
