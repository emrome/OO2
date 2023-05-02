package ar.edu.unlp.info.oo2.ejercicio19_personajes;

public class Personaje {

	private String nombre;
	private String habilidad;
	private Arma arma;
	private Armadura armadura;
	private int vida;
	

	public Personaje(String nombre, String habilidad, Arma arma, Armadura armadura) {
		this.nombre = nombre;
		this.habilidad = habilidad;
		this.arma = arma;
		this.armadura = armadura;
		this.vida = 100;
	}
	
	public void daño() {
		if (this.estoyVivo()) {
			this.vida =- this.getArma().calcularDaño(this.getArmadura());
		}
	}

	public void atacar(Personaje personaje) {
		if (this.estoyVivo()) {
			personaje.daño();
		}
	}
	
	private boolean estoyVivo() {
		return this.vida > 0;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public Arma getArma() {
		return arma;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public int getVida() {
		return vida;
	}


}
