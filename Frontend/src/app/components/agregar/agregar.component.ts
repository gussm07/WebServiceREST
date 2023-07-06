import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Hospital } from 'src/app/Entidad/Hospital';
import { ServiceService } from 'src/app/Servicios/service.service';

/* LOGICA DEL COMPONENTE */
@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.css'],
})
export class AgregarComponent implements OnInit {
  constructor(private router: Router, private service: ServiceService) {}
  hospital: Hospital = new Hospital();
  ngOnInit(): void {}

  Guardar() {
    this.service.guardarHospital(this.hospital).subscribe((data) => {
      alert('Se guardó el hospital');
      this.router.navigate(['listar']);
    });
  }
}
