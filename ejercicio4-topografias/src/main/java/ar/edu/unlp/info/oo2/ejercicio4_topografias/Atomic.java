package ar.edu.unlp.info.oo2.ejercicio4_topografias;

public abstract class Atomic implements Topografia{

	@Override
	public boolean esIgual(Topografia t) {
		return this.getProporcion() == t.getProporcion();
	}
	
	public boolean esMixta() {
		return false;
	}
}
