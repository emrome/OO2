package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

public class CreatedDate extends Aspect {
	
	public CreatedDate (FileOO2 component) {
		super(component);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() 
				+ " " + this.getCreatedDate();
	}
	
}
