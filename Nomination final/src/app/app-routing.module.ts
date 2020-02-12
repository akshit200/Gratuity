import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GratuityPdfComponent } from '../app/gratuity-pdf/gratuity-pdf.component';
import { ContainerComponent } from './container/container.component';

const routes: Routes = [
  {path:"",component:ContainerComponent},
  { path: 'gratuity', component : GratuityPdfComponent},
  { path: 'container', component : ContainerComponent}
 ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
