package ar.edu.unlp.info.oo2.ejercicio11_dispositivoMovilConexiones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DispositivoTest {
	
	private Dispositivo dispositivo;
	
	@BeforeEach
	void setUp () throws Exception{
		dispositivo = new Dispositivo();
	}
	
	@Test
	void testSend() {
		Dispositivo dispositivo4g16 = new Dispositivo();
		dispositivo4g16.conectarCon(new Adapter4G());
		
		Dispositivo dispositivo4g32 = new Dispositivo();
		dispositivo4g32.conectarCon(new Adapter4G());
		dispositivo4g32.configurarCRC(new CRC32_Calculator());
		
		Dispositivo dispositivoWifi32 = new Dispositivo();
		dispositivoWifi32.configurarCRC(new CRC32_Calculator());
		
		assertEquals("Hola 59909",dispositivo.send("Hola")); //CRC 16, WIFI
		assertEquals("Hola 59909",dispositivo4g16.send("Hola")); //CRC 16, 4G
		
		assertEquals("Hola -812493130",dispositivo4g32.send("Hola")); //CRC 32, 4G
		assertEquals("Hola -812493130",dispositivoWifi32.send("Hola")); //CRC 32, WIFI
	}
	
	@Test
	void testConectarCon() {
		assertEquals("Muestra en pantalla el símbolo: Conectado por 4g",dispositivo.conectarCon(new Adapter4G()));
		assertEquals("Muestra en pantalla el símbolo: Wifi Connection",dispositivo.conectarCon(new WifiConn()));
		
		/*
		 * dispositivo.configurarConnection(new Adapter4G());
		 * assertTrue(dispositivo.getConnection() instanceof Adapter4G);
		 * 
		 * dispositivo.configurarConnection(new WifiConn());
		 * assertTrue(dispositivo.getConnection() instanceof WifiConn);
		 */
	}
	
	@Test
	void testConfigurarCRC() {
		dispositivo.configurarCRC(new CRC16_Calculator());
		assertTrue(dispositivo.getCrcCalculator() instanceof CRC16_Calculator);
		
		dispositivo.configurarCRC(new CRC32_Calculator());
		assertTrue(dispositivo.getCrcCalculator() instanceof CRC32_Calculator);
	}

}
