package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

public class Extension extends Aspect {
	
	public Extension (FileOO2 component) {
		super(component);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() 
				+ " " + this.getExtension();
	}
}
