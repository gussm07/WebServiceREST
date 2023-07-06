import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Hospital } from 'src/app/Entidad/Hospital';

//INYECCION DE DEPENDENCIAS
@Injectable({
  providedIn: 'root',
})
export class ServiceService {
  constructor(private http: HttpClient) {}

  urlListar = 'http://localhost:9000/HospitalWs/listar';
  urlBuscar = 'http://localhost:9000/HospitalWs/buscar';
  urlEliminar = 'http://localhost:9000/HospitalWs/eliminar';
  urlGuardar = 'http://localhost:9000/HospitalWs/guardar';
  urlEditar = 'http://localhost:9000/HospitalWs/editar';

  ListarHospital() {
    return this.http.get<Hospital[]>(this.urlListar);
  }
  buscarHospital(hospital: Hospital) {
    return this.http.post<Hospital>(this.urlBuscar, hospital);
  }

  guardarHospital(hospital: Hospital) {
    return this.http.post<Hospital>(this.urlGuardar, hospital);
  }

  editarHospital(hospital: Hospital) {
    return this.http.post<Hospital>(this.urlEditar, hospital);
  }

  eliminarHospital(hospital: Hospital) {
    return this.http.post<Hospital>(this.urlEliminar, hospital);
  }
}
