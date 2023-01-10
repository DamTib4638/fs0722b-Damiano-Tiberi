import { Injectable } from '@angular/core';
import { Post } from '../interface/post.interface';

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  constructor() { }

  /* In questo metodo faccio una fetch al file json ed assegno il contenuto del file della fetch alla variabile json, in formato json. */
  getPostsFiltrati(a:boolean) {
    let json = fetch('../../assets/db.json').then(data => {
      return data.json();
    });
    /* in lista (con il secondo then) ci metto l'array di oggetti che fanno parte dei dati json salvati dopo la fetch (nel primo then).*/
    let lista = json.then((posts:Post[]) => {
      return posts.filter(post => post.active==a);
    })
    return lista;
  }

}
