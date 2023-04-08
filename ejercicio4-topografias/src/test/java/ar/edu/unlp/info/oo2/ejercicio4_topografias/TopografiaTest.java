package ar.edu.unlp.info.oo2.ejercicio4_topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	
	Topografia agua;
	Topografia tierra;
	Topografia pantano;
	
	Mixta mixta2;
	Mixta mixta;
	
	
	@BeforeEach
	void setUp() throws Exception {
		agua = new Agua();
		tierra = new Tierra();
		pantano = new Pantano();
		
		mixta = new Mixta();
		Topografia agua1;
		Topografia tierra1;
		Topografia agua11;
		Topografia tierra11;
		agua1 = new Agua();
		tierra1 = new Tierra();
		agua11 = new Agua();
		tierra11 = new Tierra();
		mixta.add(agua1);
		mixta.add(tierra1);
		mixta.add(agua11);
		mixta.add(tierra11);
		
		mixta2 = new Mixta();
    	Topografia agua2 = new Agua();
    	Topografia tierra2 = new Tierra();
    	Topografia agua22 = new Agua();
		mixta2.add(agua2);
		mixta2.add(tierra2);
		mixta2.add(agua22);
		mixta2.add(mixta);
		
	}
	
    @Test
    public void testGetProporcionAgua() {
    	assertEquals(0, tierra.getProporcionAgua());
    	assertEquals(1, agua.getProporcionAgua());
    	assertEquals(0.7, pantano.getProporcionAgua());
    	assertEquals(0.5, mixta.getProporcionAgua());
    	assertEquals(0.625, mixta2.getProporcionAgua());
    }
    
    @Test
    public void testGetProporcionTierra() {
    	assertEquals(1, tierra.getProporcionTierra());
    	assertEquals(0, agua.getProporcionTierra());
    	assertEquals(0.30000000000000004, pantano.getProporcionTierra());
    	assertEquals(0.5, mixta.getProporcionTierra());
    	assertEquals(0.375, mixta2.getProporcionTierra());
    }
    
    @Test
    public void testEsIgual() {
    	assertTrue(this.tierra.equals(new Tierra()));
		assertFalse(this.tierra.equals(new Agua()));
		assertFalse(this.tierra.equals(new Pantano()));
		
		assertTrue(this.agua.equals(new Agua()));
		assertFalse(this.agua.equals(new Tierra()));
		assertFalse(this.agua.equals(new Pantano()));
		
		assertTrue(this.pantano.equals(new Pantano()));
		assertFalse(this.pantano.equals(new Agua()));
		assertFalse(this.pantano.equals(new Tierra()));
		
		assertFalse(mixta.equals(new Pantano()));
		assertFalse(mixta.equals(new Agua()));
		assertFalse(mixta.equals(new Tierra()));
		assertFalse(mixta.equals(mixta2));
		assertTrue(mixta.equals(mixta));
		
		Mixta mixta3 = new Mixta(agua,tierra,agua,mixta2); 
		assertFalse(mixta2.equals(mixta3)); 
		//ambas tiene mixta al final, pero esas mixtas son diferentes
    }
    
    
}
