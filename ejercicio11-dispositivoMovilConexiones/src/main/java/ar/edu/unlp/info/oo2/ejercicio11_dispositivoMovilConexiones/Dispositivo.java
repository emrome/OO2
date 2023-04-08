package ar.edu.unlp.info.oo2.ejercicio11_dispositivoMovilConexiones;

public class Dispositivo {

	private Calculator crcCalculator;
	private Connection connection;
	private Ringer ringer;
	private Display display;
	
	public Dispositivo() {
		this.crcCalculator = new CRC16_Calculator();
		this.connection = new WifiConn();
		this.ringer = new Ringer();
		this.display = new Display();
	}
	
	public String send(String data) {
		int crc = this.getCrcCalculator().crcFor(data);
		return this.getConnection().sendData(data,crc);
	}
	
	public String conectarCon(Connection connection) {
		this.connection = connection;
		this.ringer.ring();
		return this.display.showBanner(connection.pict());
	}
	
	public void configurarCRC(Calculator calculator) {
		this.crcCalculator = calculator;
	}

	public Calculator getCrcCalculator() {
		return crcCalculator;
	}

	public Connection getConnection() {
		return connection;
	}

	public Ringer getRinger() {
		return ringer;
	}

	public Display getDisplay() {
		return display;
	}
	
	
}
