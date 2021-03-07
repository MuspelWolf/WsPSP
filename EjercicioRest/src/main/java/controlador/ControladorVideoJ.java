package controlador;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import modelo.DaoVideojuego;
import modelo.Videojuego;

public class ControladorVideoJ {
	
	//@Autwired
	private DaoVideojuego dVideoJ;
	
	//@GetMapping("videojuego")
	public ResponseEntity<List<Videojuego>> list(){
		
		List<Videojuego> lista = dVideoJ.list();
		
		ResponseEntity<List<Videojuego>> re =
				new ResponseEntity<List<Videojuego>>(lista, HttpStatus.OK);
		
		return re;
	}
	
	@GetMapping("videojuego/{id}")
	public ResponseEntity<Videojuego> obtener(@PathVariable("id") int id_vj){
		System.out.println("El id a buscar es: " + id_vj);
		
		Videojuego vj1 = dVideoJ.buscar(id_vj);
		HttpStatus hs = null;
		if(vj1 != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<Videojuego> re = new ResponseEntity<Videojuego>(vj1,hs);
		
		return re;
	}
	
	@PostMapping("videojuegos")
	public ResponseEntity<Videojuego> alta(@RequestBody Videojuego vj1) {
		Videojuego vAlta = dVideoJ.alta(vj1);
		
		ResponseEntity<Videojuego> re = 
				new ResponseEntity<Videojuego>(vAlta,HttpStatus.CREATED);
		return re;
	}
	
	@PutMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> modificar(@RequestBody Videojuego vj1,
			@PathVariable("id") int id_vj){
		//Aqui me va venir el id por el parametro de URL y el resto
		//de la informacion a cambiar por el body
		//Asi pues le meto el id a la persona que me llega para juntarlos
		vj1.setId(id_vj);
		
		Videojuego pModificada = dVideoJ.update(vj1);
		
		HttpStatus hs = null;
		if(pModificada != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<Videojuego> re = 
				new ResponseEntity<Videojuego>(pModificada,hs);
		
		return re;
	}
	//Para borrar usaremos el metodoo DELETE
	@DeleteMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> borrar(@PathVariable("id") int id_vj){
		Videojuego vj1 = dVideoJ.delete(id_vj);
		HttpStatus hs = null;
		if(vj1 != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<Videojuego> re = 
				new ResponseEntity<Videojuego>(vj1,hs);
		
		return re;
	}

}

