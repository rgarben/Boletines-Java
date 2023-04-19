package mapas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Mapeando {

	
	
	
	/**
	 * Recibe una colección de personas y las agrupa por género
	 * @param personas
	 * @return Mapa con la colección de personas clasificadas por género
	 */
	public static Map mapearPersonasPorGenero(Collection<Persona> personas) {
		
		Map<Genero, Set<Persona>> persos = new HashMap<>();
		
		for (Persona persona : personas) {
			if(persona!=null && !persos.containsKey(persona.getGenero())) {
				persos.put(persona.getGenero(), new HashSet<Persona>());
				persos.get(persona.getGenero()).add(persona);
			}else {
				persos.get(persona.getGenero()).add(persona);
			}
		}
		
		return persos;
	}
	
	
	/**
	 * Recibe una colección de números y cuenta cuantas ocurrencias hay de cada uno de ellos
	 * creando un mapa en el que aparece cada número junto a su frecuencia de aparición
	 * @param numeros
	 * @return Tabla de frecuencias de los números facilitados
	 */
	public static Map<Integer, Integer> contarNumeros(Collection<Integer> numeros){
		
		Map<Integer, Integer> secuencia = new HashMap<>();
		
		for (Integer integer : numeros) {
			if(integer!=null && !secuencia.containsKey(integer)) {
				secuencia.put(integer, 1);
			}else {
				secuencia.put(integer, secuencia.get(integer)+1);
			}
		}
		
		return secuencia;
	}
	
	
	/**
	 * Genera una lista de números aleatorios entre 0 y 20 del tamaño indicado
	 * @param size tamaño de la lista
	 * @return lista de size números aleatorios
	 */
	public static Collection<Integer> generarNumerosAleatorios(int size){
		List<Integer> numeros = new ArrayList<>() {{
			for(int i=0; i<size; i++) {
				add(new Random().nextInt(0, 20));
			}
		}};
		
		return numeros;
	}
}
