package ar.edu.unlp.info.oo2.ejercicio19_personajes;

public class Arco implements Arma{

	@Override
	public int calcularDaño(Armadura armadura) {
		return armadura.recibirDañoArco();
	}

}
