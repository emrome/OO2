package ar.edu.unlp.info.oo2.ejercicio11_dispositivoMovilConexiones;

import java.util.zip.CRC32;

public class CRC32_Calculator implements Calculator {

	@Override
	public int crcFor(String data) {
		CRC32 crc = new CRC32();
		crc.update(data.getBytes());
		Long result = crc.getValue();
		return result.intValue();
	}

}
