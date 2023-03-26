package ar.edu.unlp.info.oo2.ejercicio2b_bibliotec;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter implements VoorheesExporter {

	@Override
	public String exportar(List<Socio> socios) {
		ObjectMapper mapper = new ObjectMapper();
		
		String datos="";
		try {
			datos =  mapper.writeValueAsString(socios);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		
		return datos;
	}

}
