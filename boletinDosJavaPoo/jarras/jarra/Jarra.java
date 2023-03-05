package jarras.jarra;

public class Jarra {

	private int capacidad;
	private int catidadAgua;
	
	public Jarra(int capacidad, int catidadAgua) {
		super();
		this.capacidad = capacidad;
		this.catidadAgua = catidadAgua;
	}
	public Jarra() {
		super();
		this.capacidad = 0;
		this.catidadAgua = 0;
	}
	public Jarra(int capacidad) {
		super();
		this.capacidad = capacidad;
		this.catidadAgua = 0;
	}
	//><
	public void llenarJarra(Object obj) {
		this.catidadAgua=this.catidadAgua<this.capacidad?this.catidadAgua+(this.capacidad-this.catidadAgua):this.catidadAgua;
	}
	
	public void vaciarJarra(Object obj) {
		this.catidadAgua=0;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public int getCatidadAgua() {
		return catidadAgua;
	}
	
	public void setCatidadAgua(int catidadAgua) {
		this.catidadAgua = catidadAgua;
	}
	
	public void volcarJarra(Jarra jarra2) {
		
		int capacidadJarra2 = jarra2.capacidad-jarra2.catidadAgua;		
		if (this.catidadAgua>=capacidadJarra2) {
			this.catidadAgua-=capacidadJarra2;
			jarra2.catidadAgua+=capacidadJarra2;
		}else if (this.catidadAgua<capacidadJarra2){
			this.catidadAgua=capacidadJarra2-this.catidadAgua;
			jarra2.catidadAgua+=(capacidadJarra2-this.catidadAgua);
		}
		
	}
	@Override
	public String toString() {
		return "Jarra "+" capacidad: " + this.capacidad + " y catidadAgua: " + this.catidadAgua + ".";
	}
	
	
	
}
