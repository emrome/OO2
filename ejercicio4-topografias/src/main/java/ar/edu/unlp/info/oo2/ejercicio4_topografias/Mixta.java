package ar.edu.unlp.info.oo2.ejercicio4_topografias;

import java.util.ArrayList;

public class Mixta extends Topografia{
	
	private ArrayList<Topografia> children;
	
	public Mixta() {
		this.children = new ArrayList<Topografia>();
	}
	
	public Mixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		this.children = new ArrayList<Topografia>();
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(t4);
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
	
	public boolean esIgual(Topografia topografia) { 
		return topografia.esIgualAMixta(this);
	}

	public boolean esIgualAMixta(Mixta t) {
		return this.children.get(0).esIgual(t.getChildren().get(0)) &&
				this.children.get(1).esIgual(t.getChildren().get(1)) &&
				this.children.get(2).esIgual(t.getChildren().get(2)) &&
				this.children.get(3).esIgual(t.getChildren().get(3));
				//Mejorar esta parte
	}
	
}