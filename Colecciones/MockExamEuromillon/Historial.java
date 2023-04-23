package boletin1EstructuraDatosAvanzados.MockExamEuromillon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historial{

	private Map<LocalDate,Combinacion> sorteos;
	
	public Historial() {
		super();
		this.sorteos=new HashMap<>();
	}
	
	public void addSorteo(LocalDate fecha, Combinacion con) throws HistorialExcepcion {
		
		if(sorteos.containsKey(fecha)) {
			throw new HistorialExcepcion("El sorteo ya existe");
		}else {
			sorteos.put(fecha, con);
		}		
		
	}
	
	public void addSorteo(int dia, int mes, int anio, Combinacion con) throws HistorialExcepcion {
				
		if((mes==1 ||  mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)&&(dia>=1||dia<=31)&&(anio>=1500||anio<=2050)) {
			if(sorteos.containsKey(LocalDate.of(dia, mes, anio))) {
				throw new HistorialExcepcion("El sorteo ya existe");
			}else {
				sorteos.put(LocalDate.of(dia, mes, anio), con);
			}
		}else if((mes==4 || mes==6 || mes==9 || mes==11)&&(dia>=1||dia<=30)&&(anio>=1500||anio<=2050)) {
			if(sorteos.containsKey(LocalDate.of(dia, mes, anio))) {
				throw new HistorialExcepcion("El sorteo ya existe");
			}else {
				sorteos.put(LocalDate.of(dia, mes, anio), con);
			}
		}else if(((mes==2)&&(anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))&&(dia>=1||dia<=29))||((mes==2)&&(anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))&&(dia>=1||dia<=28))) {
			if(sorteos.containsKey(LocalDate.of(dia, mes, anio))) {
				throw new HistorialExcepcion("El sorteo ya existe");
			}else {
				sorteos.put(LocalDate.of(dia, mes, anio), con);
			}
		}else {
			throw new HistorialExcepcion("Fecha no valida.");
		}		

	}
	
	public void actualizarSorteo(int mes, int dia, int anio, Combinacion con) throws HistorialExcepcion {
		
		if((mes==1 ||  mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)&&(dia>=1||dia<=31)&&(anio>=1500||anio<=2050)) {
			if(!sorteos.containsKey(LocalDate.of(dia, mes, anio))) {
				throw new HistorialExcepcion("El sorteo no existe");
			}else {
				sorteos.put(LocalDate.of(dia, mes, anio), con);
			}
		}else if((mes==4 || mes==6 || mes==9 || mes==11)&&(dia>=1||dia<=30)&&(anio>=1500||anio<=2050)) {
			if(!sorteos.containsKey(LocalDate.of(dia, mes, anio))) {
				throw new HistorialExcepcion("El sorteo no existe");
			}else {
				sorteos.put(LocalDate.of(dia, mes, anio), con);
			}
		}else if(((mes==2)&&(anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))&&(dia>=1||dia<=29))||((mes==2)&&(anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))&&(dia>=1||dia<=28))) {
			if(!sorteos.containsKey(LocalDate.of(dia, mes, anio))) {
				throw new HistorialExcepcion("El sorteo ya existe");
			}else {
				sorteos.put(LocalDate.of(dia, mes, anio), con);
			}
		}else {
			throw new HistorialExcepcion("Fecha no valida.");
		}	

	}

	public void actualizarSorteo(LocalDate fecha ,Combinacion con) throws HistorialExcepcion {
		
		if(!sorteos.containsKey(fecha)) {
			throw new HistorialExcepcion("El sorteo no existe");
		}else {
			sorteos.put(fecha, con);
		}	
		
	}
	//<>
	public void borrarSorteo(LocalDate fecha) throws HistorialExcepcion {
		
		if(!sorteos.containsKey(fecha)) {
			throw new HistorialExcepcion("El sorteo no existe");
		}else {
			sorteos.remove(fecha);
		}
		
	}
	
	public List<String> listarSorteosDesdeFecha(LocalDate fecha) throws HistorialExcepcion{
		
		List<String> sorteFecha = new ArrayList<>();
				
		if(!sorteos.containsKey(fecha)) {
			throw new HistorialExcepcion("No hay sorteos desde esa fecha");
		}else {
						
			for (Map.Entry<LocalDate, Combinacion> guardar : this.sorteos.entrySet()) {
				if(guardar.getKey().isBefore(fecha)) {
					sorteFecha.add(guardar.toString()+"\n");
				}
			}
			
		}
		
		return sorteFecha;
	}
	
	public List<String> mostrarHistorico() throws HistorialExcepcion{
		
		List<String> mortrarTodo = new ArrayList<>();
		
		if(!sorteos.isEmpty()) {
			throw new HistorialExcepcion("No hay sorteos que mostrar");
		}else {
						
			for (Map.Entry<LocalDate, Combinacion> guardar : this.sorteos.entrySet()) {
				if(guardar!=null) {
					mortrarTodo.add(guardar.toString()+"\n");
				}
			}
			
		}
		
		return mortrarTodo;		
	}
	
	public Map<String,Integer> comprobarAciertos(LocalDate fecha, Combinacion con) throws CombinacionException, HistorialExcepcion{
		
		Map<String,Integer> mostrarAciertos = new HashMap<>();
		
		if(sorteos.containsKey(fecha)) {
			mostrarAciertos.put("Sorteo con fecha :"+ fecha +" con combinacion: "+con+" con numero de aciertos: ",con.comprobarCombinacion(sorteos.get(fecha)));
		}
		
		return mostrarAciertos;
	}
	
}
