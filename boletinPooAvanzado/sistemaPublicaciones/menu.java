package sistemaPublicaciones;

import sistemaPublicaciones.memoryStorage.MemoryStorage;
import sistemaPublicaciones.publicacion.Post;
import sistemaPublicaciones.publicacion.Publicacion;
import sistemaPublicaciones.publicacion.Tweet;
import sistemaPublicaciones.usuario.Usuario;

public class menu {

	public static void main(String[] args) {
		
		MemoryStorage baseDatos = new MemoryStorage();

        try {
        	
            System.out.println(baseDatos.mostrarListaPublicaciones());
            
            baseDatos.addUsuario("Pepejuan", "pepepe");
            baseDatos.addPublicacion("Prueba", "Pepejuan");
            
            System.out.println(baseDatos.mostrarListaPublicaciones());
            
            baseDatos.addPublicacion("supercalifragilisticoespialidoso supercalifragilisticoespialidoso"
                    + "supercalifragilisticoespialidoso supercalifragilisticoespialidoso supercalifragilisticoespialidoso"
                    + "aro aro aro que si ", "Pepejuan", 2);
            System.out.println(baseDatos.mostrarRecomendacion());
            
            baseDatos.addPublicacion("Postergey", "Pepejuan", "bywatermyfriend");
            System.out.println(baseDatos.mostrarPosts());
            
            Usuario pepote = new Usuario("Pepejuan", "pepepete");
            Publicacion pruebaValoracion = new Tweet("Valorando", pepote);
            System.out.println(pruebaValoracion);
            
            pruebaValoracion.Valorar("superbuena");
            System.out.println(pruebaValoracion);
            Publicacion postValo =  new Post("alñsjdaolsjdoaisjd aodjaoisdjaos aiosdjoaisjd", pepote, "cocinaAAA");
            System.out.println(postValo);
            
            postValo.Valorar("muymala");
            
            System.out.println(postValo);

            baseDatos.mostrarTweets();
            
            System.out.println(baseDatos.mostrarTweets());

        } catch (Exception e) {

            e.printStackTrace();
        }

	}

}
