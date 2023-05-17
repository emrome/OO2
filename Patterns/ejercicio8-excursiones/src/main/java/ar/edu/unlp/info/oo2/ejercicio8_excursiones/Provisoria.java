package ar.edu.unlp.info.oo2.ejercicio8_excursiones;

public class Provisoria extends State{
	
	@Override
	public String informacionAdicional(Excursion excursion) { 
		return "\nActualmente faltan " + (excursion.getCupoMin()-excursion.cantidadInscriptos()) +
				" para alcanzar el cupo minimo";
	}

	@Override
	public void inscribir(Usuario usuario, Excursion excursion) {
		excursion.getInscriptos().add(usuario);
		if(excursion.alcanzoMin()) 
			excursion.setState(new Definitiva());
	}

}
