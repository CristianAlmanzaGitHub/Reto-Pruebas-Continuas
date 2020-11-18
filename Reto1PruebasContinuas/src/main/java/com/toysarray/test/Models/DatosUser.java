package com.toysarray.test.Models;

public class DatosUser {
	
	String correo;
	String nombre;
	String apellido;
	String direccion;
	String casa;
	String ciudad;
	String pais;
	String departamento;
	String postalCode;
	
	public DatosUser(String correo, String nombre, String apellido, String direccion, String casa, String ciudad,
			String pais, String departamento, String postalCode) {
		super();
		this.correo = correo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.casa = casa;
		this.ciudad = ciudad;
		this.pais = pais;
		this.departamento = departamento;
		this.postalCode = postalCode;
	}

	public String getCorreo() {
		return correo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCasa() {
		return casa;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getPais() {
		return pais;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String getPostalCode() {
		return postalCode;
	}
}
