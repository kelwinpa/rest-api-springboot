package com.api.apirest.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.api.apirest.modelo.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{

	public Usuario findByNombre(String Nombre);
	
}
