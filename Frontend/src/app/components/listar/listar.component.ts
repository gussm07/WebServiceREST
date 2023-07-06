import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Hospital } from 'src/app/Entidad/Hospital';
import { ServiceService } from 'src/app/Servicios/service.service';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css'],
})
export class ListarComponent implements OnInit {
  hospital: Hospital[];
  constructor(private router: Router, private service: ServiceService) {}
  ngOnInit(): void {
    this.service.ListarHospital().subscribe((data) => {
      this.hospital = data;
      console.log('Data listar-->' + JSON.stringify(data));
    });
  }

  Editar(hospital: Hospital) {
    localStorage.setItem('id', hospital.id.toString());
    this.router.navigate(['editar']);
  }

  Eliminar(hospital: Hospital) {
    localStorage.setItem('id', hospital.id.toString());
    this.router.navigate(['eliminar']);
  }
}
