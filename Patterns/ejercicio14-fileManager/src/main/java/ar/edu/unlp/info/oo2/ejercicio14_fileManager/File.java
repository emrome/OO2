package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

import java.time.LocalDate;

public class File implements FileOO2{

	private String name;
	private String extension;
	private double size;
	private LocalDate createdDate;
	private LocalDate modifiedDate;
	private String permissions;
	
	public File(String name, String extension, double size, LocalDate createdDate, LocalDate modifiedDate, String permissions) {
		this.name = name;
		this.extension = extension;
		this.size = size;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.permissions = permissions;
	}

	@Override
	public String prettyPrint() {
		return "Datos del archivo:\n";
	}

	public String getName() {
		return name;
	}

	public String getExtension() {
		return extension;
	}

	public double getSize() {
		return size;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public LocalDate getModifiedDate() {
		return modifiedDate;
	}

	public String getPermissions() {
		return permissions;
	}
	
	
	

}
