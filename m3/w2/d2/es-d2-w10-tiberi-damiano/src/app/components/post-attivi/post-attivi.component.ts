import { Component, OnInit } from '@angular/core';
import { Post } from 'src/app/interface/post.interface';
import { PostsService } from 'src/app/service/posts.service';

@Component({
  selector: 'app-post-attivi',
  templateUrl: './post-attivi.component.html',
  styleUrls: ['./post-attivi.component.scss']
})
export class PostAttiviComponent implements OnInit {

  listaPostAttivi: Post[] = [];

  constructor(private postSrv: PostsService) { }

  ngOnInit(): void {
    this.postSrv.getPostsFiltrati(true).then((result) => {
      this.listaPostAttivi = result;
    })
  }

}
