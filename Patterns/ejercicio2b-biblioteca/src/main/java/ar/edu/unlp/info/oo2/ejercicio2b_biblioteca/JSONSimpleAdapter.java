package ar.edu.unlp.info.oo2.ejercicio2b_biblioteca;

import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONSimpleAdapter implements VoorheesExporter {

	private Object crearJSON(Socio socio) {
		JSONObject json = new JSONObject();
		json.put("nombre", socio.getNombre());
		json.put("email", socio.getEmail());
		json.put("legajo", socio.getLegajo());
		return json;
	}

	@Override
	public String exportar(List<Socio> socios) {
		JSONArray listado = new JSONArray();
		socios.stream().forEach(socio -> listado.add(crearJSON(socio)));
		return listado.toJSONString();
	}

}
