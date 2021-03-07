package entidad;

public class Curandero extends Personaje{
	private int sabiduria;
	
	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	@Override
	public void atacar(Personaje p) {
		System.out.println("AVE MARIA PURISIMA!");
		int dmg = getArma().usar();
		if(getArma() instanceof Rezo){
			dmg += sabiduria;
		}
		p.setPuntosVida(p.getPuntosVida() - dmg);
		System.out.println(this.getNombre() + 
				" Hace un da�o de: " + dmg);
	}
	
	
	

}
