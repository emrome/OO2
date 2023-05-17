package ar.edu.unlp.info.oo2.ejercicio1_redSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario (String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<Tweet>();
	}

	public void agregarTweet (String texto) {
		if (validarCaracteres(texto))
			tweets.add(new Tweet(texto));
	}
	
	public void retweetear (String texto, Tweet tweet) {
		if(validarCaracteres(texto)) {
			this.tweets.add(new Retweet(texto, tweet));
		}
	}
	
	public void eliminarTweets() {
		this.tweets.clear();
	}
	
	private boolean validarCaracteres(String texto) {
		return (texto.length() >= 1) && (texto.length() <= 280);
	}
	
	public List<Tweet> getTweets(){
		return this.tweets;
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
}
