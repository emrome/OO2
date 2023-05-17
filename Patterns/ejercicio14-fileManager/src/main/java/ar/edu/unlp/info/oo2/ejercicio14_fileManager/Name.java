package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

public class Name extends Aspect {
	
	public Name (FileOO2 component) {
		super(component);
	}
	
	public String prettyPrint() {
		return  super.prettyPrint()
				+ " " +this.getName();
	}

}
