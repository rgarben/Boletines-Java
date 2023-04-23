package boletin1EstructuraDatosAvanzados.ejercicio6Diccionario_Mapas;

public class Significado {

	private String signi;
	private static int numero=1;
	private int numeroMensaje;
	
	public Significado(String signi) {
		super();
		this.signi = signi;
		this.numeroMensaje=numero++;
	}

	@Override
	public String toString() {
		return numeroMensaje + ". " + signi +"\n";
	}
		
}
