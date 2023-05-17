package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;

public abstract class RecomendacionStrategy {

	public List<Pelicula> recomedarPeliculas(Decodificador decodificador){
		return this.recomendaciones(decodificador).stream()
				.filter(p1 -> !decodificador.getWatched().contains(p1))
				.limit(3)
		        .collect(Collectors.toList());
	}

	public abstract List<Pelicula> recomendaciones(Decodificador decodificador);

}
