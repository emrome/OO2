package ar.edu.unlp.info.oo2.ejercicio10_administradorDeProyectos;

public class EnEvaluacion extends Etapa {

	/**
	 * En evaluación: El proyecto pasa a etapa “Confirmada”
	 */
	public void aprobarEtapa(Proyecto proyecto) {
		proyecto.setEtapa(new Confirmada());
	}

	
	/**
	 * Actualiza el margen de ganancia si se encuentra en los siguientes valores:
	 * 			Para “En evaluación” -> valores entre 11% y 15%
	 * 			Para valores fuera de los rangos permitidos no produce efecto alguno en el proyecto.
	 */
	public boolean modificarMargenGanancia(double margen) {
		return (margen>=0.11 && margen<=0.15);
	}

}
