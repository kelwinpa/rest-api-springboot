package com.api.apirest.interfaces;

import java.util.List;

import com.api.apirest.modelo.Usuario;

public interface UsuarioInterfaz {

	public Usuario crearUsuario(String nombre, String apellido, Boolean sexo);

	public String crearUsuario2(Usuario usuario);

	public String updateUsuario(String id, String nombre, String apellido, Boolean sexo);

	public String delateUsuario(String id);

	public Usuario getUsuarioPorNombre(String nombre);

	public List<Usuario> getUsuarios();

	//Definir un metodo listar por sexo -> Repository crear ese metodo!! usando anotacion JTA
}
