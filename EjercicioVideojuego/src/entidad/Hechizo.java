package entidad;

import utils.Aleatorio;

public class Hechizo extends Arma{

	@Override
	public int usar() {		
		// TODO Auto-generated method stub
		int dmg = Aleatorio.calcularNumero(getDmgMinimo(),getDmgMaximo());
		int magiaCaos = Aleatorio.calcularNumero(1, 100);
		if(magiaCaos <= 25) {
			System.out.println("MAGIA DEL CAOS!!!!");
			dmg *= 2;
		}
		return dmg;
	}

}
