package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	
	private List<Pelicula> grid;
	private List<Pelicula> watched;
	private RecomendacionStrategy recomendador;
	
	public Decodificador() {
		this.grid = new ArrayList<Pelicula>();
		this.watched = new ArrayList<Pelicula>();
		this.recomendador = new NovedadStrategy();
	}
	
	public boolean reproducida(Pelicula pelicula) {
		return this.watched.contains(pelicula);
	}
	
	public void setRecomendador(RecomendacionStrategy recomendador) {
		this.recomendador = recomendador;
	}
	
	public void addToGrid(Pelicula pelicula) {
		this.grid.add(pelicula);
	}
	
	public void addToWatched(Pelicula pelicula) {
		this.watched.add(pelicula);
	}
	
	public List<Pelicula> recomendar(){
		return this.recomendador.recomedarPeliculas(this);
	}

	public List<Pelicula> getGrid() {
		return grid;
	}

	public List<Pelicula> getWatched() {
		return watched;
	}
	
}
