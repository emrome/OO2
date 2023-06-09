package ar.edu.unlp.info.oo2.ejercicio18_subteWay;

public class SinTACCBuilder extends Builder{
	
	@Override
	public void agregarPan() {
		this.sandwich.agregarIngrediente("pan de chipá",150);
	}

	@Override
	public void agregarAderezo() {
		this.sandwich.agregarIngrediente("salsa tártara",18);
	}

	@Override
	public void agregarPrincipal() {
		this.sandwich.agregarIngrediente("carne de pollo",250);
	}

	@Override
	public void agregarAdicional() {
		this.sandwich.agregarIngrediente("verduras grilladas",200);
	}
}
