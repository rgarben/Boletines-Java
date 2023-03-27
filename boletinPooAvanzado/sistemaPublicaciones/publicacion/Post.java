package sistemaPublicaciones.publicacion;

import sistemaPublicaciones.usuario.Usuario;

public class Post extends Publicacion implements Valorable{

	private int numeroLecturas;
	private String tema;
	
	public Post(String texto, Usuario user, String tema) throws PublicionException {
		super(texto, user);
		this.tema=tema;
		setTexto(texto);
	}

	protected void setTexto(String texto) throws PublicionException {
		if(texto!=null && !texto.isBlank()) {
			this.texto=texto;
		}else {
			throw new PublicionException("El texo no puede estar vacio.");
		}
	}
		
	public boolean Valorar(String valoracion) throws PublicionException {
		
		boolean valorar =false;
		
		if(valoracion!=null) {
			if(valoracion.equalsIgnoreCase("superbuena")) {
				this.valoracion = Valoraciones.SUPERBUENA.getValoracion();
			}else if(valoracion.equalsIgnoreCase("muybuena")) {
				this.valoracion = Valoraciones.MUYBUENA.getValoracion();
			}else if(valoracion.equalsIgnoreCase("buena")) {
				this.valoracion = Valoraciones.BUENA.getValoracion();
			}else if(valoracion.equalsIgnoreCase("nomal")) {
				this.valoracion = Valoraciones.NORMAL.getValoracion();
			}else if(valoracion.equalsIgnoreCase("regular")) {
				this.valoracion = Valoraciones.REGULAR.getValoracion();
			}else if(valoracion.equalsIgnoreCase("muymala")) {
				this.valoracion = Valoraciones.MUYMALA.getValoracion();
			}else {
				throw new PublicionException("Valoracion no valida.");
			}
			valorar=true;
			this.numeroLecturas++;
		}
		
		return valorar;
	}
		
	@Override
	public String toString() {
		return "Post." + "\nPublicacion: "+getTexto() + "\nRealizada por: " + getLoginUsuario() + "\nValoración: "
				+ getValoracion() + "\nFecha de publicación: " + getFechaCreacion()+"\n";
	}
	
	public int getNumeroLecturas() {
		return numeroLecturas;
	}

	public String getTema() {
		return tema;
	}


}


