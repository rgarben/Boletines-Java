package boletin1EstructuraDatosAvanzados.ejercicio7GranAlmacen;

public class Almacen {

	private String nombre;
	private static final int NUMERODECAJAS=20;
	private static int numCliente=1;
	private int cliente;
	private Caja[] cajas;
	//<>
	public Almacen(String nombre) {
		super();
		this.nombre=nombre;
		this.cajas = new Caja[NUMERODECAJAS];
		for(int i=0;i<NUMERODECAJAS;i++) {
			this.cajas[i]= new Caja();
		}
	}
	
	public void abrirCaja(int num) throws Exception {
		for (Caja caja : cajas) {
			if(caja!=null && caja.getNumero()==num) {
				caja.abrirCaja();
			}
		}
	}
	
	public void cerrarCaja(int num) throws Exception {
		for (Caja caja : cajas) {
			if(caja!=null && caja.getNumero()==num) {
				caja.cerrarCaja();
			}
		}
	}
	
	public String nuevoCliente() {
		
		String informar = "";
		
		if(clientesEnCola()!=null && clientesEnCola().isEstaAbierta()) {
			Caja aux=clientesEnCola();
			clientesEnCola().addCliente(cliente+numCliente++);
			informar="Es usted el cliente número "+cliente+" y debe ir a la caja número "+aux.getNumero();
		}
		
		return informar;
	}
	

	
	public String atenderCliente(int num) throws Exception{
		String informar = "";
		boolean hay=false;
				
		for (Caja caja : cajas) {
			if(caja!=null && caja.isEstaAbierta() && !caja.getCola().isEmpty() && caja.getNumero()==num) {
				caja.borrarCliente();
				hay=true;
				informar="Se ha atendido al cliente con número "+caja.dameCliente();
			}
		}
		
		if(!hay) {
			throw new Exception("No hay clientes en la cola o la caja esta cerrada.");
		}
		
		return informar;
	}
	
	public Caja clientesEnCola() {
		
		Caja aux = null;
		int guardar=0;
		
		for (int i=0;i<NUMERODECAJAS;i++) {
			if(cajas[i]!=null && i==0) {
				guardar=cajas[i].getCola().size();
			}else if(cajas[i]!=null && guardar<cajas[i].getCola().size()) {
				guardar=cajas[i].getCola().size();
				aux=cajas[i];
			}
		}
		
		return aux;
	}
	
}
