package ar.edu.unlp.info.oo2.ejercicio18_subteWay;

public class VeggieBuilder extends Builder{

	@Override
	public void agregarPan() {
		this.sandwich.agregarIngrediente("pan con semillas",120);
	}

	@Override
	public void agregarAderezo() {
	}

	@Override
	public void agregarPrincipal() {
		this.sandwich.agregarIngrediente("provoleta grillada",200);
	}

	@Override
	public void agregarAdicional() {
		this.sandwich.agregarIngrediente("berenjenas al escabeche",100);
	}
}
