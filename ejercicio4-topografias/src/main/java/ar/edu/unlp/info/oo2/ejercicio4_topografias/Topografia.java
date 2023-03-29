package ar.edu.unlp.info.oo2.ejercicio4_topografias;

public abstract class Topografia {
	
	public abstract double getProporcionAgua();
	
	public double getProporcionTierra() {
		return 1 - this.getProporcionAgua();
	}
	
	public boolean esIgual (Topografia t) {
		return (this.getProporcionAgua() == t.getProporcionAgua());
	}
	
	public boolean esMixta() {
		return false;
	}
}
