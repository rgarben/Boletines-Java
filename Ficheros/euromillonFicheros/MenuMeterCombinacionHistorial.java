package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import boletin1EstructuraDatosAvanzados.MockExamEuromillon.Combinacion;
import boletin1EstructuraDatosAvanzados.MockExamEuromillon.CombinacionException;
import boletin1EstructuraDatosAvanzados.MockExamEuromillon.Historial;
import boletin1EstructuraDatosAvanzados.MockExamEuromillon.HistorialExcepcion;

public class MenuMeterCombinacionHistorial {

	public static void main(String[] args) {
				
		File fichero3 = new File("C:\\Users\\Kijoh\\Desktop\\WE_DAWB\\Euromillones 2004 a 2023.csv");
		Historial histo = new Historial();
		int numeroAciertos=0;
		
		try {
			
			FileReader reader = new FileReader(fichero3);
			BufferedReader buffer = new BufferedReader(reader);
			
			String linea = buffer.readLine();
			linea = buffer.readLine();
			
			while(linea!=null) {
				System.out.println(linea);
				
				String[] combi = linea.split(",");

				histo.addSorteo(LocalDate.parse(combi[0], DateTimeFormatter.ofPattern("d/MM/yyyy")), 
						new Combinacion(Integer.valueOf(combi[1]), Integer.valueOf(combi[2]), Integer.valueOf(combi[3]), Integer.valueOf(combi[4]), 
								Integer.valueOf(combi[5]), Integer.valueOf(combi[7]), Integer.valueOf(combi[8])));
				linea = buffer.readLine();
								
			}
			System.out.println("---------------------------");
			System.out.println("Mayor numero de aciertos: "+histo.maximoAciertosHistorico(new Combinacion(new int[] {23, 42, 35, 2, 14}, new int[] {11, 7})));
			System.out.println("---------------------------");
			System.out.println(histo.numeroEstrellasMasRepetidosYMenosFrecuentes());
			System.out.println("---------------------------");
			System.out.println(histo.mayorSecuenciaNumerosConsecutivos().toString());
			
			
		} catch (IOException | HistorialExcepcion | CombinacionException e) {
			e.printStackTrace();
		}
		
	}

}
