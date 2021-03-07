package entidad;

public abstract class Arma {
	private int dmgMinimo;
	private int dmgMaximo;
	private String tipo;
	private Personaje personaje;
	
	public abstract int usar();

	public int getDmgMinimo() {
		return dmgMinimo;
	}

	public void setDmgMinimo(int dmgMinimo) {
		this.dmgMinimo = dmgMinimo;
	}

	public int getDmgMaximo() {
		return dmgMaximo;
	}

	public void setDmgMaximo(int dmgMaximo) {
		this.dmgMaximo = dmgMaximo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	@Override
	public String toString() {
		return "Arma [da�oMinimo=" + dmgMinimo + ", da�oMaximo=" + dmgMaximo + ", tipo=" + tipo + ", personaje="
				+ personaje.getNombre() + "]";
	}
	
	
}
