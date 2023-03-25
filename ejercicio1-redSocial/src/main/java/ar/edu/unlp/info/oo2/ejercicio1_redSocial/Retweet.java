package ar.edu.unlp.info.oo2.ejercicio1_redSocial;

public class Retweet extends Tweet {
	
	private Tweet original;

	public Retweet (String texto, Tweet original) {
		super(texto);
		this.original=original;
	}
	
	public String getTexto() {
		return "Retweet: " + this.getTexto() + "Original: " + this.original.getTexto();
	}
}
