package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

import java.time.LocalDate;

public abstract class Aspect implements FileOO2{
	
	private FileOO2 component;
	
	public Aspect(FileOO2 component) {
		this.component = component;
	}
	
	@Override
	public String prettyPrint() {
		return this.component.prettyPrint();
	}
	
	public String getName() {
		return this.component.getName();
	}

	public String getExtension() {
		return this.component.getExtension();
	}

	public double getSize() {
		return this.component.getSize();
	}

	public LocalDate getCreatedDate() {
		return this.component.getCreatedDate();
	}

	public LocalDate getModifiedDate() {
		return this.component.getModifiedDate();
	}

	public String getPermissions() {
		return this.component.getPermissions();
	}

}
