package ar.edu.unlp.info.oo2.ejercicio4_topografias;

public abstract class Topografia {
	
	public abstract double getProporcionAgua();
	
	public double getProporcionTierra() {
		return 1.00 - this.getProporcionAgua();
	}
	
	public boolean esIgual (Topografia t) {
		return (this.getProporcionAgua() == t.getProporcionAgua());
	}
	
	
	public abstract boolean esIgualAMixta(Mixta t);
}
