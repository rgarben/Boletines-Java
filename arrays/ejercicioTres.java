package arrays;

import java.util.Scanner;

public class ejercicioTres {

	public static final String DIGITOS = "0123456789";
	
	public static void main(String[] args) {
		
		String numeroIntroducido = "";
		Scanner sc = new Scanner(System.in);
		StringBuilder numerosNoEstan = new StringBuilder();
		
		
		int[] contadores = new int[DIGITOS.length()];
		
		int sumaTotal=0;
		double media=0;
		
		do {
			System.out.println("Introduce un numero: ");
			numeroIntroducido= sc.nextLine();			
			sumaTotal+=Integer.valueOf(numeroIntroducido);
			media++;
			char ultimoDigito = numeroIntroducido.charAt(numeroIntroducido.length()-1);
			System.out.println("¿Quieres seguir introduciendo numeros?");
			contadores[DIGITOS.indexOf(ultimoDigito)]+=1;			
			numeroIntroducido= sc.nextLine();
		}while (!numeroIntroducido.equalsIgnoreCase("N"));
		
		for (int i=0;i<contadores.length-1;i++) {
			numerosNoEstan.append(contadores[i]==0?i+", ":contadores[i]);
			
		}
		
		System.out.println("La media de los numeros leidos es: "+(sumaTotal/media));
		System.out.println("Los numeros que no aparecen son: "+numerosNoEstan);
		sc.close();
	}

}