package com.mx.CrudHospital.servicios;

import java.util.List;

import com.mx.CrudHospital.dominio.Hospital;


public interface HospitalServ {
	public void guardar(Hospital hospital);

	public void editar(Hospital hospital);

	public void eliminar(Hospital hospital);

	public Hospital buscar(Hospital hospital);

	public List<Hospital> listar();

	public List<Hospital> buscarNombre(Hospital hospital);

	public List<Hospital> buscarTelefono(Hospital hospital);

}
