package ar.edu.unlp.info.oo2.ejercicio11_dispositivoMovilConexiones;

public class Connection4G {
	
	private String symb;
	
	public Connection4G() {
		this.symb = "Conectado por 4g";
	}
	
	public String transmit(String data, int crc) {
		return data + " " + crc;
	}
	
	public String getSymb() {
		return this.symb;
	}
	
}
