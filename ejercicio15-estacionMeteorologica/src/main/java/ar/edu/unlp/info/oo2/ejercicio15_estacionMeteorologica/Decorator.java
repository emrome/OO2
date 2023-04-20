package ar.edu.unlp.info.oo2.ejercicio15_estacionMeteorologica;

public class Decorator implements Componente {
	
	Componente componente;
	
	public Decorator(Componente componente) {
		this.componente = componente;
	}

	@Override
	public double getPresion() {
		return this.componente.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		return this.componente.getRadiacionSolar();
	}

	@Override
	public double getTemperaturaCelsius() {
		return this.componente.getTemperaturaCelsius();
	}
	
	@Override
	public double getTemperaturaFahrenheit() {
		return this.componente.getTemperaturaFahrenheit();
	}
	
	@Override
	public double getPromedioCelsius() {
		return this.componente.getPromedioCelsius();
	}
	
	@Override
	public double getPromedioFahrenheit() {
		return this.componente.getPromedioFahrenheit();
	}
	
	@Override
	public String displayData() {
		return this.componente.displayData();
	}
	
	
}
