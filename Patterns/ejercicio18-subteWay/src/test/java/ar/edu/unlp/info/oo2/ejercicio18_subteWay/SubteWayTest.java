/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio18_subteWay;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubteWayTest {
	
	SandwichBuilder builder;
	SubteWay subteway;
	Sandwich sandwich;
	
	@BeforeEach
	void setUp() throws Exception {
		builder = new SandwichBuilder();
		subteway = new SubteWay(builder);
	}
	
    @Test
    public void testSandwichClasico() {
    	subteway.sandwichClasico();
    	sandwich = builder.obtenerSandwich();
    	assertEquals(500, sandwich.calcularPrecio());
    }
    
    @Test
    public void testSandwichVegetariano() {
    	subteway.sandwichVegetariano();
    	sandwich = builder.obtenerSandwich();
    	assertEquals(420, sandwich.calcularPrecio());
    }
    
    @Test
    public void testSandwichVegano() {
    	subteway.sandwichVegano();
    	sandwich = builder.obtenerSandwich();
    	assertEquals(620, sandwich.calcularPrecio());
    }
    
    @Test
    public void testSandwichSinTacc() {
    	subteway.sandwichSinTacc();
    	sandwich = builder.obtenerSandwich();
    	assertEquals(618, sandwich.calcularPrecio());
    }
}
