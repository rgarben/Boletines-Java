package sistemaPublicaciones.publicacion;

import sistemaPublicaciones.usuario.Usuario;

public class Recomendacion extends Publicacion {

	private int numeroEstrellas;
	
	public Recomendacion(String texto, Usuario user, int numero) throws PublicionException {
		super(texto, user);
		if(numero>0 && numero<6) {
			this.numeroEstrellas=numero;
			setTexto(texto);
		}
	}
	//><
	protected void setTexto(String texto) throws PublicionException {
		if(texto!=null && texto.length()>=100 && texto.length()<=200) {
			this.texto=texto;
		}else {
			throw new PublicionException("El texto tiene que tener entre 100 y 200, con minimo 1 estrella.");
		}
	}
			
	@Override
	public String toString() {
		return "Recomendación." + "\nPublicacion: "+getTexto() + "\nRealizada por: " + getLoginUsuario() + "\nValoración: "
				+ getValoracion() + "\nFecha de publicación: " + getFechaCreacion()+ "\nNúmero de estrellas: " + getNumeroEstrellas();
	}

	public int getNumeroEstrellas() {
		return numeroEstrellas;
	}

}
