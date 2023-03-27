package boletin1testing;

public class CadenaUtils {
	
	private String cadena;
	
	
	
	public CadenaUtils(String cadena) {
		super();
		this.cadena = cadena;
	}

	public String toMayusculas() {
		
		return this.cadena.toUpperCase();
	}
	
	public String toMinusculas() {
		
		return this.cadena.toLowerCase();
	}
	
	public boolean esEnMayusculas() {
		boolean mayus=false;
		int contador=0;
		
		for(int i=0;i<this.cadena.length();i++) {
			if(Character.isUpperCase(this.cadena.charAt(i))) {
				contador++;
			}
		}
		
		if(contador==this.cadena.length()) {
			mayus=true;
		}
		
		return mayus;
	}
	
	public boolean esMinusculas() {
		boolean minus=false;
		int contador=0;
		
		for(int i=0;i<this.cadena.length();i++) {
			if(Character.isLowerCase(this.cadena.charAt(i))) {
				contador++;
			}
		}
		
		if(contador==this.cadena.length()) {
			minus=true;
		}
		
		return minus;
	}
	
	public boolean esCapicua() {
		
		int contador=0;
		boolean esCapi = false;
		String aux="";
		
		for(int i=0;i<cadena.length();i++) {
			if(Character.isDigit(cadena.charAt(i))) {
				contador++;
			}
		}
		
		if(contador==cadena.length()) {
			for(int i=cadena.length()-1;i>=0;i--) {
				aux+=String.valueOf(cadena.charAt(i));
			}
				
		}
		
		if(aux.equalsIgnoreCase(cadena)) {
			esCapi=true;
		}
		
		return esCapi;
	}
	
	public boolean esPalindroma() {
		
		int contador=0;
		boolean esPali = false;
		boolean tieneNumero = false;
		String aux="";
		
		for(int i=0;i<cadena.length();i++) {
			if(Character.isDigit(cadena.charAt(i))) {
				tieneNumero=true;
			}
		}
		
		if(!tieneNumero) {
			for(int i=cadena.length()-1;i>=0;i--) {
				aux+=String.valueOf(cadena.charAt(i));
			}
				
		}
		
		if(aux.equalsIgnoreCase(cadena)) {
			esPali=true;
		}
		
		return esPali;
	}
	
	public boolean esDecimal() {
		
		boolean punto=false;
		boolean coma=false;
		boolean deci=false;
		
		for(int i=0;i<cadena.length();i++) {
			if(String.valueOf(cadena.charAt(i)).equals(".")) {
				punto=true;
			}
			if(String.valueOf(cadena.charAt(i)).equals(",")) {
				coma=true;
			}
		}
		
		if(punto || coma) {
			deci=true;
		}
		
		
		return deci;
	}
	
	public boolean esEntero() {
		
		boolean punto=false;
		boolean coma=false;
		boolean ente=false;
		
		for(int i=0;i<cadena.length();i++) {
			if(String.valueOf(cadena.charAt(i)).equals(".")) {
				punto=true;
			}
			if(String.valueOf(cadena.charAt(i)).equals(",")) {
				coma=true;
			}
		}
		
		if(!punto & !coma) {
			ente=true;
		}
		
		
		return ente;
	}
	
}
