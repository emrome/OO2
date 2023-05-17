package ar.edu.unlp.info.oo2.ejercicio6_sueldos;

public abstract class Empleado {
	
	public double sueldo() {
		return this.sueldoBasico() +
				this.adicionales() - 
				this.descuento();
	}

	public abstract double sueldoBasico();

	public abstract double adicionales();
	
	public double descuento() {
		return (this.sueldoBasico()* 0.13 + this.adicionales() * 0.05);
	}

}
