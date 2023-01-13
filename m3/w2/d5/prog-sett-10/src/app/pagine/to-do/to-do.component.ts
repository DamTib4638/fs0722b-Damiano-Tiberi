import { Component, OnInit } from '@angular/core';
import { ToDoService } from 'src/app/to-do.service';
import { ToDo } from 'src/app/to-do.interface';

@Component({
  selector: 'app-to-do',
  templateUrl: './to-do.component.html',
  styleUrls: ['./to-do.component.scss']
})
export class ToDoComponent implements OnInit {
  allTodos!:ToDo[];
  nuovoToDo:string = '';
  controllo:boolean=false;
  constructor(private todoSrv:ToDoService) { }
  ngOnInit(): void {
    this.prova();
  }
  ngOnChange():void{

  }
  async prova(){
    this.allTodos=await this.todoSrv.getFiltered(false);
    this.controllo=true;
  }
  async aggiungi(){
    if (this.nuovoToDo.trim() != '' && this.nuovoToDo !== undefined) {
      const todoMom:ToDo={id:1,title:this.nuovoToDo,completed:false}
      this.controllo=false;
      this.todoSrv.add(todoMom);
      this.prova();
      this.nuovoToDo = '';
    } else {
      this.nuovoToDo = '';
    }
  }
  async aggiorna(id:number){
    this.todoSrv.update(id);
    this.prova();
  }
  async elimina(id:number){
    const momToDo:ToDo={id:id,title:"",completed:true}
    this.todoSrv.remove(momToDo);
    this.prova()
    console.log(this.allTodos)

  }

}
