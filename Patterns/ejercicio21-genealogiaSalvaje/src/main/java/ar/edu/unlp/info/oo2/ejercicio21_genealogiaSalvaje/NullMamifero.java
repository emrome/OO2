package ar.edu.unlp.info.oo2.ejercicio21_genealogiaSalvaje;

import java.time.LocalDate;

public class NullMamifero implements Mamifero{
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return false;
	}
	
	//Setters
	public void setIdentificador(String id) {
		
	}
		
	public void setEspecie(String especie) {
		
	}
		
	public void setFechaNacimiento(LocalDate fecha) {
		
	}
	public void setMadre(Mamifero madre) {
		
	}
		
	public void setPadre(Mamifero padre) {
		
	}
		
	//Getters
	public String getIdentificador() {
		return null;
	}
		
	public String getEspecie() {
		return null;
	}
	
	public LocalDate getFechaNacimiento() {
		return null;
	}
	
	public Mamifero getMadre() {
		return null;
	}
	
	public Mamifero getPadre() {
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		return null;
	}
		
	public Mamifero getAbueloMaterno() {
		return null;
	}
	public Mamifero getAbuelaPaterna() {
		return null;
	}
	
	public Mamifero getAbueloPaterno() {
		return null;
	}
}
