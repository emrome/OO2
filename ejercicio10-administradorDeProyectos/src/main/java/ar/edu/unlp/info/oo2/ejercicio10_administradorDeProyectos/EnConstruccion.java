package ar.edu.unlp.info.oo2.ejercicio10_administradorDeProyectos;

public class EnConstruccion extends Etapa {


	/**
	 * En construcción: El proyecto pasa a etapa “En evaluación“ siempre y cuando su precio no sea 0 (cero). 
	 *				    De lo contrario genera un error.
	 */
	public void aprobarEtapa(Proyecto proyecto) {
		if(proyecto.precioProyecto()>0) 
			proyecto.setEtapa(new EnEvaluacion());
		else
			throw new RuntimeException("ERROR: No se puede aprobar el proyecto en construccion ya que su precio es $0");
	}

	/**
	 * Actualiza el margen de ganancia si se encuentra en los siguientes valores:
	 * 			Para “En construcción” -> valores entre 8% y 10%
	 * 			Para valores fuera de los rangos permitidos no produce efecto alguno en el proyecto.
	 */
	public boolean modificarMargenGanancia(double margen) {
		return (margen>=0.08 && margen<=0.1);
	}

}
