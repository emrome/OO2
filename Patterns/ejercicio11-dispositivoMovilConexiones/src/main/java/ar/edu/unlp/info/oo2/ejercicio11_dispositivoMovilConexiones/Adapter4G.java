package ar.edu.unlp.info.oo2.ejercicio11_dispositivoMovilConexiones;

public class Adapter4G implements Connection{
	
	Connection4G adaptee = new Connection4G();
	
	@Override
	public String sendData(String data, int crc) {
		return adaptee.transmit(data, crc);
	}

	@Override
	public String pict() {
		return adaptee.getSymb();
	}
	

}
