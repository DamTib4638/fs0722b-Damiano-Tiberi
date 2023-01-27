import { Injectable } from '@angular/core';
import { Post } from '../interface/post.interface';

@Injectable({
  providedIn: 'root',
})
export class PostsService {
  allPosts: Post[] = [
    {
      id: 1,
      body: 'Sit minim deserunt enim enim nisi. Eiusmod incididunt dolore et ea anim. Non exercitation id voluptate et velit quis anim officia fugiat esse laborum nisi fugiat non.',
      title:
        'Dolor velit sint tempor culpa cupidatat ipsum do ad tempor eiusmod.',
      active: true,
      type: 'news',
      author: 'Stefano'
    },
    {
      id: 2,
      body: 'Sit minim deserunt enim enim nisi. Eiusmod incididunt dolore et ea anim. Non exercitation id voluptate et velit quis anim officia fugiat esse laborum nisi fugiat non.',
      title:
        'Dolor velit sint tempor culpa cupidatat ipsum do ad tempor eiusmod.',
      active: true,
      type: 'politic',
      author: 'Francesco'
    },
    {
      id: 3,
      body: 'Sit minim deserunt enim enim nisi. Eiusmod incididunt dolore et ea anim. Non exercitation id voluptate et velit quis anim officia fugiat esse laborum nisi fugiat non.',
      title:
        'Dolor velit sint tempor culpa cupidatat ipsum do ad tempor eiusmod.',
      active: true,
      type: 'education',
      author: 'Matteo'
    },
    {
      id: 4,
      body: 'Sit minim deserunt enim enim nisi. Eiusmod incididunt dolore et ea anim. Non exercitation id voluptate et velit quis anim officia fugiat esse laborum nisi fugiat non.',
      title:
        'Dolor velit sint tempor culpa cupidatat ipsum do ad tempor eiusmod.',
      active: false,
      type: 'politic',
      author: 'Riccardo'
    },
    {
      id: 5,
      body: 'Sit minim deserunt enim enim nisi. Eiusmod incididunt dolore et ea anim. Non exercitation id voluptate et velit quis anim officia fugiat esse laborum nisi fugiat non.',
      title:
        'Dolor velit sint tempor culpa cupidatat ipsum do ad tempor eiusmod.',
      active: false,
      type: 'news',
      author: 'Umberto'
    },
  ];

  constructor() {}

  // getPosts():Post[]{
  //   return this.allPosts;
  // }

  getPostById(id:number) {
    let articolo = this.allPosts.find((p) => {
        return (p.id == id);
    });
    return articolo;
  }

  getPostFiltrati(a:boolean) {
    return this.allPosts.filter(p=>p.active==a);
  }

  updatePost(n:number) {
    for (let i=0; i<this.allPosts.length;i++) {
      if (this.allPosts[i].id == n) {
        if(this.allPosts[i].active) {
          this.allPosts[i].active = false;
        } else {
          this.allPosts[i].active = true;
        }
      }
    }
  }

  /* In questo metodo faccio una fetch al file json ed assegno il contenuto del file della fetch alla variabile json, in formato json. */
  // getPostsFiltrati(a:boolean) {
  //   let json = fetch('../../assets/db.json').then(data => {
  //     return data.json();
  //   });
  //   /* in lista (con il secondo then) ci metto l'array di oggetti che fanno parte dei dati json salvati dopo la fetch (nel primo then).*/
  //   let lista = json.then((posts:Post[]) => {
  //     return posts.filter(post => post.active==a);
  //   })
  //   return lista;
  // }
}
