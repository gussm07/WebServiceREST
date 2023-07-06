package com.mx.CrudHospital.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HOSPITAL")
public class Hospital {
	/*
	 * CREATE TABLE HOSPITAL( ID NUMBER PRIMARY KEY, NOMBRE NVARCHAR2(100), TELEFONO
	 * NUMBER, DIRECCION NVARCHAR2(100), NO_CAMAS NUMBER );
	 */

	@Id
	@Column
	int id;
	@Column
	String nombre;
	@Column
	String telefono;
	@Column
	String direccion;
	@Column
	int no_camas;

	public Hospital() {

	}

	public Hospital(int id) {
		this.id = id;
	}

	public Hospital(int id, String nombre, String telefono, String direccion, int no_camas) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.no_camas = no_camas;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", no_camas=" + no_camas + "]\n";
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

	

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNo_camas() {
		return no_camas;
	}

	public void setNo_camas(int no_camas) {
		this.no_camas = no_camas;
	}

}
