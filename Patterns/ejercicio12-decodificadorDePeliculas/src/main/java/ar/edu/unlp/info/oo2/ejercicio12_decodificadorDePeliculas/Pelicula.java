package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private String titulo;
	private Year anioEstreno;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String titulo, Year anioEstreno, double puntaje) {
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}
	
	/*
	 * Relación recíproca entre dos películas, por lo que si A es similar a B entonces también B es similar a A.
	 */
	public void addSimilar(Pelicula pelicula) {
		if(!this.similares.contains(pelicula)) { //Se hacía un loop infinito sin la condición
			this.similares.add(pelicula);
			pelicula.addSimilar(this);
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public Year getAnioEstreno() {
		return anioEstreno;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}

}
