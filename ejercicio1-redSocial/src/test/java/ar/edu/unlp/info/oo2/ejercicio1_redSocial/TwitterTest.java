/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio1_redSocial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	private Twitter twitter;
	
	
	@BeforeEach
	void setUp() throws Exception {
		twitter = new Twitter();
	}
	
    @Test
    public void testCrearUsuario() {
        twitter.crearUsuario("guido_vanRossum");
        twitter.crearUsuario("emilia_vanRossum");
        twitter.crearUsuario("guido_romero");
        twitter.crearUsuario("guido_romero");
    	assertEquals(3, twitter.getUsuarios().size());
    }
    
    public void testEliminarUsuario() {
    	twitter.crearUsuario("james_glossing");
    	assertEquals(1, twitter.getUsuarios().size());
    	Usuario james = new Usuario("james_glossing");
    	twitter.eliminarUsuario(james);
    	assertEquals(0, twitter.getUsuarios().size());
    }
    
}
