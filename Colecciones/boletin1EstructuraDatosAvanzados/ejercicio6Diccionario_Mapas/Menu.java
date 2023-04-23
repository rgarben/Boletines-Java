package boletin1EstructuraDatosAvanzados.ejercicio6Diccionario_Mapas;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String num="";
		String palabraNombre="";
		String significadoGuardar="";
		
		Diccionario geologia = new Diccionario("geologia");
		
		final String MENU="1. Añadir palabra."+"\n2. Buscar palabra en diccionario."+"\n3. Borrar una palabra del diccionario."
				+ "\n4. Listado de palabras que empiecen por “…”"+"\n5. Salir.";

		do {
			System.out.println(MENU);
			num=sc.nextLine();
			switch (num) {
			case "1":
				System.out.println("Introduce palabra: ");
				palabraNombre=sc.nextLine();
				System.out.println("Introduce significado: ");
				significadoGuardar=sc.nextLine();
				
				try {
					geologia.addPalabra(palabraNombre, significadoGuardar);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
			case "2":
				
				System.out.println("Introduce palabra a buscar: ");
				palabraNombre=sc.nextLine();
				
				try {
					System.out.println(geologia.buscarPalabra(palabraNombre));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "3":
				
				System.out.println("Introduce palabra a borrar: ");
				palabraNombre=sc.nextLine();
				
				try {
					geologia.borrarPalabra(palabraNombre);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
			case "4":
				System.out.println("Introduce frase a buscar: ");
				palabraNombre=sc.nextLine();
				
				try {
					System.out.println(geologia.litarPalabrasEmpierenPor(palabraNombre)); 
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
			case "5":
				System.out.println("Programa terminado.");
				break;

			default:
				System.out.println("Numero del menu no valido.");
				break;
			}
			
		}while(!num.equalsIgnoreCase("5"));
		sc.close();
	}

}
