package ar.edu.unlp.info.oo2.ejercicio21_genealogiaSalvaje;

import java.time.LocalDate;

public interface Mamifero {
	public boolean tieneComoAncestroA(Mamifero unMamifero);
	
	//Setters
	public void setIdentificador(String id);
		
	public void setEspecie(String especie);
		
	public void setFechaNacimiento(LocalDate fecha);
	
	public void setMadre(Mamifero madre);
		
	public void setPadre(Mamifero padre);
		
	//Getters
	public String getIdentificador();
		
	public String getEspecie();
	
	public LocalDate getFechaNacimiento();
	
	public Mamifero getMadre();
	
	public Mamifero getPadre();
	
	public Mamifero getAbuelaMaterna();
		
	public Mamifero getAbueloMaterno();
	
	public Mamifero getAbuelaPaterna();
	
	public Mamifero getAbueloPaterno();
}
