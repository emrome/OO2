package ar.edu.unlp.info.oo2.ejercicio18_subteWay;

public class VeganoBuilder extends Builder{

	@Override
	public void agregarPan() {
		this.sandwich.agregarIngrediente("pan integral",100);
	}

	@Override
	public void agregarAderezo() {
		this.sandwich.agregarIngrediente("salsa criolla",20);
	}

	@Override
	public void agregarPrincipal() {
		this.sandwich.agregarIngrediente("milanesa de girgolas",500);
	}

	@Override
	public void agregarAdicional() {
	}
}
