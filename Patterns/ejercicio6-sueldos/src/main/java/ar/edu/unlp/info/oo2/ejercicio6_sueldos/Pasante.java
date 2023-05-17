package ar.edu.unlp.info.oo2.ejercicio6_sueldos;

public class Pasante extends Empleado{
	
	private int cantidadExamenes;
	
	public Pasante(int cantidadExamenes) {
		this.cantidadExamenes = cantidadExamenes;
	}
	
	@Override
	public double sueldoBasico() {
		return 20000;
	}

	@Override
	public double adicionales() {
		return this.getCantidadExamenes() * 2000;
	}

	private int getCantidadExamenes() {
		return this.cantidadExamenes;
	}

}
