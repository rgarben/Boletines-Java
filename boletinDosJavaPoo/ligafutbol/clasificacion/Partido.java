package ligafutbol.clasificacion;

public class Partido {

	private static int jornada;
	private static int golesLocal;
	private static int golesVisitante;
	private char quiniela;
	
	private Equipo local;
	private Equipo visitante;
	
	public Partido() {
		super();
		this.quiniela = '0';
	}
	
	public Partido(Equipo local, Equipo visitante, int jornada) {
		this();
		if(!local.equals(visitante)) {
			this.local=local;
			this.visitante=visitante;
			this.jornada=jornada;
		}		
	}
	//><
	public void ponerResultado(Partido partido, String resultado) {
		
		if(resultado.length()==3 && Character.isDigit(resultado.charAt(0)) && Character.getNumericValue(resultado.charAt(0))>=0
				&& Character.getNumericValue(resultado.charAt(2))>=0 && Character.isDigit(resultado.charAt(2)) && resultado.charAt(1)=='-') {
			this.golesLocal = Character.getNumericValue(resultado.charAt(0));
			this.golesVisitante = Character.getNumericValue(resultado.charAt(2));
			if (Character.getNumericValue(resultado.charAt(0))>Character.getNumericValue(resultado.charAt(2))) {
				this.quiniela='1';
			}else if(Character.getNumericValue(resultado.charAt(0))<Character.getNumericValue(resultado.charAt(2))) {
				this.quiniela='2';
			}else {
				this.quiniela='X';
			}
			
		}else {
			System.out.println("Error al meter los resultados.");
		}
				
	}

	@Override
	public String toString() {
		
		String mensaje;
		
		if (this.quiniela=='0') {
			mensaje ="Partido entre equipo local "+this.local.getNombre() +" y equipo visitante "+this.visitante.getNombre()+" todavía no se ha jugado.";
		}else {
			mensaje = "Partido entre equipo local "+this.local.getNombre() +" y el equipo visitante "+this.visitante.getNombre() +" jugado en el estadio "
					+this.local.getEstadio() +" de la ciudad "+this.local.getCiudad()+" ha finalizado con "+this.golesLocal+" goles de equipo local y "
					+this.golesVisitante+" goles de equipo visitante. Resultado quiniela: "+this.quiniela+".";
		}
		
		return mensaje;
	}

	
}
