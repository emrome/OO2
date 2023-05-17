package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;

public class SimilaridadStrategy extends RecomendacionStrategy {

	@Override
	public List<Pelicula> recomendaciones(Decodificador decodificador) {
		return decodificador.getWatched().stream()
				.map(Pelicula::getSimilares)
				.flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());
	}

}
