import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Hospital } from 'src/app/Entidad/Hospital';
import { ServiceService } from 'src/app/Servicios/service.service';

@Component({
  selector: 'app-eliminar',
  templateUrl: './eliminar.component.html',
  styleUrls: ['./eliminar.component.css'],
})
export class EliminarComponent implements OnInit {
  constructor(private router: Router, private services: ServiceService) {}
  hospital: Hospital = new Hospital();

  ngOnInit(): void {
    this.Buscar();
  }

  Buscar() {
    let id = localStorage.getItem('id');
    this.hospital.id = +Number(id);
    this.services.buscarHospital(this.hospital).subscribe((data) => {
      this.hospital = data;
    });
  }

  Eliminar() {
    this.services.eliminarHospital(this.hospital).subscribe((data) => {
      alert('Se eliminó');
      this.router.navigate(['listar']);
    });
  }
}
