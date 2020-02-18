import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GratuityPdfComponent } from '../app/gratuity-pdf/gratuity-pdf.component';
import { ContainerComponent } from './container/container.component';
import { DocumentComponent } from './document/document.component';
const routes: Routes = [
  {path:"",component:ContainerComponent},
  { path: 'gratuity', component : GratuityPdfComponent},
  { path: 'document', component : DocumentComponent},
  { path: 'container', component : ContainerComponent},

 ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
