package ar.edu.unlp.info.oo2.ejercicio2b_biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.ejercicio2b_biblioteca.Biblioteca;
import ar.edu.unlp.info.oo2.ejercicio2b_biblioteca.Socio;

class BibliotecaTest {
	
	private Biblioteca biblioteca;
	private Socio arya;
	private Socio tyron;
	
	@BeforeEach
	void setUp () throws Exception{
		biblioteca = new Biblioteca();
		arya = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		tyron = new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2");
		
	}

	@Test
	void testExportarSocioJSON() throws ParseException { //Que el json sea valido
		biblioteca.setExporter(new JSONSimpleAdapter());
		String salida0 = "[]";
		assertEquals(biblioteca.exportarSocios(),salida0);
		
		JSONParser parser = new JSONParser();
		biblioteca.agregarSocio(arya);
		String salida1 = "[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	}\n"
				+ "]";
				
		assertEquals(parser.parse(biblioteca.exportarSocios()),parser.parse(salida1));
		
		biblioteca.agregarSocio(tyron);
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
		
		assertEquals(parser.parse(biblioteca.exportarSocios()),parser.parse(salida2));
		
		
	}
	
	@Test
	void testExportarSocioJackson() throws ParseException { //Que el json sea valido
		biblioteca.setExporter(new JacksonAdapter());
		String salida0 = "[]";
		assertEquals(biblioteca.exportarSocios(),salida0);
		
		JSONParser parser = new JSONParser();
		biblioteca.agregarSocio(arya);
		String salida1 = "[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	}\n"
				+ "]";
				
		assertEquals(parser.parse(biblioteca.exportarSocios()),parser.parse(salida1));
		
		biblioteca.agregarSocio(tyron);
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
		
		assertEquals(parser.parse(biblioteca.exportarSocios()),parser.parse(salida2));
		
		
	}
}
