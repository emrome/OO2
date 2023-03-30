package ar.edu.unlp.info.oo2.ejercicio5_fileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio extends Estructura {
	
	private List<Estructura> contenido;
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion, 32);
		contenido = new ArrayList<Estructura>();
	}
	
	public int tamanoTotalOcupado() {
		return super.tamanoTotalOcupado() +
				this.contenido.stream().mapToInt(Estructura::tamanoTotalOcupado).sum();
	}
	
	public Archivo archivoMasNuevo() {
		return this.contenido.stream().
				map(Estructura::archivoMasNuevo).
				max(Comparator.comparing(Estructura::getFechaCreacion)).
				orElse(null);
		 		/* Faltaria revertir el orden
		 		 * sorted((a1,a2)-> a1.getFechaCreacion().compareTo(a2.getFechaCreacion())).
				findFirst().orElse(null);
		 		 */
		
	}
	
	public Archivo archivoMasGrande() {
		return this.contenido.stream().
				map(Estructura::archivoMasGrande).
				max(Comparator.comparing(Estructura::tamanoTotalOcupado)).
				orElse(null);
	}
	
	public void agregar(Estructura estructura) {
		this.contenido.add(estructura);
	}
	
	public void eliminar(Estructura estructura) {
		this.contenido.remove(estructura);
	}
	
	
	public boolean esArchivo() {
		return false;
	}
}
