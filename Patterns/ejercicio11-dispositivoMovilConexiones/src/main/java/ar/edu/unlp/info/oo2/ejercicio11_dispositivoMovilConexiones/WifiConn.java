package ar.edu.unlp.info.oo2.ejercicio11_dispositivoMovilConexiones;

public class WifiConn implements Connection{
	
	private String pict;
	
	public WifiConn() {
		this.pict = "Wifi Connection";
	}
	
	@Override
	public String sendData(String data, int crc) {
		return data + " " + crc;
	}

	@Override
	public String pict() {
		return this.pict;
	}

}
