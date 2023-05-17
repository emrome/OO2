package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuntajeStrategy extends RecomendacionStrategy {
	
	@Override
	public List<Pelicula> recomendaciones(Decodificador decodificador) {
		return decodificador.getGrid().stream()
				.sorted(Comparator.comparingDouble(Pelicula::getPuntaje).reversed()
					.thenComparing((p2,p1)-> p1.getAnioEstreno().compareTo(p2.getAnioEstreno()))) 
				//mismo comparador que en Novedad, podria definir comparador en super y sobreescribir solo el de similiridad
				.collect(Collectors.toList());
	}

}
