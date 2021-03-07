package entidad;

import utils.Aleatorio;

public class Rezo extends Arma{
	
	@Override
	public int usar() {
		int dmg = Aleatorio.calcularNumero(getDmgMinimo(), getDmgMaximo());
		int padreNuestro = Aleatorio.calcularNumero(1, 100);
		if(padreNuestro <= 50) {
			System.out.println("SANA POR DIOS...!!!!");
			int curacion = dmg / 2;
			System.out.println(getPersonaje().getNombre() + " curo " + curacion);
			int puntosVidaActuales = this.getPersonaje().getPuntosVida();
			this.getPersonaje().setPuntosVida(puntosVidaActuales + curacion); 
		}
		return dmg;
	}

}
