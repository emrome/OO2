package ar.edu.unlp.info.oo2.ejercicio2b_bibliotec;

import static org.junit.jupiter.api.Assertions.*;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.ejercicio2b_biblioteca.Biblioteca;
import ar.edu.unlp.info.oo2.ejercicio2b_biblioteca.Socio;

class BibliotecaTest {
	
	private Biblioteca biblioteca;
	private Socio arya;
	private Socio tyron;

	@BeforeEach
	void setUp() {
		biblioteca = new Biblioteca();
		arya = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		tyron = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2");
		biblioteca.agregarSocio(arya);
		biblioteca.agregarSocio(tyron);
	}

	@Test
	void testExportarSocio() {
		// ????
	}

}
