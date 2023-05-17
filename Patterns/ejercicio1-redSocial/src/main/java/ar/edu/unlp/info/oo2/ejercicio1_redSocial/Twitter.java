package ar.edu.unlp.info.oo2.ejercicio1_redSocial;

import java.util.ArrayList;
import java.util.List;

public class Twitter {

	private List<Usuario> usuarios;
	

	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario crearUsuario (String screenName) {
		if (validarScreenName(screenName)) {
			Usuario usuario = new Usuario (screenName);
			this.usuarios.add(usuario);
			return usuario;
		}
		return null;
	}
	
	public void eliminarUsuario(Usuario usuario) {
		if(validarScreenName(usuario.getScreenName())) {
			usuario.eliminarTweets();
			this.usuarios.remove(usuario);
		}
	}
	
	private boolean validarScreenName (String screenName) {
		return this.usuarios.stream().noneMatch(usuario -> usuario.getScreenName().equals(screenName));
	}
	
	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}
}
