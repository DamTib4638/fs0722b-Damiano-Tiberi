import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './auth/auth.guard';
import { LoginComponent } from './auth/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { MoviesComponent } from './components/movies/movies.component';
import { UserComponent } from './components/user/user.component';


const routes: Routes = [
    {
        path: 'home',
        //non possiamom impostare il component della rotta perchèm non vogliamo caricarlo finche non ci serve
        //usiamo loadChildren (lazy loading) per caricare un modulo (con il suo routing) solo quando la rotta è raggiunta
        // loadChildren: () => {
        //     return import(
        //         './components/home/home-routing/home-routing.module'
        //     ).then((m) => m.HomeRoutingModule);
        // },
        component:HomeComponent,
        children:[
            {
                path:'movies',
                component:MoviesComponent,
                canActivate:[AuthGuard]
            },
            {
                path:'user',
                component:UserComponent,
                canActivate:[AuthGuard]
            }
        ],
        canActivate: [AuthGuard],
    },
    // {
    //     path: 'sports',
    //     loadChildren: () => {
    //         return import('./sports/sports.module').then((m) => {
    //             return m.SportsModule;
    //         });
    //     },
    //     canActivate: [AuthGuard],
    // },
    {
        path: '',
        redirectTo: '/login',
        pathMatch: 'full'
    }
    ,
    // {
    //     path: 'movies',
    //     component: MoviesComponent,
    //     canActivate:[AuthGuard]
    // },
    // {
    //     path: 'profile',
    //     component:UserComponent,
    //     canActivate:[AuthGuard]
    // }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule],
})
export class AppRoutingModule {}
