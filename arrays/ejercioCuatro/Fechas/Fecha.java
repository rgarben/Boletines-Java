package arrays.ejercioCuatro.Fechas;

public class Fecha {

	private int dia;
	
	private int mes;
	
	private int anio;
	
	
	
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public String pasarFormatoLargo() {
		
		String fecha="";
		String[] meses = new String[] {"Enero","Febrero ","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre",};
		
		fecha = "La fecha en formato largo es: "+this.dia+" de "+meses[this.mes]+" de "+this.anio;
		
		return fecha;
	}
	
}
