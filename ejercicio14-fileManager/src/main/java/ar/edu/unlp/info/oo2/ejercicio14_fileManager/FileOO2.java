package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

import java.time.LocalDate;

public interface FileOO2 {
	
	String prettyPrint();
	String getName();
	String getExtension();
	double getSize();
	LocalDate getCreatedDate();
	LocalDate getModifiedDate();
	String getPermissions();
}
