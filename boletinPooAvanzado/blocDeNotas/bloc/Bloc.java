package blocDeNotas.bloc;

import java.util.Objects;

import blocDeNotas.notas.Activable;
import blocDeNotas.notas.Nota;

public class Bloc implements Activable{
	//<>
	private static final int NUMERO_NOTAS_MAXIMA=10;
	private int numNotas;
	private String nombre;
	private Nota[] notas;
		
	public Bloc(String nombre) {
		super();
		this.nombre = nombre;
		this.notas= new Nota[getNumeroNotasMaxima()];
	}
	
	public void addNota(Nota nota) throws BlocException {
		boolean add=false;
		
		for(int i=0;!add&&i<getNumeroNotasMaxima();i++) {
			if(this.notas[i]==null) {
				this.notas[i]=nota;
				add=true;
			}
		}
		
		if(!add) {
			throw new BlocException("Bloc de notas lleno");
		}
	}

	public String getNota(int nota) throws BlocException {
		
		String mostrarNota="";
		
		if(nota>=0 && nota<getNumeroNotasMaxima() && notas[nota]!=null) {
			mostrarNota=notas[nota].toString();
		}else {
			throw new BlocException("Nota no existe o numero incorrecto.");
		}
		
		return mostrarNota;
	}
	
	public void updateNota(int num,String nota) throws BlocException {
		
		if(num>=0 && num<getNumeroNotasMaxima() && notas[num]!=null) {
			notas[num].setTexto(nota);
		}else {
			throw new BlocException("Nota no existe o numero incorrecto.");
		}
		
	}
	
	public void activa (int num) throws BlocException {
		
		int activa=-1;
		
		for(int i=0;i<getNumeroNotasMaxima();i++) {
			if(notas[i].getCodigo()==num) {
				activa=i;
				
			}
		}
		
		if(activa!=-1) {
			notas[activa].activar();
		}else {
			throw new BlocException("Codigo de nota no entontrada.");
		}
	}
	
	public void desactiva (int num) throws BlocException {
		int desactiva=-1;
		
		for(int i=0;i<getNumeroNotasMaxima();i++) {
			if(notas[i].getCodigo()==num) {
				desactiva=i;
				
			}
		}
		
		if(desactiva!=-1) {
			notas[desactiva].desactivar();
		}else {
			throw new BlocException("Codigo de nota no entontrada.");
		}
	}
	
	public static int getNumeroNotasMaxima() {
		return NUMERO_NOTAS_MAXIMA;		
	}
	
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString() {
		return "Bloc " + nombre +" con numero de notas "+ numNotas + ".";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Bloc) 
				&& Objects.equals(this.nombre, ((Bloc) obj).nombre));
	}
	
	public String ordenaBloc() {
		return "";
	}
	
}


