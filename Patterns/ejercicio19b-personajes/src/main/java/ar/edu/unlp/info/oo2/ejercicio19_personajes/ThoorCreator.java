package ar.edu.unlp.info.oo2.ejercicio19_personajes;

public class ThoorCreator implements Creator {
	
	public Personaje crearPersonaje() {
		return new Personaje("Thooro","lanzar rayos y combate a distancia", new Martillo(), new ArmaduraDeHierro());
	}
}
