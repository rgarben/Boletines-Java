package boletin1EstructuraDatosAvanzados.MockExamEuromillon;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Combinacion {

	protected static final int VALOR_MINIMO=1;
	protected static final int VALOR_MAXIMO_NUMEROS=50;
	protected static final int VALOR_MAXIMO_ESTRELLAS=12;
	protected static final int TOTAL_NUMEROS=5;
	protected static final int TOTAL_ESTRELLAS=2;
	private Set<Integer> numeros;
	private Set<Integer> estrellas;
	
	public Combinacion(int num1,int num2,int num3,int num4,int num5,int star1,int star2) throws CombinacionException {
		
		this(new int[] {num1, num2, num3, num4, num4}, new int[] {star1, star2});
	}
	
	public Combinacion(int[] numeros, int[] estrellas) throws CombinacionException {
		super();
		
		Set<Integer> num = new HashSet<>();
		Set<Integer> est = new HashSet<>();
		
		int contadorN=0,contadorE=0;
		
		for (int i : numeros) {
			if(i>0 && i<=50) {
				num.add(i);
			}
		}
		
		for (int i : estrellas) {
			if(i>0 && i<=12) {
				est.add(i);
			}
		}
		
		if(num.size()==5 && est.size()==2) {
			this.numeros = num;
			this.estrellas = est;
		}else {
			throw new CombinacionException("Numeros o estrellas no validos.");
		}
		
	}

	public Set<Integer> getNumeros() {
		return numeros;
	}

	public Set<Integer> getEstrellas() {
		return estrellas;
	}
	
	public int comprobarCombinacion(Combinacion con) throws CombinacionException, HistorialExcepcion {
		
		int contador=0,contador2=0;
		
		if(con!=null) {
			throw new HistorialExcepcion("Combinacion no valida");
		}else {
			
			for (Integer numero1 : this.numeros) {
				for (Integer numero2 : numeros) {
					if(numero1!=null && numero2!=null && numero1==numero2) {
						contador++;
					}
				}
			}
			
			for (Integer numero1 : this.estrellas) {
				for (Integer numero2 : estrellas) {
					if(numero1!=null && numero2!=null && numero1==numero2) {
						contador2++;
					}
				}
			}
			
		}
		
		return contador+contador2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeros,estrellas);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Combinacion e) 
				&& Objects.equals(this.numeros, e.numeros)
				&& Objects.equals(this.estrellas, e.estrellas));
	}

	@Override
	public String toString() {
		return "--------------"+"\nCombinacion numeros: " + numeros + "\nEstrellas: " + estrellas + "--------------";
	}	
	
}
