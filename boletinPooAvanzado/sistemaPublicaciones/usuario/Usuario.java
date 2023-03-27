package sistemaPublicaciones.usuario;

import java.util.Objects;

public class Usuario {


	private String login;
	private String pass;
	
	public Usuario(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}

	public String getLogin() {
		return login;
	}

	public boolean setPass(String pass1,String pass2) {
		
		boolean mismaPass = false;
		
		if(pass1==pass2) {
			mismaPass=true;
			this.pass=pass1;
		}		
		return mismaPass;
	}
	
	public boolean checkPass(String pass) {
		return this.pass==pass;
	}

	@Override
	public int hashCode() {
		return Objects.hash(login);
	}
	
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Usuario) 
				&& Objects.equals(this.login, ((Usuario) obj).login));
	}
	
}
