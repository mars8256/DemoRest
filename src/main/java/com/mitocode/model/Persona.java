package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
@Entity anotaciones para que se cree la tabla en la base de datos
@Table podemos indicar el nombre de la tabla si no lo indicamos 
toma el nombre de la clase por defecto
*/

@Entity
@Table(name="persona")
public class Persona {
	@Id
	private int id;
	@Column(name="nombre", length=30)
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
