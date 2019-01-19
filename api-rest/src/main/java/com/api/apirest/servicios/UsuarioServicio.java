package com.api.apirest.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apirest.interfaces.UsuarioInterfaz;
import com.api.apirest.modelo.Usuario;
import com.api.apirest.repositorios.UsuarioRepository;

@Service
public class UsuarioServicio implements UsuarioInterfaz {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario crearUsuario(String nombre, String apellido, Boolean sexo) {

		Usuario usuario = new Usuario(nombre, apellido, sexo);

		usuarioRepository.save(usuario);

		return usuario;
	}

	@Override
	public String crearUsuario2(Usuario usuario) {

		StringBuilder result = new StringBuilder();

		usuarioRepository.save(usuario);

		if (usuario.getId() != null) {
			result.append("Usuario Creado por el metodo 2");
		} else {
			result.append("Usuario No creado por el metodo 2");
		}

		return result.toString();
	}

	@Override
	public String updateUsuario(String id, String nombre, String apellido, Boolean sexo) {

		usuarioRepository.save(new Usuario(id, nombre, apellido, sexo));

		return "usuario creador";
	}

	@Override
	public String delateUsuario(String id) {

		usuarioRepository.deleteById(id);

		return "usuario eliminado";
	}

	@Override
	public Usuario getUsuarioPorNombre(String nombre) {

		return usuarioRepository.findByNombre(nombre);

	}

	@Override
	public List<Usuario> getUsuarios() {

		return usuarioRepository.findAll();

	}

	
	//Implementa logica de los metodos que hagas!!
}
