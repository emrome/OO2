/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio18_subteWay;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubteWayTest {
	
	Builder builderClasico;
	Builder builderVegano;
	Builder builderVeggie;
	Builder builderSinTacc;
	SubteWay subteway;
	Sandwich sandwich;
	
	@BeforeEach
	void setUp() throws Exception {
		subteway = new SubteWay();
	}
	
    @Test
    public void testSandwichClasico() {
    	builderClasico = new ClasicoBuilder();
    	subteway.setBuilder(builderClasico);
    	subteway.crearSandwich();
    	sandwich = subteway.getSandwich();
    	assertEquals(500, sandwich.calcularPrecio());
    }
    
    @Test
    public void testSandwichVegetariano() {
    	builderVeggie = new VeggieBuilder();
    	subteway.setBuilder(builderVeggie);
    	subteway.crearSandwich();
    	sandwich = subteway.getSandwich();
    	assertEquals(420, sandwich.calcularPrecio());
    }
    
    @Test
    public void testSandwichVegano() {
    	builderVegano = new VeganoBuilder();
    	subteway.setBuilder(builderVegano);
    	subteway.crearSandwich();
    	sandwich = subteway.getSandwich();
    	assertEquals(620, sandwich.calcularPrecio());
    }
    
    @Test
    public void testSandwichSinTacc() {
    	builderSinTacc = new SinTACCBuilder();
    	subteway.setBuilder(builderSinTacc);
    	subteway.crearSandwich();
    	sandwich = subteway.getSandwich();
    	assertEquals(618, sandwich.calcularPrecio());
    }
}
