package banco.models;

public class Cuenta {

	private double saldo;
	private int numeroIngresos;
	private int numeroReintegros;

	public Cuenta() {
		super();
		this.saldo = 0;
	}
	
	public Cuenta(double saldo) {
		this();
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}


	public boolean retirar(double cantidadRetirar) {
		
		boolean retirar = false;
		
		if (cantidadRetirar<this.saldo && cantidadRetirar>0) {
			this.saldo -= cantidadRetirar;
			this.numeroReintegros++;
			retirar = true;
			
		}		
		return retirar;
	}
	
	public boolean ingreso(double cantidadIngreso) {
		
		boolean ingreso = false;
		
		if (cantidadIngreso>0) {
			this.saldo += cantidadIngreso;
			this.numeroIngresos++;
			ingreso = true;
		}	
		return ingreso;
	}

	@Override
	public String toString() {
		return "Cuenta saldo " + this.saldo + " numeroIngresos " + this.numeroIngresos + ", numero de reintegros "
				+ this.numeroReintegros + ".";
	}
	
	
	
}
