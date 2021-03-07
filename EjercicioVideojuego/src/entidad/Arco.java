package entidad;

import utils.Aleatorio;

public class Arco extends Arma{

	@Override
	public int usar() {
		// TODO Auto-generated method stub
		int dmg = Aleatorio.calcularNumero(getDmgMinimo(), getDmgMaximo());
		return dmg;
	}

}
