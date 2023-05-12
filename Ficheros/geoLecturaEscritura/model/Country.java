package geoLecturaEscritura.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
	//<>
	private String country_id;
	private String country;
	private List<City> list_city;
	
	public Country(String country_id, String country) throws IOException {
		super();
		this.country_id = country_id;
		this.country = country;
		this.list_city = new ArrayList<>();
		addCity();
	}

	public String getCountry_id() {
		return country_id;
	}

	public String getCountry() {
		return country;
	}

	public List<City> getList_city() {
		return list_city;
	}

	public void setList_city(List<City> list_city) {
		this.list_city = list_city;
	}
	
	private void addCity() throws IOException {
		
		File ciudad = new File(".\\src\\geoLecturaEscritura\\archivos\\city.txt");
		FileReader readerCiudad = new FileReader(ciudad);
		BufferedReader bufferCiudad = new BufferedReader(readerCiudad);
		
		String lineaCiudad = bufferCiudad.readLine();
		lineaCiudad = bufferCiudad.readLine();
		
		String[] ciudades;
		
		while(lineaCiudad!=null) {
			ciudades = lineaCiudad.split(",");
			if(ciudades[2].equalsIgnoreCase(country_id)) {
				this.list_city.add(new City(ciudades[0], ciudades[1]));
			}
			lineaCiudad = bufferCiudad.readLine();
		}
		bufferCiudad.close();
		readerCiudad.close();
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, country_id, list_city);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj instanceof Country && this.hashCode()==obj.hashCode();
	}

	@Override
	public String toString() {
		return "Country id: " + country_id + ", Country: " + country + ", List city: \n" + list_city;
	}
		
}
