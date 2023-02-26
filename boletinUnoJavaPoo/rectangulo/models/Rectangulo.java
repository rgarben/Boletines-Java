
/*1. Crear una clase Rectangulo con los atributos longitud y ancho, cada uno con un
valor predeterminado igual a 1. Proporcionar los métodos set y get para los
atributos longitud y ancho respectivamente. El método set debe verificar que
longitud y ancho contengan números reales mayores que cero y menores que
20. Además, proporcionar métodos que calculen el perímetro y el área del
rectángulo.
Escribir un método main que solicite los datos de un rectángulo y muestre cual es
su área y su perímetro. Probar a introducir un dato incorrecto (mayor o igual que
20).*/

package rectangulo.models;

public class Rectangulo {

	private double longitud;
	private double ancho;
	
	
	public Rectangulo() {
		super();
		this.longitud=1;
		this.ancho=1;
	}
	public Rectangulo(double longitud, double ancho) {
		this();
		setLogintud(longitud);
		setAncho(ancho);
	}
			
	public double getLogintud() {
		return longitud;
	}
	public void setLogintud(double longitud) {
		
		if (longitud > 0 && longitud <20) {
			this.longitud = longitud;
		}
		
		longitud = this.longitud;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		
		if (ancho > 0 && ancho <20) {
			this.ancho = ancho;
		}
		
		ancho = this.ancho;
	}
	
	public double getPerimetro() {
		return (this.longitud*2)+(this.ancho*2);
	}
	
	public double getArea() {
		return this.longitud*this.ancho;
	}
	@Override
	public String toString() {
		return "La longitud " + longitud + " y el ancho " + ancho + ", el perimetro es de " + getPerimetro()
				+ " y el area es de " + getArea() + ".";
	}
	
	
	
}
