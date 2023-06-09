package ar.edu.unlp.info.oo2.ejercicio5_fileSystem;

import java.time.LocalDate;

public class Archivo extends Estructura{

	public Archivo(String nombre, LocalDate fechaCreacion, int tamanio) {
		super(nombre, fechaCreacion, tamanio);
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

}
