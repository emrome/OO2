package ar.edu.unlp.info.oo2.ejercicio15_estacionMeteorologica;

public class Presion extends Decorator{

	public Presion(Componente componente) {
		super(componente);
	}
	
	@Override
	public String displayData() {
		return super.displayData() + " Presión atmosférica: " + Math.round(this.getPresion());
	}

}
