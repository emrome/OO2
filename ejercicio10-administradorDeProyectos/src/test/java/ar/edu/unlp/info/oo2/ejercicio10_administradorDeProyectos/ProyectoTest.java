package ar.edu.unlp.info.oo2.ejercicio10_administradorDeProyectos;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProyectoTest {

	private Proyecto proyecto;
	private Proyecto precio0;
	Proyecto confirmado;
	
	@BeforeEach 
	public void setUp() throws Exception {
		proyecto = new Proyecto("Vacaciones de invierno",LocalDate.of(2023, 7, 15), LocalDate.of(2023, 7, 25), "salir con amigos", 3, 2000);
		proyecto.aprobarEtapa();
		precio0 = new Proyecto("Vacaciones de verano",LocalDate.of(2024, 1, 15), LocalDate.of(2024, 1, 25), "playita con amigos", 3, 0);
		
		confirmado = new Proyecto("Vacaciones familia",LocalDate.of(2023, 7, 15), LocalDate.of(2023, 7, 25), "Playa", 9, 1000);
		confirmado.aprobarEtapa();
		confirmado.aprobarEtapa();
	}
	
	@Test
	void testAprobarEtapa() {
		//En evaluacion pasa a confirmada
		proyecto.aprobarEtapa();
		assertTrue(proyecto.getEtapa() instanceof Confirmada);
		
		//Confirmada se mantiene en confirmada
		confirmado.aprobarEtapa();
		assertTrue(confirmado.getEtapa() instanceof Confirmada);
		
		//En construccion con precio 0 genera ERROR
		assertTrue(precio0.getEtapa() instanceof EnConstruccion);
		Exception ex = assertThrows(RuntimeException.class, () -> {precio0.aprobarEtapa();});
    	assertEquals("ERROR: No se puede aprobar el proyecto en construccion ya que su precio es $0",ex.getMessage());
	}
	
	@Test
	void testCostoProyecto() {
		assertEquals(60000, proyecto.costoProyecto());
		assertEquals(0, precio0.costoProyecto());
		assertEquals(90000, confirmado.costoProyecto());
	}
	
	@Test
	void testPrecioProyecto() {
		assertEquals(64200, proyecto.precioProyecto());
		assertEquals(0, precio0.precioProyecto());
		assertEquals(96300, confirmado.precioProyecto());
	}
	
	
	/**
	 * Para “En construcción” -> valores entre 8% y 10%
	 * Para “En evaluación” -> valores entre 11% y 15%
	 * Para valores fuera de los rangos permitidos no produce efecto alguno en el proyecto.
	 * Otra situación No produce efecto alguno en el proyecto.
	 */
	@Test
	void testModificarMargen() {
		
		//proyecto En Construccion
		precio0.modificarMargenGanancia(0.04);
		assertEquals(0.07,precio0.getMargenGanancia());
		
		precio0.modificarMargenGanancia(0.08);
		assertEquals(0.08,precio0.getMargenGanancia());
		
		precio0.modificarMargenGanancia(0.086);
		assertEquals(0.086,precio0.getMargenGanancia());
		
		precio0.modificarMargenGanancia(0.10);
		assertEquals(0.10,precio0.getMargenGanancia());
		
		precio0.modificarMargenGanancia(0.11);
		assertEquals(0.10,precio0.getMargenGanancia());
		
		//proyecto En Evaluacion
		proyecto.modificarMargenGanancia(0.09);
		assertEquals(0.07,proyecto.getMargenGanancia());
		
		proyecto.modificarMargenGanancia(0.11);
		assertEquals(0.11,proyecto.getMargenGanancia());
		
		proyecto.modificarMargenGanancia(0.13);
		assertEquals(0.13,proyecto.getMargenGanancia());
		
		proyecto.modificarMargenGanancia(0.15);
		assertEquals(0.15,proyecto.getMargenGanancia());
		
		proyecto.modificarMargenGanancia(0.20);
		assertEquals(0.15,proyecto.getMargenGanancia());
		
		//proyecto Confirmado
		confirmado.modificarMargenGanancia(0.58);
		assertEquals(0.07,confirmado.getMargenGanancia());
	}
	
	@Test
	void testCancelarProyecto() {
		proyecto.cancelarProyecto();
		assertTrue(proyecto.getObjetivo().contains("(Cancelado)"));
		
		precio0.cancelarProyecto();
		assertTrue(precio0.getObjetivo().contains("(Cancelado)"));
		
		confirmado.cancelarProyecto();
		assertTrue(confirmado.getObjetivo().contains("(Cancelado)"));
		
		confirmado.cancelarProyecto();
		assertTrue(confirmado.getObjetivo().contains("(Cancelado)"));
	}

}
