package ar.edu.unlp.info.oo2.ejercicio15_estacionMeteorologica;

import java.util.List;

public class Aplicacion implements Componente{
	//Es como un adapter, pero agrega cosas
	private HomeWeatherStation station;
	
	public Aplicacion(HomeWeatherStation station) {
		this.station = station;
	}
	
	@Override
	public double getTemperaturaCelsius() {
		return Math.round(convertirCelsius(station.getTemperaturaFahrenheit()));
	}

	@Override
	public double getPromedioCelsius() {
		return Math.round(convertirCelsius(this.getPromedioFahrenheit()));
	}
	
	@Override
	public double getPromedioFahrenheit() {
		List<Double> temperaturas = station.getTemperaturasFahrenheit();
		return temperaturas.stream()
				.mapToDouble(Double::doubleValue)
				.sum() / temperaturas.size() ;
	}
	
	@Override
	public String displayData() {
		return "Información:/n";
	}

	private double convertirCelsius(double temperatura) {
		return (temperatura - 32) / 1.8;
	}


	@Override
	public double getPresion() {
		return station.getPresion();
	}


	@Override
	public double getRadiacionSolar() {
		return station.getRadiacionSolar();
	}


	@Override
	public double getTemperaturaFahrenheit() {
		return station.getTemperaturaFahrenheit();
	}

}
