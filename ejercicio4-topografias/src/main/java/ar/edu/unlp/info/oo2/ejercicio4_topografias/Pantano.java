package ar.edu.unlp.info.oo2.ejercicio4_topografias;

public class Pantano extends Topografia{

	public double getProporcionAgua() {
		return 0.7;
	}

	public boolean equalsAMixta(Mixta t) {
		return false;
	}
}
