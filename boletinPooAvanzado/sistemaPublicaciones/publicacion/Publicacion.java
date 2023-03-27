package sistemaPublicaciones.publicacion;

import java.time.LocalDateTime;
import java.util.Objects;

import sistemaPublicaciones.usuario.Usuario;

public abstract class Publicacion implements Valorable, Comparable<Publicacion>{

	protected String texto;
	private LocalDateTime fechaCreacion;
	protected int valoracion;
	private int codigo;
	private static int codigoSiguiente;
	Usuario usuario;
		
		
	public Publicacion(String texto, Usuario user) {
		super();
		this.codigo=codigoSiguiente++;
		this.fechaCreacion=LocalDateTime.now();
		this.usuario=user;
		this.texto=texto;
	}
	
	protected String getTexto() {
		return texto;
	}
	
	protected abstract void setTexto(String texto) throws PublicionException;

	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, texto, valoracion);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Publicacion) 
				&& Objects.equals(this.codigo, ((Publicacion) obj).codigo));
	}
	
	public int getValoracion() {
		return this.valoracion;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	@Override
	public boolean Valorar(String valoracion) throws PublicionException {
		boolean resul = false;
		try {
			Valoraciones v = Valoraciones.valueOf(valoracion);
			valoracion+=v.getValoracion();
			resul=true;
		} catch (Exception e) {
			System.out.println(e);
		}
				
		return resul;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getLoginUsuario() {
		return this.usuario.getLogin();
	}

	@Override
	public String toString() {
		return "Publicación: " + texto + "\nRealizada por: " + usuario + "\nValoración: " + valoracion
				+ "\nFechaCreacion: " + fechaCreacion+"\n";
	}
	//><
	
	public boolean isAnterior(Publicacion publica) {
				
		return this.fechaCreacion.isBefore(publica.getFechaCreacion());		
	}
	@Override
	public int compareTo(Publicacion publica) {
		int resultado = 0;
		if(publica.getValoracion()>this.getValoracion()) {
			resultado=1;
		}else if (publica.getValoracion()<this.getValoracion()) {
			resultado=-1;
		}else if (publica.getValoracion()==this.getValoracion()) {
			resultado=(publica.getFechaCreacion().compareTo(this.fechaCreacion));
		}
				
		return resultado;
	}

}
