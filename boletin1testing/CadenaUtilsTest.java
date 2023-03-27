package boletin1testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaUtilsTest {
	
	@Test
	void toMayusculas() {
		CadenaUtils ca = new CadenaUtils("hola");
		assert(ca.toMayusculas().equals("HOLA"));
	}
	
	@Test
	void toMinusculas() {
		CadenaUtils ca = new CadenaUtils("HOLA");
		assert(ca.toMinusculas().equals("hola"));
	}
	
	@Test
	void estaEnMayusculas() {
		CadenaUtils ca = new CadenaUtils("HOLA");
		assert(ca.esEnMayusculas()==true);
	}
	
	@Test
	void estaEnMinusculas() {
		CadenaUtils ca = new CadenaUtils("hola");
		assert(ca.esMinusculas()==true);
	}
	
	@Test
	void estaEsCapicua() {
		CadenaUtils ca = new CadenaUtils("121");
		assert(ca.esCapicua());
	}
	
	@Test
	void TestEsPalindromo() {
		CadenaUtils ca = new CadenaUtils("girafarig");
		assert(ca.esPalindroma());
	}
	
	@Test
	void TestEsDecimal() {
		CadenaUtils ca = new CadenaUtils("11,2");
		assert(ca.esDecimal());
	}
	
	@Test
	void TestEsEntero() {
		CadenaUtils ca = new CadenaUtils("20");
		assert(ca.esEntero());
	}

}
