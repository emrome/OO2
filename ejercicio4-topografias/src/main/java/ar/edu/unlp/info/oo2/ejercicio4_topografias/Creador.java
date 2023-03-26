package ar.edu.unlp.info.oo2.ejercicio4_topografias;

import java.util.ArrayList;
import java.util.List;

public class Creador {

	private List<Topografia> topografias;
	

	public Creador() {
		this.topografias = new ArrayList<Topografia>();
	}
	
	public List<Topografia> getTopografias() {
		return this.topografias;
	}

	public void addTopografia(Topografia t) {
		this.topografias.add(t);
	}

}
