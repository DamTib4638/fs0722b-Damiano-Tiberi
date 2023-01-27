import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';
import { PostAttiviComponent } from './components/post-attivi/post-attivi.component';
import { PostNonAttiviComponent } from './components/post-non-attivi/post-non-attivi.component';
import { CardPostComponent } from './components/card-post/card-post.component';
import { UtentiComponent } from './components/utenti/utenti.component';
import { DettaglioUtenteComponent } from './components/dettaglio-utente/dettaglio-utente.component';
import { DettaglioPostComponent } from './components/dettaglio-post/dettaglio-post.component';
import { HighLightDirective } from './direttive/high-light.directive';
import { MaiuscoloPipe } from './pipes/maiuscolo.pipe';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    PostAttiviComponent,
    PostNonAttiviComponent,
    CardPostComponent,
    UtentiComponent,
    DettaglioUtenteComponent,
    DettaglioPostComponent,
    HighLightDirective,
    MaiuscoloPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
