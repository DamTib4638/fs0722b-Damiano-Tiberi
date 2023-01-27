import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ToDoComponent } from './pagine/to-do/to-do.component';
import { CompletatiComponent } from './pagine/completati/completati.component';
import { HomeComponent } from './pagine/home/home.component';
import { SfondoDirective } from './direttive/sfondo.directive';
import { TestoDirective } from './direttive/testo.directive';
import { TestoTodoDirective } from './direttive/testo-todo.directive';
import { TestiNavDirective } from './direttive/testi.directive';

@NgModule({
  declarations: [
    AppComponent,
    ToDoComponent,
    CompletatiComponent,
    HomeComponent,
    SfondoDirective,
    TestoDirective,
    TestoTodoDirective,
    TestiNavDirective
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
