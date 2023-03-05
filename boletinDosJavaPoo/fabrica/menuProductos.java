package fabrica;

import fabrica.productos.Producto;

public class menuProductos {

	public static void main(String[] args) {

		Producto teclado = new Producto("Razer",56.95);		
		Producto raton = new Producto("Logitech",88.34);
		System.out.println(teclado.hashCode());
		System.out.println(raton.hashCode());
		System.out.println(teclado.precioConIva(0));
		System.out.println(raton.precioConIva(0));
	}

}
