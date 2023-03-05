package fabrica.productos;

import java.util.Objects;

public class Producto {

	private String descipcion;
	private double precio;
	
	public Producto(String descipcion, double precio) {
		this.descipcion = descipcion;
		this.precio = precio;
	}
	@Override
	public int hashCode() {
		return Objects.hash(descipcion, precio);
	}

	public String getDescipcion() {
		return descipcion;
	}
	public void setDescipcion(String descipcion) {
		this.descipcion = descipcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double precioConIva(double precio) {
		this.precio=this.precio*1.20;
		return this.precio;
	}
}
