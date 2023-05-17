package ar.edu.unlp.info.oo2.ejercicio15_estacionMeteorologica;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation {
	
	private double temperatura = 40;
	private double radiacionSolar = 500;
	private double presion = 1008;
	private List<Double> temperaturas;
	
	public HomeWeatherStation() {
		temperaturas = new ArrayList<Double>();
		temperaturas.add((double) 40);
		temperaturas.add((double) 20);
		temperaturas.add((double) 10);
	}
		
	//retorna la temperatura en grados Fahrenheit
	public double getTemperaturaFahrenheit() {
		return temperatura;
	}

	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return presion;
	}

	//retorna la radiación solar
	public double getRadiacionSolar() {
		return radiacionSolar;
	}

	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturasFahrenheit(){
		return this.temperaturas;
	}
	

}
