package com.example.demo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidad.Usuario;
import com.example.demo.persistencia.DaoUsuario;



@Service
public class GestorUsuario {

	@Autowired
	private DaoUsuario daoUsuario;

	public boolean validateUser(Usuario user) {
		Usuario aux = daoUsuario.findByNombreAndPassword(user.getName(), user.getPassword());

		if (aux != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addUser(Usuario user) {
		daoUsuario.save(user);
	}
	

}

