/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio4_topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	
	Topografia agua;
	Topografia tierra;
	
	Mixta mixta;
	Topografia agua1;
	Topografia tierra1;
	Topografia agua11;
	Topografia tierra11;
	
	@BeforeEach
	void setUp() throws Exception {
		agua = new Agua();
		tierra = new Tierra();
		
		mixta = new Mixta();
		agua1 = new Agua();
		tierra1 = new Tierra();
		agua11 = new Agua();
		tierra11 = new Tierra();
		mixta.add(agua1);
		mixta.add(tierra1);
		mixta.add(agua11);
		mixta.add(tierra11);
	}
    @Test
    public void testGetProporcion() {
    	assertEquals(0, tierra.getProporcion());
    	assertEquals(1, agua.getProporcion());
    	assertEquals(0.5, mixta.getProporcion());
    }
    
    @Test
    public void testEsIgual() {
    	Mixta mixta2 = new Mixta();
    	Topografia agua2 = new Agua();
    	Topografia tierra2 = new Tierra();
    	Topografia agua22 = new Agua();
		mixta2.add(agua2);
		mixta2.add(tierra2);
		mixta2.add(agua22);
		mixta2.add(mixta);
		
		assertEquals(0.625, mixta2.getProporcion()); //No deberia ser 0.375
		
		assertFalse(agua.esIgual(tierra));
		assertFalse(agua.esIgual(mixta));
		assertFalse(mixta.esIgual(mixta2));
		assertTrue(mixta.esIgual(mixta));
    }
    
    
}
