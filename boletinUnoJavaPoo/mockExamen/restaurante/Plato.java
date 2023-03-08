package restaurante;

import java.util.Objects;

public class Plato {

	private String nombre;
	private double precio;
	private static int iva = 21;
	private Vino nombreVino;
	
	public Plato(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Plato(String nombre, double precio) {
		this(nombre);
		if(precio<=0) {
			System.out.println("Precio erroneo.");
		}
		this.precio = precio;
	}		
	
	public String getNombre() {
		return nombre;
	}
		
	public static int getIva() {
		return iva;
	}

	public double getPrecioBase() {
		return precio;
	}
	
	public double getPrecioVentaPublico() {
		return (this.precio+((this.precio*this.iva)/100));
	}
	
	public String getVinoRecomendado() {
        String descripcion = "Sin recomendaciones para el vino";
        if(this.nombreVino != null) {
            descripcion = this.nombreVino.toString();
        }

        return descripcion;
    }
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void incrementaPrecio (double incremento) {
		
	}
	
	public void setVinoRecomendado (Vino vino) {
		this.nombreVino = vino;
	}
	
	public void setVinoRecomendado (String vinoNombre, double graduacion) {
		Vino vino = new Vino(vinoNombre,graduacion); 
		setVinoRecomendado(vino);
	}
	
	public double setGradosVinosRecomendado() {
		
		double grados=0.0;
		
		if (this.nombreVino!=null) {
			grados=this.nombreVino.getGraduacion();
		}
		
		return grados;
	}

	public String toString() {
		return "Nombre del plato " + this.nombre + ", precio " + this.precio + ", precio venta para el publico " 
				+ this.getPrecioVentaPublico()+", vino recomendado " + getVinoRecomendado() + ".";
	}
	
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Plato) 
				&& Objects.equals(this.nombre, ((Plato) obj).nombre));
	}
}
				