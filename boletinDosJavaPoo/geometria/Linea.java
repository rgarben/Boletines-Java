package geometria;

public class Linea {

	private Punto a;
	private Punto b;
	
	public Linea() {
		this.a = new Punto();
		this.b = new Punto();
	}

	public Linea(Punto a, Punto b) {
		this.a=a;
		this.b=b;
	}
	
	public void derecha(double desplazamiento) {
		this.a.moverDerecha(desplazamiento);
		this.b.moverDerecha(desplazamiento);
	}
	
	public void izquierda(double desplazamiento) {
		derecha(-desplazamiento);
	}
	
	public void subir(double desplazamiento) {
		this.a.subir(desplazamiento);
		this.b.subir(desplazamiento);
	}
	
	public void bajar(double desplazamiento) {
		subir(-desplazamiento);
	}
	
	public String toString() {
		return String.format("[%s , %s]", this.a, this.b);
		
	}
	
	
	
	public boolean equals(Object obj) {
		boolean iguales = this==obj;
		
		if(!iguales && obj!=null && obj instanceof Linea) {
			Linea casteado = (Linea)obj;
			iguales = (this.a.equals(casteado.a) && this.b.equals(casteado.b))
					|| (this.a.equals(casteado.b) && this.b.equals(casteado.a));
		}
		return iguales;
	}
	
}