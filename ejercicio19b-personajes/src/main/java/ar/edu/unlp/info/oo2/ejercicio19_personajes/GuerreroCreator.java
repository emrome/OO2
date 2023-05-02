package ar.edu.unlp.info.oo2.ejercicio19_personajes;

public class GuerreroCreator implements Creator {
	
	public Personaje crearPersonaje() {
		return new Personaje("Pocho","combate cuerpo a cuerpo", new Espada(), new ArmaduraDeAcero());
	}
}
