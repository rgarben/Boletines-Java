package geometria;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto() {
		this.x=0;
		this.y=0;
	}
	
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	public void moverDerecha(double desplazamiento) {
		this.x+=desplazamiento;
	}
	
	public void subir(double desplazamiento) {
		this.y+=desplazamiento;
	}
	

	public String toString() {
		return String.format(("( %s , %s )"), this.x, this.y);
	}

	
	public boolean equals(Object obj) {
		boolean iguales = this==obj;
		
		if(!iguales && obj!=null && obj instanceof Punto) {
			Punto casteado = (Punto)obj;
			iguales = this.x==casteado.x && this.y==casteado.y;
		}
		return iguales;
	}
	
	
}
