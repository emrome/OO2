/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio12_decodificadorDePeliculas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Year;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	
	Pelicula thor;
	Pelicula capitanAmerica;
	Pelicula ironMan;
	Pelicula dunkirk;
	Pelicula rocky;
	Pelicula rambo;
	
	Decodificador decodificador;
	
	@BeforeEach
	void setUp() throws Exception {
		thor = new Pelicula("Thor", Year.of(2007), 7.9);
		capitanAmerica = new Pelicula("Capitan America", Year.of(2016), 7.8);
		ironMan = new Pelicula("Capitan America", Year.of(2010), 7.9);
		dunkirk = new Pelicula("Capitan America", Year.of(2017), 7.9);
		rocky = new Pelicula("Capitan America", Year.of(1976), 8.1);
		rambo = new Pelicula("Capitan America", Year.of(1979), 7.8);
		
		thor.addSimilar(capitanAmerica);
		thor.addSimilar(ironMan);
		capitanAmerica.addSimilar(ironMan);
		rocky.addSimilar(rambo);
		
		decodificador = new Decodificador();
		
		decodificador.addToGrid(thor);
		decodificador.addToGrid(capitanAmerica);
		decodificador.addToGrid(ironMan);
		decodificador.addToGrid(dunkirk);
		decodificador.addToGrid(rocky);
		decodificador.addToGrid(rambo);
		
		decodificador.addToWatched(thor);
		decodificador.addToWatched(rocky);
	}
    @Test
    public void testRecomendar() {
    	List<Pelicula> lista;
    	
    	//default es por Novedad
    	lista = decodificador.recomendar();
    	assertTrue(lista.contains(capitanAmerica));
        assertTrue(lista.contains(ironMan));
        assertTrue(lista.contains(dunkirk));
    	
    	decodificador.setRecomendador(new SimilaridadStrategy());
        lista = decodificador.recomendar();
        assertTrue(lista.contains(capitanAmerica));
        assertTrue(lista.contains(ironMan));
        assertTrue(lista.contains(rambo));
        
        decodificador.setRecomendador(new PuntajeStrategy());
        lista = decodificador.recomendar();
        assertTrue(lista.contains(capitanAmerica));
        assertTrue(lista.contains(ironMan));
        assertTrue(lista.contains(dunkirk));
    }
}
