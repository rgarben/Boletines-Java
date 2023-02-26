package numeroscomplejos.complejos;

public class Complejo {

	private int parteReal;
	private int parteImaginaria;
	
	public Complejo(int parteReal, int parteImaginaria) {
		super();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}
		
	public int getParteReal() {
		return parteReal;
	}

	public void setParteReal(int parteReal) {
		this.parteReal = parteReal;
	}

	public int getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteImaginaria(int parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}

	public Complejo sumarComplejo(Complejo Complejo2) {
		
		int real = this.parteReal+Complejo2.getParteReal();
		int imaginaria = this.parteImaginaria+Complejo2.getParteImaginaria();
		
		Complejo suma = new Complejo(real,imaginaria);
		
		return suma;
	}
	
	public Complejo restarComplejo(Complejo Complejo2) {
		
		int real = this.parteReal<Complejo2.getParteReal()?Complejo2.getParteReal()-this.parteReal:this.parteReal-Complejo2.getParteReal();
		int imaginaria = this.parteImaginaria<Complejo2.getParteImaginaria()?Complejo2.getParteImaginaria()-this.parteImaginaria:this.parteImaginaria-Complejo2.getParteImaginaria();
		
		Complejo restar = new Complejo(real,imaginaria);
		
		return restar;
	}
	
	public boolean compararComplejos(Complejo Complejo2) {
		return this.parteReal==Complejo2.getParteReal() && this.parteImaginaria==Complejo2.getParteImaginaria();
	}

	@Override
	public String toString() {
		return "Numero complejo: (" + getParteReal() + "," + getParteImaginaria() + ")*i";
	}
	
	
}
