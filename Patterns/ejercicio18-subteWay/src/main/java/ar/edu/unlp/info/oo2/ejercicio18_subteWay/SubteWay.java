package ar.edu.unlp.info.oo2.ejercicio18_subteWay;

public class SubteWay {

	private Builder builder;
	

	public SubteWay(Builder builder) {
		this.builder = builder;
	}
	
	public void sandwichClasico() {
		builder.crearSandwich();
		this.builder.agregarPan(100);
		this.builder.agregarAderezo(20);
		this.builder.agregarPrincipal(300);
		this.builder.agregarAdicional(80);		
	}
	
	public void sandwichVegetariano() {
		builder.crearSandwich();
		this.builder.agregarPan(120);
		this.builder.agregarPrincipal(200);
		this.builder.agregarAdicional(100);	
	}

	public void sandwichVegano() {
		builder.crearSandwich();
		this.builder.agregarPan(100);
		this.builder.agregarAderezo(20);
		this.builder.agregarPrincipal(500);
	}

	public void sandwichSinTacc() {
		builder.crearSandwich();
		this.builder.agregarPan(150);
		this.builder.agregarAderezo(18);
		this.builder.agregarPrincipal(250);
		this.builder.agregarAdicional(200);	
	}
}
