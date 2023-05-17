package ar.edu.unlp.info.oo2.ejercicio19_personajes;

public class Espada implements Arma{

	@Override
	public int calcularDaño(Armadura armadura) {
		return armadura.recibirDañoEspada();
	}

}
