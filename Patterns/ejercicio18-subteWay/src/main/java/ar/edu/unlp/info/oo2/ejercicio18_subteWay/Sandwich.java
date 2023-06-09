package ar.edu.unlp.info.oo2.ejercicio18_subteWay;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
	
	private List<Ingrediente> ingredientes;
	
	public Sandwich() {
		this.ingredientes = new ArrayList<Ingrediente>();
	}
	
	public void agregarIngrediente(String nombre, double precio) {
		this.ingredientes.add(new Ingrediente(nombre, precio));
	}
	
	public List<Ingrediente> getIngredientes(){
		return this.ingredientes;
	}
	public double calcularPrecio() {
		return this.ingredientes.stream().mapToDouble(Ingrediente::getPrecio).sum();
	}
	
}
