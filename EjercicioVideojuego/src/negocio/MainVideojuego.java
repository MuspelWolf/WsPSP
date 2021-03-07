package negocio;

import java.util.ArrayList;
import java.util.List;

import entidad.Arma;
import entidad.Curandero;
import entidad.Duelo;
import entidad.Espada;
import entidad.Guerrero;
import entidad.Hechizo;
import entidad.Mago;
import entidad.Personaje;
import entidad.Rezo;

public class MainVideojuego {
	public static void main(String[] args) {
		Guerrero g1 = new Guerrero();
		g1.setNombre("Thor");
		g1.setFuerza(10);
		g1.setIniciativa(20);
		g1.setPuntosVida(150);
		
		Mago m1 = new Mago();
		m1.setNombre("Gandalf");
		m1.setIniciativa(15);
		m1.setPuntosVida(120);
		m1.setInteligencia(20);
		
		Curandero c1 = new Curandero();
		c1.setNombre("Atheroz");
		c1.setPuntosVida(135);
		c1.setIniciativa(18);
		c1.setSabiduria(25);
		
		List<Personaje> listaPersonaje = new ArrayList<Personaje>();
		listaPersonaje.add(g1);
		listaPersonaje.add(m1);
		listaPersonaje.add(c1);
		
		Arma a1 = new Espada();
		a1.setDmgMaximo(20);
		a1.setDmgMinimo(10);
		a1.setTipo("Excalibur");
		
		Arma a2 = new Hechizo();
		a2.setDmgMaximo(35);
		a2.setDmgMinimo(5);
		a2.setTipo("Fireball");
		
		Arma a3 = new Rezo();
		a3.setDmgMaximo(15);
		a3.setDmgMinimo(10);
		a3.setTipo("Sanar");
				
		m1.setArma(a2);
		a2.setPersonaje(m1);
		
		g1.setArma(a3);
		a3.setPersonaje(g1);
		
		c1.setArma(a1);
		a1.setPersonaje(c1);
		
		Duelo duelo = new Duelo();
		duelo.setP1(g1);
		duelo.setP2(c1);
		Personaje pGWin = duelo.combatir();
		
		System.out.println("GANADOR!!! " + pGWin);
		
	}
}
