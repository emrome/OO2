package ar.edu.unlp.info.oo2.ejercicio15_estacionMeteorologica;

public class PromedioFahrenheit extends Decorator{

	public PromedioFahrenheit(Componente componente) {
		super(componente);
	}
	
	@Override
	public String displayData() {
		return super.displayData() + " Promedio de temperaturas F: " + Math.round(this.getPromedioFahrenheit());
	}

}
