package ar.edu.unlp.info.oo2.ejercicio21_genealogiaSalvaje;

import java.time.LocalDate;

public class RealMamifero implements Mamifero {

	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	public RealMamifero() {
		
	}
	
	public RealMamifero(String id) {
		identificador=id;
		//aca inicializar padre y madre en null?
		madre = new NullMamifero();
		padre = new NullMamifero();
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return this.getMadre().equals(unMamifero) ||
				this.getMadre().tieneComoAncestroA(unMamifero) || 
				this.getPadre().equals(unMamifero) ||
				this.getPadre().tieneComoAncestroA(unMamifero);
				
	}
	
	//Setters
	public void setIdentificador(String id) {
		identificador=id;
	}
	
	public void setEspecie(String especie) {
		this.especie=especie;
	}
	
	public void setFechaNacimiento(LocalDate fecha) {
		fechaNacimiento=fecha;
	}
	public void setMadre(Mamifero madre) {
		this.madre=madre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre=padre;
	}
	
	//Getters
	public String getIdentificador() {
		return identificador;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	
	public Mamifero getAbuelaMaterna() {
		return madre.getMadre();
	}
	
	public Mamifero getAbueloMaterno() {
		return madre.getPadre();
	}

	public Mamifero getAbuelaPaterna() {
		return padre.getMadre();
	}
	
	public Mamifero getAbueloPaterno() {
		return padre.getPadre();
	}
}
