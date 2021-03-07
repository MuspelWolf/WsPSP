package entidad;

public class Guerrero extends Personaje{
	private int fuerza;

	@Override
	public void atacar(Personaje p) {
		System.out.println("ARGG");
		int dmg = getArma().usar();
		if(getArma() instanceof Espada || getArma() instanceof Arco) {
			dmg += fuerza;
		}
		
		p.setPuntosVida(p.getPuntosVida() - dmg);
		System.out.println(this.getNombre() + 
				" Hace un da�o de: " + dmg);
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
	
}
