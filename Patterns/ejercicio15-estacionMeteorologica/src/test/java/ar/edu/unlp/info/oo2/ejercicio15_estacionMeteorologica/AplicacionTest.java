package ar.edu.unlp.info.oo2.ejercicio15_estacionMeteorologica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AplicacionTest {
	
	Componente aplicacion;
	Componente presion;
	Componente radiacion;
	Componente celsius;
	Componente fahrenheit;
	Componente promC;
	Componente promF;
	
	@BeforeEach
	void setUp() {
		HomeWeatherStation station = new HomeWeatherStation();
		aplicacion = new Aplicacion(station);
	}
	
	/*
	 * temperatura = 40;
	 * radiacionSolar = 500;
	 * presion = 1008;
	 * temperaturas1 = 40;		
	 * temperaturas2 = 20);
	 * temperaturas3 = 10);
	 */
	
	@Test
    public void testDisplayData() {
    	//Información: Presion - Radiacion Solar - PromedioC
		presion = new Presion(aplicacion);
		radiacion = new RadiacionSolar(presion);
		promC = new PromedioCelsius(radiacion);
    	
        assertEquals("Información:/n Presión atmosférica: 1008 Radiación Solar: 500 Promedio de temperaturas C: -5", promC.displayData());
	}
	
	@Test
    public void testDisplayData2() {
    	//Información: TemperaturaC - TemperaturaF - PromedioF
		celsius = new TemperaturaCelsius(aplicacion);
		fahrenheit = new TemperaturaFahrenheit(celsius);
		promF = new PromedioFahrenheit(fahrenheit);
    	
		assertEquals("Información:/n Temperatura C: 4.0 Temperatura F: 40.0 Promedio de temperaturas F: 23", promF.displayData());
	}

}
