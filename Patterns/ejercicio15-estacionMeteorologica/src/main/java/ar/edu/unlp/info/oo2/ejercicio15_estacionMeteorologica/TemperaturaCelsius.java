package ar.edu.unlp.info.oo2.ejercicio15_estacionMeteorologica;

public class TemperaturaCelsius extends Decorator{

	public TemperaturaCelsius(Componente componente) {
		super(componente);
	}
	
	@Override
	public String displayData() {
		return super.displayData() + " Temperatura C: " + this.getTemperaturaCelsius();
	}

}
