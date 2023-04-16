/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOO2Test {
	
	FileOO2 file;
	FileOO2 extension;
	FileOO2 createdDate;
	FileOO2 name;
	FileOO2 permissions;
	FileOO2 size;
	
	@BeforeEach
	void setUp() throws Exception {
		file = new File("Clase 4 - Wrappers", ".pdf", 4.13, LocalDate.of(2023, 4, 3), LocalDate.of(2023, 4, 6), "rwxr-xr-x");
	}
	
    @Test
    public void testPrettyPrint() {
    	// createdDate - name - permissions
    	createdDate = new CreatedDate(file);
    	name = new Name(createdDate);
    	permissions = new Permissions(name);
    	
        assertEquals("Datos del archivo:\n 2023-04-03 Clase 4 - Wrappers rwxr-xr-x", permissions.prettyPrint());
        
    }
    
    @Test
    public void testPrettyPrint2() {
    	//extension- createdDate - name - size
    	extension = new Extension(file);
    	createdDate = new CreatedDate(extension);
    	name = new Name(createdDate);
    	size = new Size(name);
    	assertEquals("Datos del archivo:\n .pdf 2023-04-03 Clase 4 - Wrappers 4.13", size.prettyPrint());
        
    }
}
