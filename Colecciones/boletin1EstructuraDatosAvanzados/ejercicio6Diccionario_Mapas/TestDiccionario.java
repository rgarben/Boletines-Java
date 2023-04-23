package boletin1EstructuraDatosAvanzados.ejercicio6Diccionario_Mapas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDiccionario {

	@Test
	void test() {
		
		Diccionario geologia = new Diccionario("geologia");
		
		/*try {
			geologia.addPalabra("roca", "formada por tierra");
			geologia.addPalabra("roca", "formada por minerales");
			geologia.addPalabra("roca", "formada por carbon");
			assert(!geologia.buscarPalabra("roca").isEmpty());
		} catch (Exception e) {
			assert(false);
		}*/
		
		try {
			geologia.addPalabra("roca", "formada por tierra");
			geologia.addPalabra("roca", "formada por minerales");
			geologia.addPalabra("roca", "formada por carbon");
			assert(!geologia.buscarPalabra("roca").isEmpty());
			geologia.buscarPalabra("pc").isEmpty();
			assert(false);
		} catch (Exception e) {
			assert(true);
		}
		
	}
	
	

}
