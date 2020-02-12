import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { PfForm1Component } from './pf-form1/pf-form1.component';
import { PfForm2Component } from './pf-form2/pf-form2.component';
import { EpfFormComponent } from './epf-form/epf-form.component';
import { EpsNominationComponent } from './eps-nomination/eps-nomination.component';
import { FirstComponent } from './first/first.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    PfForm1Component,
    PfForm2Component,
    EpfFormComponent,
    EpsNominationComponent,
    FirstComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
