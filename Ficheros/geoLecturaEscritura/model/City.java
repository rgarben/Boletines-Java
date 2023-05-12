package geoLecturaEscritura.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {
	//<>
	private String city_id;
	private String city;
	private List<Address> listAddress;
	
	public City(String city_id, String city) throws IOException {
		super();
		this.city_id = city_id;
		this.city = city;
		this.listAddress = new ArrayList<>();
		addAddress();
	}

	public String getCity_id() {
		return city_id;
	}

	public String getCity() {
		return city;
	}

	public List<Address> getListAddress() {
		return listAddress;
	}

	private void addAddress() throws IOException {
		
		File direccion = new File(".\\src\\geoLecturaEscritura\\archivos\\address.txt");
		FileReader readerDireccion = new FileReader(direccion);
		BufferedReader bufferDireccion = new BufferedReader(readerDireccion);
		
		String lineaDireccion = bufferDireccion.readLine();
		lineaDireccion = bufferDireccion.readLine();
		
		String[] direcciones;
		
		while(lineaDireccion!=null) {
			direcciones = lineaDireccion.split(",");
			
			try {
				if(direcciones[4].equalsIgnoreCase(city_id)) {
				this.listAddress.add(new Address(direcciones[0], direcciones[1]));
			}
			} catch (Exception e) {
				
			}
			
			
			
			
			lineaDireccion = bufferDireccion.readLine();
		}
		bufferDireccion.close();
		readerDireccion.close();
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(city, city_id, listAddress);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj instanceof City && this.hashCode()==obj.hashCode();
	}

	@Override
	public String toString() {
		return "\nCity_id: " + city_id + ", City: " + city + ", List address: \n" + listAddress;
	}
		
}
