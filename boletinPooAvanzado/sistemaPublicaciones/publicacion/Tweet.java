package sistemaPublicaciones.publicacion;

import sistemaPublicaciones.usuario.Usuario;

public class Tweet extends Publicacion implements Valorable{

	public Tweet(String texto, Usuario user) throws PublicionException {
		super(texto, user);
		setTexto(texto);
	}
	//><
	protected void setTexto(String texto) throws PublicionException {
		if(texto.length()<=50) {
			this.texto=texto;
		}else {
			throw new PublicionException("El texto tiene que ser como maximo de 50 caracteres.");
		}
	}
	
	public boolean Valorar(String valoracion) throws PublicionException {
		
		boolean valorar =false;
		
		if(valoracion!=null) {
			if(valoracion.equalsIgnoreCase("superbuena")) {
				this.valoracion = Valoraciones.SUPERBUENA.getValoracion()*2;
			}else if(valoracion.equalsIgnoreCase("muybuena")) {
				this.valoracion = Valoraciones.MUYBUENA.getValoracion()*2;
			}else if(valoracion.equalsIgnoreCase("buena")) {
				this.valoracion = Valoraciones.BUENA.getValoracion()*2;
			}else if(valoracion.equalsIgnoreCase("nomal")) {
				this.valoracion = Valoraciones.NORMAL.getValoracion()*2;
			}else if(valoracion.equalsIgnoreCase("regular")) {
				this.valoracion = Valoraciones.REGULAR.getValoracion()*2;
			}else if(valoracion.equalsIgnoreCase("muymala")) {
				this.valoracion = Valoraciones.MUYMALA.getValoracion()*2;
			}else {
				throw new PublicionException("Valoracion no valida.");
			}
			valorar=true;
		}
		
		return valorar;
	}
		
	@Override
	public String toString() {
		return "Tweet." + "\nPublicacion: "+getTexto() + "\nRealizada por: " + getLoginUsuario() + "\nValoración: "
				+ getValoracion() + "\nFecha de publicación: " + getFechaCreacion()+"\n";
	}


}
