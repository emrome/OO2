package ar.edu.unlp.info.oo2.ejercicio4_topografias;

public abstract class Topografia {
	
	public abstract double getProporcionAgua();
	
	public double getProporcionTierra() {
		return 1.00 - this.getProporcionAgua();
	}
	
	public boolean equals (Topografia t) {
		/* Debo redefinir method "equals(Objeto)" para que en las mixta 
		compare en cuanto a proporcion y no a tipo de elemento
		*/
		return (this.getProporcionAgua() == t.getProporcionAgua());
	}
	
	
	public abstract boolean equalsAMixta(Mixta t);
}
