package boletin1EstructuraDatosAvanzados.ejercicio4HistorialNavegacion;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Historial histo = new Historial("000");
		
		Scanner sc = new Scanner(System.in);
		
		String nombre="";
		int num=0;
		final String MENU ="1. Consultar pagina"+"\n2. Consultar historial completo"+"\n3. Consultar historial de un día"
								+"\n4. Borrar todo el historial"+"\n5. Borrar visitas a una página"+"\n6. Salir";
		
		do {
			
			System.out.println(MENU);
			
			num=Integer.valueOf(sc.nextLine());
			
			switch (num) {
			case 1:
				System.out.println("Introduzca nombre de pagina web a visitar: ");
				nombre=sc.nextLine();
				histo.nuevaVisita(null);
				break;
			case 2:
				System.out.println(histo.consultarHistorialCompleto());
				break;
			case 3:
				histo.consultarHistorialDeUnDia(null);
				break;
			case 4:
				histo.borrarHistorial();
				break;
			case 5:
				histo.borrarHistorialDeUnaPaginaWeb(null);
				break;
			case 6:
				System.out.println("Programa terminado.");
				break;

			default:
				break;
			}
						
		}while(num!=6);

	}

}
