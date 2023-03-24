package sistemaParking;

import java.util.Arrays;

import sistemaParking.comparator.MarcaModelo;
import sistemaParking.comparator.MatriculaComparator;
import sistemaParking.comparator.TipoCombustibleComparator;

public class Parking implements Comparable <Vehiculo>{

	private Vehiculo[] espacio;
	private static final int MAXIMO=50;

	public Parking() {
		super();
		this.espacio = new Vehiculo[50];
	}

	public boolean aparcarCoche(Vehiculo vehiculo) {
		boolean hayPlaza=false;
			
			for(int i=0;!hayPlaza&&i<MAXIMO;i++) {
				if(this.espacio[i]==null) {
					this.espacio[i]=vehiculo;
					hayPlaza=true;
				}
			}
		return hayPlaza;
	}

	public void salirDelParking(Vehiculo vehiculo) {

		boolean estaVehiculo = false;
		
		for(int i=0;i<MAXIMO;i++) {
			if(this.espacio[i]==vehiculo) {
				this.espacio[i]=null;
				estaVehiculo=true;
			}
		}
		
		if(estaVehiculo) {
			System.out.println("Saliendo del parking.");
		}else {
			System.out.println("No esta tu coche en este parking.");
		}
	}
	
	@Override
	public String toString() {
		
		String sb = "";
		
		for(Vehiculo v : espacio) {
			if(v!=null) {
				sb+=(v+"\n");
			}
		}	
		
		return sb;
	}
	
	public String ordenarMatricula() {
		StringBuilder sb = new StringBuilder();
				
		Arrays.sort(espacio, new MatriculaComparator());
		
		for(Vehiculo v : espacio) {
			if(v!=null) {
				sb.append(v+"\n");
			}
		}
		
		return sb.toString();
	}
	
	public String ordenarMarcaModelo() {
		StringBuilder sb = new StringBuilder();
		
		MarcaModelo marmo = new MarcaModelo();
		
		Arrays.sort(espacio, marmo);
		
		for(Vehiculo v : espacio) {
			if(v!=null) {
				sb.append(v+"\n");
			}
		}
		return sb.toString();
	}
		
	public String ordenarTipoCumbustible() {
		StringBuilder sb = new StringBuilder();
			
		TipoCombustibleComparator marmo = new TipoCombustibleComparator();
			
		Arrays.sort(espacio, marmo);
			
		for(Vehiculo v : espacio) {
			if(v!=null) {
				sb.append(v+"\n");
			}
		}
		
		return sb.toString();
	}
	
	public String ordenarPorFechaHora() {
		StringBuilder sb = new StringBuilder();
					
		Arrays.sort(filtrarNulos());
			
		for(Vehiculo v : filtrarNulos()) {
			if(v!=null) {
				sb.append(v+"\n");
			}
		}
		
		return sb.toString();
	}
	
	private Vehiculo[] filtrarNulos(){
		int noNulos = 0;
		for(Vehiculo v : this.espacio) {
			if(v!=null) {
				noNulos++;
			}
		}
		
		Vehiculo[] filtrado = new Vehiculo[noNulos];
		for(int i=0; i<noNulos;i++) {
			if(this.espacio[i]!=null){
				filtrado[i]=this.espacio[i];
			}
		}
		return filtrado;
	}

	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return 0;
	}
		
}
