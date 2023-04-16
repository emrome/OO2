package ar.edu.unlp.info.oo2.ejercicio13_baseDeDatos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyTest {
    
	private DatabaseAccess database;
	private DatabaseProxy proxy;
	
    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.proxy = new DatabaseProxy(database);
    }

    @Test
    void testGetSearchResults() {
    	Exception ex = assertThrows(RuntimeException.class, () -> {this.proxy.getSearchResults("select * from comics where id=1");});
    	assertEquals("Access denied",ex.getMessage());
    	
    	proxy.authenticate();
     	assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
        
        proxy.logout();
        ex = assertThrows(RuntimeException.class, () -> {this.proxy.getSearchResults("select * from comics where id=1");});
    	assertEquals("Access denied",ex.getMessage());
    }

    @Test
    void testInsertNewRow() {
    	Exception ex = assertThrows(RuntimeException.class, () -> {this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));});
    	assertEquals("Access denied",ex.getMessage());
    	
    	proxy.authenticate();
        assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));
        
        proxy.logout();
        ex = assertThrows(RuntimeException.class, () -> {this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));});
    	assertEquals("Access denied",ex.getMessage());
    }
}
