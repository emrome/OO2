package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuntajeStrategy extends RecomendacionStrategy {
	
	@Override
	public List<Pelicula> recomendaciones(Decodificador decodificador) {
		return decodificador.getGrid().stream()
				.sorted(Comparator.comparingDouble(Pelicula::getPuntaje).reversed())
				.collect(Collectors.toList());
	}

}
