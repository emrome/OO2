package ar.edu.unlp.info.oo2.ejercicio15_estacionMeteorologica;

public class TemperaturaFahrenheit extends Decorator {
	
	public TemperaturaFahrenheit(Componente componente) {
		super(componente);
	}
	
	@Override
	public String displayData() {
		return super.displayData() + " Temperatura F: " + this.getTemperaturaFahrenheit();
	}

}
