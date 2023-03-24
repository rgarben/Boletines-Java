package sieteYmedio;

import java.util.Arrays;
import java.util.Random;

public class Baraja {

	private int siguiente;
	private Carta[] barajaEspaniola = new Carta[40];

	public Baraja() throws Exception {
		super();
		generarBaraja();
	}
	
	public void generarBaraja() throws Exception {
		int contador=0;
		for(Palos p: Palos.values()) {
			for(int i=1;i<13;i++) {
				if(i!=8 && i!=9) {
					this.barajaEspaniola[contador]=new Carta(i,p);
					contador++;
				}
			}
		}
	}
	
	public void reiniciarPartida() {
		this.siguiente=0;
	}
	
	public void barajar(){
		   int guardar;
		   
		   for (int i=barajaEspaniola.length-1;i>1;i--){ 
			   guardar=(int) Math.floor(i*Math.random()); 
			   Carta temp = barajaEspaniola[i];
		      barajaEspaniola[i]=barajaEspaniola[guardar];
		      barajaEspaniola[guardar]=temp;
		    }
		}
	
	public Carta siguiente() {
		
		Carta carta = barajaEspaniola[siguiente];
		siguiente++;
		return carta;
	}

	@Override
	public String toString() {
		return "Baraja: " + Arrays.toString(barajaEspaniola);
	}
		
}
