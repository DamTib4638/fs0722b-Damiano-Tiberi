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
    this.postSrv.getPostsFiltrati(false).then((result) => {
      this.listaPostNonAttivi = result;
    })
  }

}
