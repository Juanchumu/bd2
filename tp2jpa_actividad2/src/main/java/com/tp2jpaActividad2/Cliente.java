package com.tp2jpaActividad2;

import javax.persistence.*;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "cliente", uniqueConstraints = {
	    @UniqueConstraint(columnNames = "Id") })

public class Cliente {
	@Id
	@Column(name="id")
	private int id ;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="codloc")
	private int codloc ;
	
	public Cliente(int id, String nombre, int codloc) {
		this.id = id;
		this.nombre = nombre;
		this.codloc = codloc;
	}
	
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
	public int getCodloc() {
		return codloc;
	}
	public void setCodloc(int codloc) {
		this.codloc = codloc;
	}
	
	@Override
	public String toString() {
		return "cliente [id=" + id + ", nombre=" + nombre + ", codloc=" + codloc + "]";
	}
}

