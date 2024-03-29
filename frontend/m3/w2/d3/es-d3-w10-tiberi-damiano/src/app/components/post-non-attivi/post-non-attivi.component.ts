import { Component, OnInit } from '@angular/core';
import { Post } from 'src/app/interface/post.interface';
import { PostsService } from 'src/app/service/posts.service';

@Component({
  selector: 'app-post-non-attivi',
  templateUrl: './post-non-attivi.component.html',
  styleUrls: ['./post-non-attivi.component.scss']
})
export class PostNonAttiviComponent implements OnInit {

  listaPostNonAttivi: Post[] = [];

  constructor(private postSrv:PostsService) { }

  ngOnInit(): void {
    this.listaPostNonAttivi = this.postSrv.getPostFiltrati(false);
    // this.postSrv.getPostsFiltrati(false).then((result) => {
    //   this.listaPostNonAttivi = result;
    // })
  }

  modificaStato(id:number) {

    this.postSrv.updatePost(id);
    this.listaPostNonAttivi = this.listaPostNonAttivi.filter(p=>p.active==false);
    // this.ngOnInit();
  }

}
