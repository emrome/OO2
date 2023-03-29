package ar.edu.unlp.info.oo2.ejercicio5_fileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		return this.archivos().stream().
				max(Comparator.comparing(Archivo::getFechaCreacion)).
				orElse(null);
		 		/* Faltaria revertir el orden
		 		 * sorted((a1,a2)-> a1.getFechaCreacion().compareTo(a2.getFechaCreacion())).
				findFirst().orElse(null);
		 		 */
		
	}
	
	public Archivo archivoMasGrande() {
		return this.archivos().stream().
				max(Comparator.comparing(Archivo:: tamanoTotalOcupado)).
				orElse(null);
	}
	
	public void agregar(Estructura estructura) {
		this.contenido.add(estructura);
	}
	
	public void eliminar(Estructura estructura) {
		this.contenido.remove(estructura);
	}
	
	private List<Archivo> archivos(){
		
		List<Archivo> list1 = this.contenido.stream().filter(Estructura::esArchivo).
							map(e -> (Archivo) e).	
							collect(Collectors.toList());
		
		List<Archivo> list2 =  this.contenido.stream().filter(e->!e.esArchivo()).
				map(e -> ((Directorio) e).archivos()).
				flatMap(List::stream)
				.collect(Collectors.toList());
		
		return Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
	}
	
	public boolean esArchivo() {
		return false;
	}
}
