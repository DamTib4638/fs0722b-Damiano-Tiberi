import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ReactFormComponent } from './components/react-form/react-form.component';
import { TdFormComponent } from './components/td-form/td-form.component';
import { HomeComponent } from './components/home/home.component';

const routes: Routes = [
   {
      path: 'home',
      component: HomeComponent
    },
    {
      path:'td-form',
      component: TdFormComponent
    },
    {
      path: 'react-form',
      component: ReactFormComponent
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
