package ar.edu.unlp.info.oo2.ejercicio21_genealogiaSalvaje;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MamiferoTest {
	private Mamifero hijo;
	private Mamifero padre;
	private Mamifero madre;
	private Mamifero abuelo;
	private Mamifero nullMamifero;
	
	
	@BeforeEach
	void setUp() {
		hijo = new RealMamifero("Nala");
		padre = new RealMamifero("Melquiades");
		madre = new RealMamifero("Mufasa");
		abuelo = new RealMamifero("Alexa");
		nullMamifero = new NullMamifero();
		
		hijo.setPadre(padre);
		hijo.setMadre(madre);
		padre.setPadre(abuelo);
		padre.setMadre(nullMamifero);
		
	}
	
	@Test
	void testTieneComoAncestroA() {
		assertFalse(padre.tieneComoAncestroA(hijo));
		assertFalse(hijo.tieneComoAncestroA(hijo));
		
		assertTrue(hijo.tieneComoAncestroA(padre));
		assertTrue(hijo.tieneComoAncestroA(abuelo));
		
	}
	/*
	 * @Test
	void testAbuelaMaterna() {
		assertEquals(elsa, alexa.getAbuelaMaterna());	
		assertNull(sarabi.getAbuelaMaterna());
		assertNull(elsa.getAbuelaMaterna());
	}
	
	@Test
	void testAbuelaPaterna() {
		assertEquals(nala, alexa.getAbuelaPaterna());	
		assertNull(mufasa.getAbuelaPaterna());
		assertNull(nala.getAbuelaPaterna());

	}
	
	@Test
	void testAbueloMaterno() {
		assertEquals(scar, alexa.getAbueloMaterno());	
		assertNull(sarabi.getAbueloMaterno());
		assertNull(scar.getAbueloMaterno());

	}
	
	@Test
	void testAbueloPaterno() {
		assertEquals(melquiades, alexa.getAbueloPaterno());	
		assertNull(mufasa.getAbueloPaterno());
		assertNull(melquiades.getAbueloPaterno());

	}
	
	@Test
	void testEspecie() {
		anonimo.setEspecie("Panthera leo");
		assertEquals("Panthera leo", anonimo.getEspecie());
	}
	
	@Test
	void testIdentificador() {
		anonimo.setIdentificador("Nala");
		assertEquals("Nala", anonimo.getIdentificador());
	}
	
	@Test
	void testMadre() {
		anonimo.setMadre(alexa);
		assertEquals(alexa, anonimo.getMadre());
		assertNull(nala.getMadre());
	}
	
	@Test
	void testPadre() {
		anonimo.setPadre(mufasa);
		assertEquals(mufasa, anonimo.getPadre());
		assertNull(nala.getPadre());
	}
	
	 */
	
}
