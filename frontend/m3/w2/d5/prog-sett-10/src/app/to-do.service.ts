import { Injectable } from '@angular/core';
import { ToDo } from './to-do.interface';

@Injectable({
  providedIn: 'root'
})

export class ToDoService {
  listaCompiti:ToDo[]=[];

  constructor() { }

  get(): Promise<ToDo[]>{
  return new Promise((res, rej)=>{
  setTimeout(()=>{
    res(this.listaCompiti)
  },2000);
  });
  }

  add(todo:Omit<ToDo,'id'>): Promise<ToDo>{
    return new Promise((res,rej)=>{
      setTimeout(()=>{
       const newTodo:ToDo={...todo,id:this.listaCompiti.length+1}
       this.listaCompiti.push(newTodo);
       res(newTodo);
      },2000);

    })
  }

  remove(tod:Omit<ToDo,'completed'>): Promise<number>{
    return new Promise((res,rej)=>{
      setTimeout(()=>{
      this.listaCompiti=this.listaCompiti.filter((todo)=>todo.id !== tod.id);
      res(tod.id);
      },2000);

    })
  }

  update(id:number): Promise<ToDo>{
    return new Promise((res,rej)=>{
      setTimeout(()=>{
        this.listaCompiti[id-1].completed=true;
      },2000);
    })
  }

  getFiltered(a:boolean): Promise<ToDo[]>{
    return new Promise((res, rej)=>{
    setTimeout(()=>{

      if(res){
        res(this.listaCompiti.filter(p=>p.completed==a))
      }
      else{
        rej("")
      }
    },2000);
    });
    }
 }


