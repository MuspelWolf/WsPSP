package entidad;

import utils.Aleatorio;

public class Espada extends Arma {

	@Override
	public int usar() {
		int dmg = Aleatorio.calcularNumero(getDmgMinimo(), getDmgMaximo());
		return dmg;
	}

}
