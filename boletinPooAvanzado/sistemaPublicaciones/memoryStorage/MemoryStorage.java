package sistemaPublicaciones.memoryStorage;

import sistemaPublicaciones.publicacion.Post;
import sistemaPublicaciones.publicacion.Publicacion;
import sistemaPublicaciones.publicacion.PublicionException;
import sistemaPublicaciones.publicacion.Recomendacion;
import sistemaPublicaciones.publicacion.Tweet;
import sistemaPublicaciones.usuario.Usuario;

public class MemoryStorage {
	
	private static final int MAXIMO_USUARIOS=15;
	private static final int MAXIMO_PUBLICACIONES=50;	
	private int numeroUsuariosActuales;
	private int numPublicaionesActuales;
	private Usuario[] usuarios;
	private Publicacion[] publicaciones;
	
	public MemoryStorage() {
		super();
		this.usuarios = new Usuario[MAXIMO_USUARIOS];
		this.publicaciones = new Publicacion[MAXIMO_PUBLICACIONES];
	}
	//><
	private int posicionUsuario(String login) {
		
		int posicion=-1;
		
		for(int i=0;i<MAXIMO_USUARIOS && posicion==-1;i++) {
			if(usuarios[i]!=null && usuarios[i].getLogin().equals(login)) {
				posicion=i;
			}
		}
		
		return posicion;		
	}
	
	public void addUsuario(String login,String pass) {
		
		if(posicionUsuario(login)==-1) {
			this.usuarios[numeroUsuariosActuales++%MAXIMO_USUARIOS]= new Usuario(login, pass);
		}
		
	}
	
	public void addPublicacion(String tweet,String user) throws PublicionException, MemoryStorageException {

		if(posicionUsuario(user)!=-1) {
			this.publicaciones[numPublicaionesActuales++%MAXIMO_PUBLICACIONES]= new Tweet(tweet, this.usuarios[posicionUsuario(user)]);
		}else {
			throw new MemoryStorageException("Tweet no publicado.");
		}

	}
	
	public void addPublicacion(String post,String user,String texo3) throws MemoryStorageException, PublicionException {
		
		if(posicionUsuario(user)!=-1) {
			this.publicaciones[numPublicaionesActuales%MAXIMO_PUBLICACIONES]= new Post(post, this.usuarios[posicionUsuario(user)],texo3);
			numPublicaionesActuales++;
		}else {
			throw new MemoryStorageException("Post no publicado.");
		}
	}
	
	public void addPublicacion(String reco,String user,int numero) throws PublicionException, MemoryStorageException {
		
		if(posicionUsuario(user)!=-1) {
			this.publicaciones[numPublicaionesActuales%MAXIMO_PUBLICACIONES]= new Recomendacion(reco, this.usuarios[posicionUsuario(user)],numero);
			numPublicaionesActuales++;
		}else {
			throw new MemoryStorageException("Recomendacion no publicada.");
		}
	}
	
	public String mostrarListaPublicaciones() {
		
		StringBuilder sb = new StringBuilder();
		
		for(Publicacion p: publicaciones)
			if(p!=null) {
				sb.append(p+"\n");
			}
		
		return sb.toString();
	}
	
	public String mostrarTweets() {
		
		StringBuilder sb = new StringBuilder();
		
		for(Publicacion p: publicaciones)
			if(p instanceof Tweet) {
				sb.append(p+"\n");
			}
		
		return sb.toString();
	}
	
	public String mostrarPosts() {
		
		StringBuilder sb = new StringBuilder();
		
		for(Publicacion p: publicaciones)
			if(p instanceof Post) {
				sb.append(p+"\n");
			}
		
		return sb.toString();
	}
	
	public String mostrarRecomendacion() {
		
		StringBuilder sb = new StringBuilder();
		
		for(Publicacion p: publicaciones)
			if(p instanceof Recomendacion) {
				sb.append(p+"\n");
			}
		
		return sb.toString();
	}
	
}
