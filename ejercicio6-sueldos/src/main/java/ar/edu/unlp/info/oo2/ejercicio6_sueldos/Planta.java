package ar.edu.unlp.info.oo2.ejercicio6_sueldos;

public class Planta extends Empleado{
	
	private int cantidadHijos;
	private boolean casado;
	private int antiguedad;
	
	public Planta(int cantidadHijos, boolean casado, int antiguedad) {
		this.cantidadHijos = cantidadHijos;
		this.casado = casado;
		this.antiguedad = antiguedad;
	}
	
	@Override
	public double sueldoBasico() {
		return 50000;
	}

	@Override
	public double adicionales() {
		double sum = (this.getAntiguedad()* 2000) + (this.getCantidadHijos()*2000);
		return this.estaCasado()? (sum + 5000) : sum;
	}
	
	private int getCantidadHijos() {
		return this.cantidadHijos;
	}

	private boolean estaCasado() {
		return this.casado;
	}

	public int getAntiguedad() {
		return this.antiguedad;
	}

}
