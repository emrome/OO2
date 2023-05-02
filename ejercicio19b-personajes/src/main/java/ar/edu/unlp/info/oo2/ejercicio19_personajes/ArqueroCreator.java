package ar.edu.unlp.info.oo2.ejercicio19_personajes;

public class ArqueroCreator implements Creator {
	
	public Personaje crearPersonaje() {
		return new Personaje("Tu Arquero","especialistas tiros de flechas", new Arco(), new ArmaduraDeCuero());
	}
}
