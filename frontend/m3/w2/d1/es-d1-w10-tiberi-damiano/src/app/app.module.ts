import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PrimoComponenteComponent } from './component1/primo-componente/primo-componente.component';
import { SecondoComponenteComponent } from './component2/secondo-componente/secondo-componente.component';
import { TerzoComponenteComponent } from './component3/terzo-componente/terzo-componente.component';

@NgModule({
  declarations: [
    AppComponent,
    PrimoComponenteComponent,
    SecondoComponenteComponent,
    TerzoComponenteComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
