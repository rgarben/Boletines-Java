package empresaIT.empresa;

import java.util.Arrays;

public class Empresa{

	private Candidate[] empleados;
	private static final int NUM_MAX_EMPLE=11;
	private int contarEmple;
		
	public Empresa() {
		this.empleados= new Candidate[NUM_MAX_EMPLE];
		this.contarEmple=0;
	}
	//><
	public void addEmpleado(Candidate c) throws Exception {
		
		if(contarEmple<NUM_MAX_EMPLE) {
			if(c instanceof FullStackDeveloper fd) {
				this.empleados[contarEmple++]=fd;
			}else if(c instanceof BackendProgrammer bp) {
				this.empleados[contarEmple++]=bp;
			}else if(c instanceof WebDesigner wd) {
				this.empleados[contarEmple++]=wd;
			}
		}else {
			throw new Exception("No hay hueco.");
		}
		
	}
	
	public Candidate mostrarDatos(String dni) {
		
		Candidate datos = null;
		
		for (Candidate c : empleados) {
			if(c!=null && c.getDni().equalsIgnoreCase(dni)) {
				datos= c;
			}			
		}
		return datos;
	}
	
	public String ordenarPorExper() {
		
		StringBuilder sb = new StringBuilder();
		Arrays.sort(empleados, new CompararExper());
		
		for (Candidate c : empleados) {
			if(c!=null) {
				sb.append(c);
			}
		}
		
		return sb.toString();
	}	

}
