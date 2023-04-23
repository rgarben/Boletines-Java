package boletin1EstructuraDatosAvanzados.ejercicio7GranAlmacen;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	private boolean estaAbierta;
	private static int num=1;
	private int numero;
	private List<Integer> cola;
		
	public Caja() {
		super();
		this.estaAbierta = false;
		this.numero = num++;
		this.cola= new ArrayList<Integer>();
	}
			
	public List<Integer> getCola() {
		return cola;
	}

	public void abrirCaja() throws Exception {
		
		if(this.estaAbierta==true) {
			throw new Exception("La caja ya esta abierta.");
		}else {
			this.estaAbierta=true;
		}
	}
	
	public void cerrarCaja() throws Exception {		
		
		if(this.estaAbierta==false) {
			throw new Exception("La caja ya esta cerrada.");
		}else {
			this.estaAbierta=false;
		}
	}

	public boolean isEstaAbierta() {
		return estaAbierta;
	}
	
	public void addCliente(int clie) {
		this.cola.add(clie);
	}

	public int getNumero() {
		return numero;
	}
	
	public Integer dameCliente() {
		
		Integer cliee=0;
		int contador=0;
		
		for (Integer integer : cola) {
			if(integer !=null && contador==0) {
				contador++;
				cliee=integer;
			}
		}
		
		return cliee;
	}
	
	public void borrarCliente() {
		int contador=0;
		for (Integer integer : cola) {
			if(integer!=null && contador==0) {
				contador++;
				cola.remove(integer);
			}
		}
	}
	
}
