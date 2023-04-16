package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

public class ModifiedDate extends Aspect {
	
	public ModifiedDate (FileOO2 component) {
		super(component);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() 
				+ " " + this.getModifiedDate();
	}

}
