package feriaSevilla.model;

import java.util.Objects;

public class Caseta {

		private String titulo;
		private String calle;
		private String numero;
		private String modulos;
		private String clase;
		private String entidad;
		private String id;
		private String id_calle;
		
		
		public Caseta(String titulo, String calle, String numero, String modulos, String clase, String entidad,
				String id, String id_calle) {
			super();
			this.titulo = titulo;
			this.calle = calle;
			this.numero = numero;
			this.modulos = modulos;
			this.clase = clase;
			this.entidad = entidad;
			this.id = id;
			this.id_calle = id_calle;
		}

		
		
		public String getTitulo() {
			return titulo;
		}



		public String getCalle() {
			return calle;
		}



		public String getNumero() {
			return numero;
		}



		public String getModulos() {
			return modulos;
		}



		public String getClase() {
			return clase;
		}



		public String getEntidad() {
			return entidad;
		}



		public String getId() {
			return id;
		}



		public String getId_calle() {
			return id_calle;
		}



		public void setNumero(String numero) {
			this.numero = numero;
		}



		@Override
		public int hashCode() {
			return Objects.hash(calle, clase, entidad, id, id_calle, modulos, numero, titulo);
		}

		@Override
		public boolean equals(Object obj) {
			return this==obj || obj!=null && obj instanceof Caseta && this.hashCode()==obj.hashCode();
		}

		@Override
		public String toString() {
			return "\n   Nombre: " + titulo +"\n       ^" +"\n       | Calle: " + calle + "\n       | Numero: " + numero + "\n       | Modulos: " + modulos
					+ "\n       | Clase: " + clase + "\n       | Entidad: " + entidad + "\n       | Id: " + id + "\n       | Id_calle: " + id_calle+"\n       v";
		}

}
