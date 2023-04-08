package ar.edu.unlp.info.oo2.ejercicio10_administradorDeProyectos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private int cantIntegrantes;
	private double margenGanancia;
	private double montoPagoPorDia;
	private Etapa etapa;
	
	public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo, int cantIntegrantes,
			double montoPagoPorDia) {
		this.nombre =  nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.cantIntegrantes = cantIntegrantes;
		this.margenGanancia = 0.07;
		this.montoPagoPorDia = montoPagoPorDia;
		this.etapa = new EnConstruccion();
	}
	
	/**
	 * Aprobar etapa
	 * 
	 * En construcción: El proyecto pasa a etapa “En evaluación“ siempre y cuando su precio no sea 0 (cero). 
	 *				    De lo contrario genera un error.
	 * En evaluación: El proyecto pasa a etapa “Confirmada”
	 * En otra situación: No produce efecto alguno en el proyecto.
	 */
	public void aprobarEtapa() {
		this.getEtapa().aprobarEtapa(this);
	}
	
	
	/**
	 * Costo del proyecto
	 * 
	 * En cualquier etapa
	 * Retorna la suma de los costos de las personas involucradas. 
	 * Considerar que las personas trabajan todos los días que dura el proyecto.
	 */
	public double costoProyecto() {
		return this.getMontoPagoPorDia() 
				* ChronoUnit.DAYS.between(this.getFechaInicio(),this.getFechaFin())
				* this.getCantIntegrantes();
	}
	
	
	/**
	 * Precio del proyecto
	 * 
	 * En cualquier etapa
	 * Retorna el valor obtenido luego de aplicar el margen de ganancia al costo del proyecto.
	 */
	public double precioProyecto() {
		return this.costoProyecto() + (this.costoProyecto() * this.getMargenGanancia()) ;
	}
	
	
	/**
	 * Modificar margen de ganancia
	 * 
	 * En etapas “En construcción” y “En evaluación”:Actualiza el margen de ganancia si se encuentra en los siguientes valores:
	 * 			Para “En construcción” -> valores entre 8% y 10%
	 * 			Para “En evaluación” -> valores entre 11% y 15%
	 * 			Para valores fuera de los rangos permitidos no produce efecto alguno en el proyecto.
	 * Otra situación: No produce efecto alguno en el proyecto.
	 */
	public void modificarMargenGanancia(double margen) {
		if(this.getEtapa().modificarMargenGanancia(margen))
			this.margenGanancia = margen;
	}
	
	/** 
	 * Cancelar Proyecto
	 * 
	 * En cualquier etapa: Agrega “(Cancelado) ” al objetivo del proyecto. Deja el proyecto cancelado.
	 * Si ya está Cancelado: No produce efecto alguno en el proyecto. 
	 */
	public void cancelarProyecto() {
		if(!this.getObjetivo().contains("(Cancelado)"))
			this.objetivo += "(Cancelado)";
	}
	
	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}
	
	public Etapa getEtapa() {
		return this.etapa;
	}
	
	public int getCantIntegrantes() {
		return this.cantIntegrantes;
	}
	
	public double getMontoPagoPorDia() {
		return this.montoPagoPorDia;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public double getMargenGanancia() {
		return margenGanancia;
	}

	public String getNombre() {
		return nombre;
	}
	
}