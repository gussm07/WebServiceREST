import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Hospital } from 'src/app/Entidad/Hospital';
import { ServiceService } from 'src/app/Servicios/service.service';

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css'],
})
export class EditarComponent implements OnInit {
  constructor(private router: Router, private service: ServiceService) {}
  hospital: Hospital = new Hospital();
  ngOnInit(): void {
    this.Buscar();
  }

  Buscar() {
    let id = localStorage.getItem('id');
    /* OBTENER EL ID DE LOCAL STORAGE Y ALMACENARLO EN EL OBJETO EMPRESA */
    this.hospital.id = +Number(id);
    this.service.buscarHospital(this.hospital).subscribe((data: Hospital) => {
      this.hospital = data;
    });
  }

  Editar() {
    this.service.editarHospital(this.hospital).subscribe((data) => {
      alert('se editó');
      this.router.navigate(['listar']);
    });
  }
}
