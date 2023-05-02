package ar.edu.unlp.info.oo2.ejercicio19_personajes;

public class MagoCreator implements Creator {
	
	public Personaje crearPersonaje() {
		return new Personaje("Mario","magia y el combate a distancia", new Baston(), new ArmaduraDeCuero());
	}
}
