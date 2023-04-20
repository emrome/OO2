package ar.edu.unlp.info.oo2.ejercicio15_estacionMeteorologica;

public class RadiacionSolar extends Decorator{

	public RadiacionSolar(Componente componente) {
		super(componente);
	}
	
	@Override
	public String displayData() {
		return super.displayData() + " Radiación Solar: " + Math.round(this.getRadiacionSolar());
	}

}
