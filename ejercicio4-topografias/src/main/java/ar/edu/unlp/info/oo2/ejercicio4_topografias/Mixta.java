package ar.edu.unlp.info.oo2.ejercicio4_topografias;

import java.util.ArrayList;

public class Mixta extends Topografia{
	
	private ArrayList<Topografia> children;
	
	public Mixta() {
		this.children = new ArrayList<Topografia>();
	}
	
	public void add(Topografia t) {
		if (children.size() < 4) children.add(t);
	}

	
	public double getProporcionAgua() {
		return (this.children.stream().
				mapToDouble(Topografia::getProporcionAgua).
				sum()) 
				/this.children.size() ;
	}

	public ArrayList<Topografia> getChildren(){
		return this.children;
	}
	
	public boolean esIgual(Topografia topografia) { //dudas (si tengo mixta adentro tengo que chequear tambien que ellas coincidan?
		if(topografia.esMixta()) {
			return this.children.equals(topografia);
		}
		return super.esIgual(topografia);
	}
	
	public boolean esMixta() {
		return true;
	}
}