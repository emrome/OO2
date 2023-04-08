package ar.edu.unlp.info.oo2.ejercicio4_topografias;

public class Agua extends Topografia{
	
	@Override
	public double getProporcionAgua() {
		return 1;
	}
	
	public boolean equalsAMixta(Mixta t) {
		return false;
	}
}
