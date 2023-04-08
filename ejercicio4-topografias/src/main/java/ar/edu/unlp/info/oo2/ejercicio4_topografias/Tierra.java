package ar.edu.unlp.info.oo2.ejercicio4_topografias;

public class Tierra extends Topografia{

	@Override
	public double getProporcionAgua() {
		return 0;
	}
	
	public boolean equalsAMixta(Mixta t) {
		return false;
	}
}
