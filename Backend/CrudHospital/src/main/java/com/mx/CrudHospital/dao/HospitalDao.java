package com.mx.CrudHospital.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.CrudHospital.dominio.Hospital;

public interface HospitalDao extends JpaRepository<Hospital, Integer>{
	public List<Hospital> findByNombre(String nombre);
	public List<Hospital> findByTelefono(String telefono);
}
