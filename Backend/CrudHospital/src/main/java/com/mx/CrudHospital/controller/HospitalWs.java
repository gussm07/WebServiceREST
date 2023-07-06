package com.mx.CrudHospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mx.CrudHospital.dominio.Hospital;
import com.mx.CrudHospital.servicios.HospitalServ;

@RestController
@RequestMapping("HospitalWs")
@CrossOrigin

public class HospitalWs {
	
	@Autowired
	HospitalServ hospitalServ;
	
	@GetMapping("listar")
	public List<Hospital>listar(){
		var lista = hospitalServ.listar();
		return lista;
	}
	
	@PostMapping("buscar")
	public Hospital buscar(@RequestBody Hospital hospital) {
		hospital = hospitalServ.buscar(hospital);
		return hospital;
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Hospital hospital) {
		hospitalServ.guardar(hospital);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Hospital hospital) {
		hospitalServ.editar(hospital);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Hospital hospital) {
		hospitalServ.eliminar(hospital);
	}
	
	
	@PostMapping("buscarByTelefono")
	public List<Hospital> buscarByTelefono(@RequestBody Hospital hospital){
		var lista = hospitalServ.buscarTelefono(hospital);
		return lista;
	}
	
	@PostMapping("buscarByNombre")
	public List<Hospital>buscarByNombre(@RequestBody Hospital hospital){
		var lista = hospitalServ.buscarNombre(hospital);
		return lista;
	}
}
