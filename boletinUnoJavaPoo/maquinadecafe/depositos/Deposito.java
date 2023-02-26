package maquinadecafe.depositos;

public class Deposito {

	private int capacidadCafe;
	private int capacidadLeche;
	private int capacidadVasos;
	private double monedero;
	
	
	public Deposito() {
		super();
		this.capacidadCafe = 50;
		this.capacidadLeche = 50;
		this.capacidadVasos = 80;
		this.monedero = 10;
	}
	
	public void llenarDeposito() {
		this.capacidadCafe = 50;
		this.capacidadLeche = 50;
		this.capacidadVasos = 80;
		this.monedero = 10;
	}
	
	public String cafeSolo(double dinero) {
		
		String cambio = "La maquina no tiene cambio para esa cantidad.";
		
		if (dinero>=1) {
			
			this.capacidadCafe-=1;
			this.capacidadVasos-=1;
			this.monedero+=1;
			cambio = "Producto servido, recoge tu cambio de "+(dinero-1)+" euros.";
			
		}
		
		return cambio;
	}
	
	public String leche(double dinero) {
		
		String cambio = "La maquina no tiene cambio para esa cantidad.";
		
		if (dinero>=1) {
			
			this.capacidadLeche-=1;
			this.capacidadVasos-=1;
			this.monedero+=0.8;
			cambio = "Producto servido, recoge tu cambio de "+(dinero-1)+" euros.";
			
		}
		
		return cambio;
	}
	
	public String cafeConLeche(double dinero) {
		
		String cambio = "La maquina no tiene cambio para esa cantidad.";
		
		if (dinero>=1) {
			
			this.capacidadLeche-=1;
			this.capacidadCafe-=1;
			this.capacidadVasos-=1;
			this.monedero+=1.5;
			cambio = "Producto servido, recoge tu cambio de "+(dinero-1)+" euros.";
			
		}
		
		return cambio;
	}
	
	public String recaudarMonedero(){
		
		double recaudar=this.monedero;
		this.monedero=0;
		String recaudarDinero = "Vaciaste el monedero y recaudaste: "+recaudar;
		return recaudarDinero;
		
	}
	
	@Override
	public String toString() {
		return "La maquina tiene capacidad para: " + capacidadCafe + " cafes, " + capacidadLeche + " leches, "
				+ capacidadVasos + " vasos y cambio " + monedero + ".";
	}
	
}
