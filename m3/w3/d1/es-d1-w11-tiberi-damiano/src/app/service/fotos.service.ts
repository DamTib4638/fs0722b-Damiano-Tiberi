import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Foto } from '../interface/foto.interface';
import { throwError, catchError, Subject } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class FotosService {

    indirizzo = ('https://jsonplaceholder.typicode.com/photos');
    contatore: number = 0;
    favouritesSub = new Subject<number>();

  constructor(private http: HttpClient) { }

    // getFoto() {
    //     return this.http.get<{listaFoto:Foto[]}>(this.indirizzo).pipe(catchError(err => {
    //         return throwError(this.getMessaggioErrore(err.stato));
    //     }));
    // }

    getFoto() {
        return this.http.get<Foto[]>(this.indirizzo).pipe(catchError(err => {
            return throwError(this.getMessaggioErrore(err.stato));
        }));
    }

    deleteFoto(id:number) {
        return this.http.delete(this.indirizzo+'/'+id).pipe(catchError(err => {
            return throwError(this.getMessaggioErrore(err.stato));
        }));
    }

    incrementa() {
        this.contatore++;
        this.favouritesSub.next(this.contatore);
    }

    decrementa() {
        this.contatore--;
        this.favouritesSub.next(this.contatore);
    }

    getMessaggioErrore(stato: number) {
        let messaggio:string = '';
        if (199 < stato && stato < 299) {
            messaggio = 'TUTTO OK';
        } else if (stato < 399) {
            messaggio = 'PROBLEMI DI COMUNICAZIONE DATI';
        } else {
            messaggio = 'PROBLEMI GENERICI';
        }
    }

}
