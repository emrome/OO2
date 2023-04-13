package ar.edu.unlp.info.oo2.ejercicio8_excursiones;

public class Definitiva extends State{

	@Override
	public String informacionAdicional(Excursion excursion) {
			return 	"\nEmails inscriptos: " + excursion.getEmailsInscriptos() +
					"\nActualmente faltan " + (excursion.getCupoMax()-excursion.cantidadInscriptos()) +
					" para alcanzar el cupo maximo";
	}
	

	@Override
	public void inscribir(Usuario usuario, Excursion excursion) {
		excursion.getInscriptos().add(usuario);
		if(excursion.alcanzoMax()) 
			excursion.setState(new Completa());
		
	}

}
