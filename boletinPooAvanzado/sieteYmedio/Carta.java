package sieteYmedio;

import java.util.Objects;

import restaurante.Plato;

public class Carta {

	private int numero;
	Palos palo;
	
	public Carta(int numero, Palos palo) throws Exception {
		super();
		if(numero>12 || numero<=0 || numero==8 || numero==9) {
			throw new Exception("La carta no puede ser mayor de 12 ni menor que 1 y no puede ser 8 ni 9.");
		}else {
			this.numero = numero;
			this.palo = palo;
		}
		
	}
	
	public double getValor() {
		
		return this.numero+numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public Palos getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		return numero + " de " + palo;
	}
	
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Carta) 
				&& Objects.equals(this.numero, ((Carta) obj).numero));
	}
	
}
