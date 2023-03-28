package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BibliotecaTest {

	private Biblioteca biblioteca;

	@Test
	void testExportarSocio() {
		biblioteca = new Biblioteca();
		String salida0 = "[]";
		assertEquals(biblioteca.exportarSocios(),salida0);
		
		System.out.println(biblioteca.exportarSocios());
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		String salida1 = "[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	}\n"
				+ "]";
				
		System.out.println(biblioteca.exportarSocios());
		assertEquals(biblioteca.exportarSocios(),salida1);
		
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		String salida2 = "[\n"
				+ "    {\n"
				+ "   		\"nombre\": \"Arya Stark\",\n"
				+ "   	    \"email\": \"needle@stark.com\",\n"
				+ "   	    \"legajo\": \"5234-5\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "   	    \"nombre\": \"Tyron Lannister\",\n"
				+ "   	    \"email\": \"tyron@thelannisters.com\",\n"
				+ "   	    \"legajo\": \"2345-2\"\n"
				+ "    }\n"
				+ "]\n";

		
		System.out.println(biblioteca.exportarSocios());
		assertEquals(biblioteca.exportarSocios(),salida2);
	
	}
	
}


