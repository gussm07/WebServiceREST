package com.mx.CrudHospital.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudHospital.dao.HospitalDao;
import com.mx.CrudHospital.dominio.Hospital;

@Service //LOGICA DE DATOS
public class HospitalServImp implements HospitalServ{

	@Autowired
	HospitalDao hospitalDao;
	
	
	public void guardar(Hospital hospital) {
		hospitalDao.save(hospital);
	}

	@Override
	public void editar(Hospital hospital) {
		hospitalDao.save(hospital);
	}

	@Override
	public void eliminar(Hospital hospital) {
		hospitalDao.delete(hospital);
	}

	@Override
	public Hospital buscar(Hospital hospital) {
		return hospitalDao.findById(hospital.getId()).orElse(null);
	}

	@Override
	public List<Hospital> listar() {
		return hospitalDao.findAll();
	}

	@Override
	public List<Hospital> buscarNombre(Hospital hospital) {
		var lista = hospitalDao.findByNombre(hospital.getNombre());
		return lista; 
	}

	@Override
	public List<Hospital> buscarTelefono(Hospital hospital) {
		var lista = hospitalDao.findByTelefono(hospital.getTelefono());
		return lista;
	}

}
