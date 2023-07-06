import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AgregarComponent } from './components/agregar/agregar.component';
import { EditarComponent } from './components/editar/editar.component';
import { EliminarComponent } from './components/eliminar/eliminar.component';
import { ListarComponent } from './components/listar/listar.component';

const routes: Routes = [
  { path: 'agregar', component: AgregarComponent },
  { path: 'editar', component: EditarComponent },
  { path: 'eliminar', component: EliminarComponent },
  { path: 'listar', component: ListarComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
