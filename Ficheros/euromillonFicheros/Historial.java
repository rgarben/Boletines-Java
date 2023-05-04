package boletin1EstructuraDatosAvanzados.MockExamEuromillon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


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
			
			/*for (LocalDate fecha : this.sorteos.keySet()) {
				if(fecha!=null) {
				mortrarTodo.add(fecha.toString()+"\n");
				}
			}*/
			
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
	
	public String numeroEstrellasMasRepetidosYMenosFrecuentes() {
		//<>
		
		Map<Integer, Integer> numeros = new HashMap<>();	
		
		Map<Integer, Integer> estrellas = new HashMap<>();
		
		int numR = 0,numE = 0;
		
		int numR1 = 0,numE1 = 0;
		
		String mnj ="";
		
		int numMin = Integer.MIN_VALUE;
		
		int numMax = Integer.MAX_VALUE;
		
		int numAux=0,estAux=0;
		
		int numAux1=0,estAux1=0;
		
		for (Entry<LocalDate, Combinacion> c : this.sorteos.entrySet()) {
			
			
			for (Integer i : c.getValue().getNumeros()) {
				
				if(i!=null && i!=null && !numeros.containsKey(i)) {
					numeros.put(i, 1);
				}
					numeros.put(i, numeros.get(i)+1);
				
			}
			
			for (Integer x : c.getValue().getEstrellas()) {
				
				if(x!=null && x!=null && !estrellas.containsKey(x)) {
					estrellas.put(x, 1);
				}
					estrellas.put(x, estrellas.get(x)+1);
				
			}
			
		}
		
		for (Entry<Integer, Integer> num : numeros.entrySet()) {
			
			if(num.getValue()>numMin) {
				numR=num.getValue();
				numMin=num.getValue();
				numAux=num.getKey();
			}
			
			if(num.getValue()<numMax) {
				numR1=num.getValue();
				numMax=num.getValue();
				estAux=num.getKey();
			}
			
		}
		
		
		
		for (Entry<Integer, Integer> numEstre : estrellas.entrySet()) {
			
			if(numEstre.getValue()>numMin) {
				numE=numEstre.getValue();
				numMin=numEstre.getValue();
				numAux1=numEstre.getKey();
			}
			
			if(numEstre.getValue()<numMax) {
				numE1=numEstre.getValue();
				numMax=numEstre.getValue();
				estAux1=numEstre.getKey();				
			}
			
		}
		
		
		return "\nEl numero mas repedido es "+numAux+" y se repitio: "+numR
				+"\nEl numero menos repedido es "+estAux+" y se repitio: "+numR1
				+"\nLa estrella mas repedida es "+numAux1+" y se repitio: "+numE
				+"\nLa estrella menos repedido es "+estAux1+" y se repitio: "+numE1;
	}
	
	public Integer maximoAciertosHistorico(Combinacion con) throws CombinacionException, HistorialExcepcion {
		
		int numMin=Integer.MIN_VALUE;
		//<>
		for (Entry<LocalDate, Combinacion> c : this.sorteos.entrySet()) {
			
			if(con.comprobarCombinacion(c.getValue())>numMin){
				numMin=con.comprobarCombinacion(c.getValue());
			}
			
		}		
		
		return numMin;
	}
	
	public Combinacion mayorNumeroConsecutivos() {
		
		int numMin=Integer.MIN_VALUE;
		
		Combinacion aux = null;
		
		for (Entry<LocalDate, Combinacion> con : this.sorteos.entrySet()) {
			
			if(mayorSecuencia(con.getValue())>numMin) {
				numMin=mayorSecuencia(con.getValue());
				aux=con.getValue();
			}
			
		}
		
		return aux;
	}
	
	public Combinacion mayorSecuenciaNumerosConsecutivos() {
        List<Combinacion> sorteosSecuencias = new ArrayList(this.sorteos.values());
        Combinacion maxima = sorteosSecuencias.get(0);

        for(Combinacion c : this.sorteos.values()) {
            if(mayorSecuencia(c) > mayorSecuencia(maxima)) {
                maxima = c;
            }
        }
        return maxima;
    }
	
	public Integer mayorSecuencia(Combinacion con) {
		
		int secuencia=0,tmp=-1;
		
		for (Integer i : con.getNumeros()) {
			
			if(i==tmp+1) {
				secuencia++;
			}
			tmp=i;
		}		
		
		return tmp;	
	}
	
}
