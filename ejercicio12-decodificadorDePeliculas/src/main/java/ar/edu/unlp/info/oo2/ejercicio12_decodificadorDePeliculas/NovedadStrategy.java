package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;

public class NovedadStrategy extends RecomendacionStrategy {

	@Override
	public List<Pelicula> recomendaciones(Decodificador decodificador) {
		return decodificador.getGrid().stream()
				.sorted((p2,p1)-> p1.getAnioEstreno().compareTo(p2.getAnioEstreno()))
				.collect(Collectors.toList());
	}


}
