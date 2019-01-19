package com.api.apirest.modelo;

import org.springframework.data.annotation.Id;

public class Usuario {

	@Id
	private String id;

	private String nombre;
	private String apellido;
	private Boolean sexo;

	public Usuario() {
		super();
	}

	public Usuario(String id, String nombre, String apellido, Boolean sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
	}

	public Usuario(String nombre, String apellido, Boolean sexo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Boolean getSexo() {
		return sexo;
	}

	public void setSexo(Boolean sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre+ ", apellido=" + apellido + ", sexo=" + sexo + "]";
	}

}
