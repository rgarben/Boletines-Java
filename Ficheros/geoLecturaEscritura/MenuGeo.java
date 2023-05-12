package geoLecturaEscritura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import geoLecturaEscritura.model.Country;

public class MenuGeo {

	public static void main(String[] args) {

		List<Country> estados = new ArrayList<>();
		
		File estadosFile = new File(".\\src\\geoLecturaEscritura\\archivos\\country.txt");
		File ficheroSalida = new File(".\\src\\geoLecturaEscritura\\archivos\\ficheroSalida.txt");
		
		try {
			FileReader readerEstados = new FileReader(estadosFile);
			BufferedReader bufferEstados = new BufferedReader(readerEstados);
			
			String lineaEstados = bufferEstados.readLine();
			lineaEstados = bufferEstados.readLine();
			
			String[] estadoss;
			
			while(lineaEstados!=null) {
				estadoss = lineaEstados.split(",");

				estados.add(new Country(estadoss[0], estadoss[1]));

				lineaEstados = bufferEstados.readLine();
			}
			bufferEstados.close();
			readerEstados.close();
			
			ficheroSalida.createNewFile();
			
			FileWriter writer = new FileWriter(ficheroSalida);
			PrintWriter printer = new PrintWriter(writer);
						
			for (Country country : estados) {
				if(country!=null) {
					printer.append(country.toString());
				}
			}
			printer.close();
			writer.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
