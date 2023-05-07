package com.hotelAlura.modelo;

public class cliente {
	
	private int id;
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String nacionalidad;
	private String telefono;
	private int idReserva;
	
	
	
	public cliente(int id, String nombre, String apellido, String fechaNacimiento, String nacionalidad, String telefono,
			int idReserva) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.idReserva = idReserva;
	}
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public String getTelefono() {
		return telefono;
	}
	public int getIdReserva() {
		return idReserva;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

}
