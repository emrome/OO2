package ar.edu.unlp.info.oo2.ejercicio8_excursiones;

public abstract class State {
	
	public String informacion(Excursion excursion) {
		return "La excursion '" + excursion.getNombre()
				+ "' tiene un costo de " + excursion.getCosto()
				+ " con fecha de inicio " + excursion.getFechaInicio().toString()
				+ " y fecha de fin " + excursion.getFechaFin().toString()
				+ ".\nEl punto de encuentro es en '" + excursion.getPuntoDeEncuentro();
	}
	
	public abstract void inscribir(Usuario usuario, Excursion excursion);
	
}
