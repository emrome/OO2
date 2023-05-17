/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio6_sueldos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	
	Empleado temporarioSinHijos;
	Empleado temporarioSinHijosCasado;
	Empleado temporarioConHijos;
	Empleado temporarioConHijosCasado;
	
	Empleado plantaSinHijos;
	Empleado plantaSinHijosCasado;
	Empleado plantaConHijos;
	Empleado plantaConHijosCasado;
	
	Empleado pasanteSinExamen;
	Empleado pasanteConExamen;
	Empleado pasanteExamenes;
	
	@BeforeEach
	void setUp() throws Exception {
		temporarioSinHijos = new Temporario(0,false,8);
		temporarioSinHijosCasado = new Temporario(0,true,8);
		temporarioConHijos = new Temporario(1,false,0);
		temporarioConHijosCasado = new Temporario(4,true,1);
		
		plantaSinHijos = new Planta(0,false,8);
		plantaSinHijosCasado = new Planta(0,true,8);;
		plantaConHijos = new Planta(1,false,0);;
		plantaConHijosCasado = new Planta(4,true,0);;
		
		pasanteSinExamen = new Pasante(0);
		pasanteConExamen = new Pasante(1);
		pasanteExamenes = new Pasante(8);
		
	}
    @Test
    public void testSueldo() {
    	assertEquals(19488, temporarioSinHijos.sueldo());
    	assertEquals(24238, temporarioSinHijosCasado.sueldo());
    	assertEquals(19300, temporarioConHijos.sueldo());
    	assertEquals(30011, temporarioConHijosCasado.sueldo());
    	
    	assertEquals(58700, plantaSinHijos.sueldo());
    	assertEquals(63450, plantaSinHijosCasado.sueldo());
    	assertEquals(45400, plantaConHijos.sueldo());
    	assertEquals(55850, plantaConHijosCasado.sueldo());
    	
    	assertEquals(17400, pasanteSinExamen.sueldo());
    	assertEquals(19300, pasanteConExamen.sueldo());
    	assertEquals(32600, pasanteExamenes.sueldo());
        
    }
    
    @Test
    public void testDescuento() {
    	assertEquals(2912,temporarioSinHijos.descuento());
    	assertEquals(7300, plantaSinHijos.descuento());
    	assertEquals(2700,pasanteConExamen.descuento());
    }
}
