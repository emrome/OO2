package ar.edu.unlp.info.oo2.ejercicio8_excursiones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {

	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoDeEncuentro;
	private double costo;
	private int cupoMax;
	private int cupoMin;
	private List<Usuario> inscriptos;
	private List<Usuario> listaDeEspera;
	private State estado;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoDeEncuentro, double costo,
			int cupoMax, int cupoMin) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.costo = costo;
		this.cupoMax = cupoMax;
		this.cupoMin = cupoMin;
		this.inscriptos = new ArrayList<Usuario>();
		this.listaDeEspera = new ArrayList<Usuario>();
		this.estado = new Provisoria();
	}
	
	public void inscribir(Usuario usuario) {
		this.getState().inscribir(usuario, this);	
	}
	
	public String informacion() {
		return this.getState().informacion(this);
	}
	
	public boolean alcanzoMin() {
		return this.getInscriptos().size() == this.getCupoMin();
	}
	
	public boolean alcanzoMax() {
		return this.getInscriptos().size() == this.getCupoMax();
	}
	
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getPuntoDeEncuentro() {
		return puntoDeEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMax() {
		return cupoMax;
	}

	public int getCupoMin() {
		return cupoMin;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}
	
	public int cantidadInscriptos() {
		return this.getInscriptos().size();
	}
	
	public String getEmailsInscriptos() {
		return this.getInscriptos().stream()
				.map(Usuario::getEmail)
				.collect(Collectors.joining(", \n"));
	}
	public List<Usuario> getListaDeEspera() {
		return listaDeEspera;
	}
	
	public State getState() {
		return this.estado;
	}
	
	public void setState(State state) {
		this.estado = state;
	}
	
}
