package modelo;

import java.util.ArrayList;
import java.util.List;

public class DaoVideojuego {
	
	private List<Videojuego> lVideo;
	private int cont = 0;
	
	public DaoVideojuego(){
		
		Videojuego vj1 = new Videojuego();
		vj1.setId(cont++);
		vj1.setNombre("Resident Evil");
		vj1.setComp("Namco");
		vj1.setPrecio(12);
		vj1.setPunt(34);
		
		Videojuego vj2 = new Videojuego();
		vj2.setId(cont++);
		vj2.setNombre("Evil From Within");
		vj2.setComp("Bethesda");
		vj2.setPrecio(60);
		vj2.setPunt(90);
		
		lVideo = new ArrayList<Videojuego>();
		lVideo.add(vj1);
		lVideo.add(vj2);
	}
	
	public List<Videojuego> list(){
		return lVideo;
	}
	
	public Videojuego buscar(int id) {
		Videojuego videoJ = null;
		
		for(Videojuego vj : lVideo) {
			if(vj.getId() == id) {
				videoJ = vj;
				break;
			}
			
		}
		return videoJ;
	}
	
	public Videojuego alta(Videojuego vj) {
		vj.setId(cont++);
		lVideo.add(vj);
		return vj;
	}
	
	public Videojuego update(Videojuego vj) {
		Videojuego videoJ = buscar(vj.getId());
		
		if(videoJ != null) {
			videoJ.setPrecio(vj.getPrecio());
		}
		
		return videoJ;
	}
	
	public Videojuego delete(int id) {
		
		Videojuego vj = buscar(id);
		
		if(vj != null) {
			lVideo.remove(id);
		}
		
		return vj;
	}

}
