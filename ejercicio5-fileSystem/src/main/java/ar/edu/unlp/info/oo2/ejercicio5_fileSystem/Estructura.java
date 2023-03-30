package ar.edu.unlp.info.oo2.ejercicio5_fileSystem;

import java.time.LocalDate;

public abstract class Estructura {
	
	String nombre;
	LocalDate fechaCreacion;
	int tamanio;
	
	public Estructura(String nombre, LocalDate fechaCreacion, int tamanio) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.tamanio = tamanio;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public int tamanoTotalOcupado() {
		return tamanio;
	}
	
	public abstract Archivo archivoMasGrande();
	
	public abstract Archivo archivoMasNuevo();
	
}
