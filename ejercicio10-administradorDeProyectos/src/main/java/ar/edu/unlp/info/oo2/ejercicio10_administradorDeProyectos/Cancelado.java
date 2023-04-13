package ar.edu.unlp.info.oo2.ejercicio10_administradorDeProyectos;

public class Cancelado extends Etapa{

	@Override
	public void aprobarEtapa(Proyecto proyecto) {
		
	}

	@Override
	public boolean modificarMargenGanancia(double margen) {
		return false;
	}

	@Override
	public String cancelarProyecto(Proyecto proyecto) {
		return proyecto.getObjetivo();
	}
	
}
