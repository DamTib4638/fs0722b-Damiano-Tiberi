import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { PostAttiviComponent } from './components/post-attivi/post-attivi.component';
import { PostNonAttiviComponent } from './components/post-non-attivi/post-non-attivi.component';
import { UtentiComponent } from './components/utenti/utenti.component';
import { DettaglioUtenteComponent } from './components/dettaglio-utente/dettaglio-utente.component';
import { DettaglioPostComponent } from './components/dettaglio-post/dettaglio-post.component';

const routes: Routes = [
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'attivi',
    component: PostAttiviComponent,
  },
  {
    path: 'attivi/dettaglio-post/:id',
    component: DettaglioPostComponent,
  },
  {
    path: 'inattivi',
    component: PostNonAttiviComponent,
  },
  {
    path: 'inattivi/dettaglio-post/:id',
    component: DettaglioPostComponent,
  },
  {
    path: 'users',
    component: UtentiComponent,
    children: [
        {
            path: 'dettaglio-utente/:id',
            component: DettaglioUtenteComponent
        }
    ]
  },
  {
    path: '**',
    component: HomeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
