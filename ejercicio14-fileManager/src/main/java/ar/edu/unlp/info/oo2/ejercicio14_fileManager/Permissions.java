package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

public class Permissions extends Aspect {
	
	public Permissions (FileOO2 component) {
		super(component);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() 
				+ " " + this.getPermissions();
	}
	
}
