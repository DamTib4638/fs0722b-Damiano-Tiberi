import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ToDoComponent } from './pagine/to-do/to-do.component';
import { CompletatiComponent } from './pagine/completati/completati.component';
import { HomeComponent } from './pagine/home/home.component';

const routes: Routes = [
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path:'todo',
    component:ToDoComponent
  },
  {
    path: 'completati',
    component: CompletatiComponent
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
