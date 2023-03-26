package ar.edu.unlp.info.oo2.ejercicio4_topografias;

import java.util.ArrayList;

public class Mixta implements Topografia{
	
	private ArrayList<Topografia> children;
	
	public Mixta() {
		this.children = new ArrayList<Topografia>();
	}
	
	public void add(Topografia t) {
		if (children.size() < 4) children.add(t);
	}

	
	public double getProporcion() {
		return (this.children.stream().
				mapToDouble(Topografia::getProporcion).
				sum()) 
				/4 ;
	}

	public ArrayList<Topografia> getChildren(){
		return this.children;
	}
	
	public boolean esIgual(Topografia topografia) {
		if(topografia.esMixta()) {
			this.children.equals(topografia);
		}
		return topografia.getProporcion() == this.getProporcion();
	}
	
	public boolean esMixta() {
		return true;
	}
}