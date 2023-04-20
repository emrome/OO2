package ar.edu.unlp.info.oo2.ejercicio15_estacionMeteorologica;

public class PromedioCelsius extends Decorator{

	public PromedioCelsius(Componente componente) {
		super(componente);
	}
	
	@Override
	public String displayData() {
		return super.displayData() + " Promedio de temperaturas C: " + Math.round(this.getPromedioCelsius());
	}

}
