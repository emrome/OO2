package ar.edu.unlp.info.oo2.ejercicio18_subteWay;

public class SubteWay {

	private Builder builder;
	
	public SubteWay() {
		
	}
	
	public SubteWay(Builder builder) {
		this.builder = builder;
	}
	
	public void crearSandwich() {
		this.builder.agregarPan();
		this.builder.agregarAderezo();
		this.builder.agregarPrincipal();
		this.builder.agregarAdicional();		
	}
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public Sandwich getSandwich() {
		return builder.getSandwich();
	}
}
