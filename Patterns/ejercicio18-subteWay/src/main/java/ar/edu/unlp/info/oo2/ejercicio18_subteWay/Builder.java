package ar.edu.unlp.info.oo2.ejercicio18_subteWay;

public abstract class Builder {
	
	protected Sandwich sandwich;
	
	public Builder() {
		this.sandwich = new Sandwich();
	}
	
	public Sandwich getSandwich() {
		Sandwich aux = sandwich;
		this.sandwich = new Sandwich();
		return aux;
	}
	
	public abstract void agregarPan();
	public abstract void agregarAderezo();
	public abstract void agregarPrincipal();
	public abstract void agregarAdicional();

}
