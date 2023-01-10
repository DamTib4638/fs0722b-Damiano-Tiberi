import { Injectable } from '@angular/core';
import { Post } from '../interface/post.interface';

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  posts: Post[] = [];

  constructor() { }

  async getPosts() {
    fetch('../../assets/db.json').then(data => {
      return data.json();
    }).then((res) => {
      console.log(res);
      for (let post of res) {
        this.posts.push(post);
      }
      return this.posts;
    })
  }

}
