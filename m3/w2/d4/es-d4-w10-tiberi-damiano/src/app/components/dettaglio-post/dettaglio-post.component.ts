import { Component, Input, OnInit } from '@angular/core';
import { Post } from 'src/app/interface/post.interface';
import { ActivatedRoute } from '@angular/router';
import { PostsService } from 'src/app/service/posts.service';

@Component({
  selector: 'app-dettaglio-post',
  templateUrl: './dettaglio-post.component.html',
  styleUrls: ['./dettaglio-post.component.scss']
})
export class DettaglioPostComponent implements OnInit {

    p:Post | undefined;

  constructor(private ar:ActivatedRoute, private postSrv: PostsService) { }

  ngOnInit(): void {
    let id: number = this.ar.snapshot.params['id'];
    this.p = this.postSrv.getPostById(id);
  }

}
