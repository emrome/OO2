package ar.edu.unlp.info.oo2.ejercicio10_administradorDeProyectos;

public abstract class Etapa {
	
	public abstract void aprobarEtapa(Proyecto proyecto);
	public abstract boolean modificarMargenGanancia(double margen);
	
	public String cancelarProyecto(Proyecto proyecto) {
		return proyecto.getObjetivo() + "(Cancelado)";
	}

}
