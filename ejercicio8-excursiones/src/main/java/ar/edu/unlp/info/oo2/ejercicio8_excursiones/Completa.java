package ar.edu.unlp.info.oo2.ejercicio8_excursiones;

public class Completa extends State{

	@Override
	public void inscribir(Usuario usuario, Excursion excursion) {
		excursion.getListaDeEspera().add(usuario);
	}

}
