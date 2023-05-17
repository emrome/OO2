package ar.edu.unlp.info.oo2.ejercicio6_sueldos;

public class Temporario extends Empleado{
	
	private int cantidadHijos;
	private boolean casado;
	private int horasTrabajadas;
	
	public Temporario(int cantidadHijos, boolean casado, int horasTrabajadas) {
		this.cantidadHijos = cantidadHijos;
		this.casado = casado;
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double sueldoBasico() {
		return 20000 + (this.getHoras() * 300);
	}

	@Override
	public double adicionales() {
		double sum = 2000 * this.getCantidadHijos();
		//return condition ? value1 : value2;
		return this.estaCasado()? (sum + 5000) : sum;
	}
	
	private int getCantidadHijos() {
		return this.cantidadHijos;
	}

	public int getHoras() {
		return this.horasTrabajadas;
	}
	
	public boolean estaCasado() {
		return this.casado;
	}

}
