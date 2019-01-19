package com.api.apirest.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.apirest.modelo.Usuario;
import com.api.apirest.servicios.UsuarioServicio;

@RestController
@RequestMapping("/usuario")
public class usuarioControlador {

	@Autowired
	private UsuarioServicio usuarioServicio;

	@PostMapping("/crearUsuario")
	public String crearUsuario(String id, @RequestParam String nombre, @RequestParam String apellido,
			@RequestParam Boolean sexo) {

		StringBuilder result = new StringBuilder();
		if (id == null) {
			Usuario user = usuarioServicio.crearUsuario(nombre, apellido, sexo);
			if (user.getId() != null) {
				result.append("usuario creado por el metodo 1");
			} else {
				result.append("usuario no creado por el metodo 1");
			}
		} else {
			Usuario usuario = new Usuario(id, nombre, apellido, sexo);
			result.append(usuarioServicio.crearUsuario2(usuario));
		}
		return result.toString();
	}

	@GetMapping("/listarUsuarios")
	public List<Usuario> listarUsuario() {
		return usuarioServicio.getUsuarios();
	}

//	@DeleteMapping //Eliminar un usuario por id
//	@PutMapping //Modificar Por id
//	@GetMapping //Listar por nombre "name Paula" -> List de usuario con el nombre Paula 

}