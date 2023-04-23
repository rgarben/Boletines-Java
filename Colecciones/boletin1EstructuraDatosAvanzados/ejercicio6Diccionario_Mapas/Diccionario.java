package boletin1EstructuraDatosAvanzados.ejercicio6Diccionario_Mapas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Diccionario {

	private String nombre;
	private Map<String, HashSet<Significado>> palabras;
	
	public Diccionario(String nombre) {
		super();
		this.nombre = nombre;
		this.palabras = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void addPalabra(String nomPalabra, String significa) throws Exception {
		
		if(nomPalabra!=null && significa!=null && estaPalabra(nomPalabra)==null) {
			palabras.put(nomPalabra, new HashSet<Significado>());
			palabras.get(nomPalabra).add(new Significado(significa));
		}else if(nomPalabra!=null && significa!=null && estaPalabra(nomPalabra)!=null){
			palabras.get(nomPalabra).add(new Significado(significa));
		}else {
			throw new Exception("Nombre de palabra o significado no validos.");
		}
		
	}
	
	public HashSet<Significado> estaPalabra(String nombre) {
		return palabras.get(nombre);
	}
	
	public String buscarPalabra(String nombre) throws Exception {
		
		StringBuilder sb = new StringBuilder();
		
		if(estaPalabra(nombre)!=null) {
			sb.append(estaPalabra(nombre));
		}else {
			throw new Exception("Palabra no encontrada.");
		}
		
		return sb.toString();
	}
	
	public void borrarPalabra(String nombre) throws Exception {
		
		if(estaPalabra(nombre)!=null) {
			this.palabras.remove(nombre);
		}else {
			throw new Exception("Palabra no encontrada.");
		}
			
	}
	
	public String litarPalabrasEmpierenPor(String frase) throws Exception {
		
		StringBuilder sb = new StringBuilder();
		boolean estaFrase=false;
		Iterator<String> it = this.palabras.keySet().iterator();
		String guardar="";
		
		while(it.hasNext()) {
			guardar=it.next();
			if(guardar.startsWith(frase)) {				
				sb.append(guardar);
				estaFrase=true;
			}			
		}
		
		if(!estaFrase) {
			throw new Exception("Ninguna palabra empieza por esa frase");
		}
		
		return sb.toString();
	}
	
}
