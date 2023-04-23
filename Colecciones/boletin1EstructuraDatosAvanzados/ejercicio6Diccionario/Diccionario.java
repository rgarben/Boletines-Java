package boletin1EstructuraDatosAvanzados.ejercicio6Diccionario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Diccionario {

	private String nombre;
	private List<Palabra> palabras;
	
	public Diccionario(String nombre) {
		super();
		this.nombre = nombre;
		this.palabras = new ArrayList<Palabra>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void addPalabra(String nomPalabra, String significa) throws Exception {
		
		if(nomPalabra!=null && significa!=null && estaPalabra(nomPalabra)!=null) {
			estaPalabra(nomPalabra).getSignificados().add(new Significado(significa));
		}else if(nomPalabra!=null && significa!=null && estaPalabra(nomPalabra)==null){
			this.palabras.add(new Palabra(nomPalabra));
			estaPalabra(nomPalabra).getSignificados().add(new Significado(significa));
		}else {
			throw new Exception("Nombre de palabra o significado no validos.");
		}
		
	}
	
	public Palabra estaPalabra(String nombre) {
		Palabra esta=null;
		for (Palabra palabra : palabras) {
			if(palabra.getNombre().equalsIgnoreCase(nombre)) {
				esta = palabra;
			}
		}
		return esta;
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
			this.palabras.remove(estaPalabra(nombre));	
		}else {
			throw new Exception("Palabra no encontrada.");
		}
			
	}
	
	public String litarPalabrasEmpierenPor(String frase) throws Exception {
		
		StringBuilder sb = new StringBuilder();
		boolean estaFrase=false;
		Iterator<Palabra> it = this.palabras.iterator();
		String guardar="";
		
		while(it.hasNext()) {
			guardar=it.next().getNombre();
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
