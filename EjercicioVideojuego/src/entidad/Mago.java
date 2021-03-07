package entidad;

public class Mago extends Personaje{

	private int inteligencia;
	
	@Override
	public void atacar(Personaje p) {
		System.out.println("ALACAZAM!");		
		int dmg = getArma().usar();
		if(getArma() instanceof Hechizo) {
			dmg += inteligencia;
		}
		p.setPuntosVida(p.getPuntosVida() - dmg);
		System.out.println(this.getNombre() + 
				" Hace un dmg de: " + dmg);
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	
	
}
