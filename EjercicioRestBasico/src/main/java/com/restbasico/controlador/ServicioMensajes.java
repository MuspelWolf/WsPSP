package com.restbasico.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restbasico.modelo.entidad.Persona;

//Tenemos que decirle a spring que cuando arranque esta aplicacion de de alta
//esta clase como "end-point", es decir que esta clase este escuchando peticiones
//http que lleguen a nuestro servidor. Para ello tenemos que usar la anotacion
//@RestController, que creara un bean en el contexto de spring con capacidad
//para procesar mensajes http

@RestController
public class ServicioMensajes {

	private String mensaje = "Esto es un mensaje generico :)";
	
	@Autowired
	private Persona p1;
	
	//las peticiones van a ser procesadas por metodos en java anotados con determinadas
	//anotaciones, que nos a permitir saber con que metodo http estan mapeadas
	//y a que recurso queremos acceder
	
	
	//Con la siguiente anotacion estamos diciando a la aplicacion Spring que cuando
	//me hagan una peticion al servidor al recurso "mensaje" mediante el verbo o
	//metodo http "GET", entraremos por el metodo "obtenerMensaje"
	//La URL que tendremos que poner sera la siguiente: 
	// http://localhost:8080/mensaje
	// Nota, si el puerto esta ocupado podemos cambiarlo en "application.propeties"
	// Nota 2, si ponemos la url en un navegador, este nos formara la peticon http por
	// el verbo GET
	// Nota 3, NO OS OLVIDEIS DE LEVANTAR LA APP!!!!
	@GetMapping("mensaje")
	public String obtenerMensaje() {
		System.out.println("Hemos recibido una peticion HTTP :)");
		return mensaje;
	}
	
	@GetMapping("pizzaconpatatas")
	public String obtenerPCP() {
		//Este codigo de abajo daría un nullpointerexcepction y spring
		//devolver un codigo 500
		//String s = null;
		//s.toString();//nullpointerexception
		return "Esa es una mierda de pizza... aunque mejor que la pizza con piña ;)";
	}
	
	@GetMapping("persona")
	public Persona obtenerPersona() {
		//podemos crear la persona o darla de alta en el contexto de spring
		//y luego inyectarsela al atributo persona
		//Persona p1 = new Persona();
		p1.setNombre("Bart Simpson");
		p1.setEdad(11);
		p1.setPeso(35.5);
		
		return p1;
	}
	
	@DeleteMapping("mensaje")
	public String borrarMensaje() {
		mensaje = "";
		return "OK";
	}
	
	@PutMapping("mensaje")
	public String modificar() {
		mensaje = "mensaje cambiado!!!!";
		return "OK";
	}
}

