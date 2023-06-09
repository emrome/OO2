package ar.edu.unlp.info.oo2.ejercicio18_subteWay;

public class ClasicoBuilder extends Builder {
	
	@Override
	public void agregarPan() {
		this.sandwich.agregarIngrediente("pan brioche",100);
	}

	@Override
	public void agregarAderezo() {
		this.sandwich.agregarIngrediente("aderezo a base de mayonesa",20);
	}

	@Override
	public void agregarPrincipal() {
		this.sandwich.agregarIngrediente("carne de ternera",300);
	}

	@Override
	public void agregarAdicional() {
		this.sandwich.agregarIngrediente("tomate",80);
	}
}
