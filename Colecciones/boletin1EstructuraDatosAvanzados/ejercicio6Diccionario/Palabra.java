package boletin1EstructuraDatosAvanzados.ejercicio6Diccionario;

import java.util.ArrayList;
import java.util.List;

public class Palabra {

	private String nombre;
	private List<Significado> significados;

	public Palabra(String nombre) {
		super();
		this.nombre = nombre;
		this.significados = new ArrayList<Significado>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public List<Significado> getSignificados() {
		return significados;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for (Significado significado : significados) {
			if(significado!=null) {
				sb.append(significado);
			}
		}
		
		return "Palabra: " + this.nombre + "\nSignificados: \n" + sb.toString();
	}
	
}
