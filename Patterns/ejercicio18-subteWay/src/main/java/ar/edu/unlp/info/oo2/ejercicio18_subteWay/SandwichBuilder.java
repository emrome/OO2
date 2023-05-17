package ar.edu.unlp.info.oo2.ejercicio18_subteWay;

public class SandwichBuilder implements Builder{
	
	private Sandwich product;
	
	public SandwichBuilder() {
		//this.product = new Sandwich();
	}

	@Override
	public void crearSandwich() {
		this.product = new Sandwich();
	}

	@Override
	public void agregarPan(double pan) {
		this.product.setPan(pan);
	}

	@Override
	public void agregarAderezo(double aderezo) {
		this.product.setAderezo(aderezo);
	}

	@Override
	public void agregarPrincipal(double principal) {
		this.product.setPrincipal(principal);
	}

	@Override
	public void agregarAdicional(double adicional) {
		this.product.setAdicional(adicional);
	}
	
	public Sandwich obtenerSandwich() {
		return this.product;
	}
}
