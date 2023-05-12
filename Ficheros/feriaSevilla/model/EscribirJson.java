package feriaSevilla.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class EscribirJson {


	public List<Caseta> cargarCasetas(String path){
		
		List<Caseta> casetas = null;
		
		Gson gson = new GsonBuilder().create();
		
		try {
			Caseta[] arrayDeEstudiantes=
					gson.fromJson(new FileReader(path), Caseta[].class);
			
			casetas=List.of(arrayDeEstudiantes);
			
		}catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return casetas;		
	}
	
	public void escribirCasetas(List<Caseta> caset) {
		
		File archivo = new File(".\\src\\feriaSevilla\\xml\\casetas.json");
		
		try {
			archivo.createNewFile();
			Gson gson = new GsonBuilder().setPrettyPrinting().enableComplexMapKeySerialization().create();
			FileWriter writer = new FileWriter(archivo);
			gson.toJson(caset, writer);
			
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
