package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

public class Size extends Aspect {
	
	public Size (FileOO2 component) {
		super(component);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() 
				+ " " + this.getSize();
	}
}
