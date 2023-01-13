import { Directive, ElementRef, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appTestoTodo]'
})
export class TestoTodoDirective {

  constructor(private el:ElementRef,private render:Renderer2) {
    render.setStyle(el.nativeElement,"color","red");
    render.setStyle(el.nativeElement,"font-weight","bold");
    render.setStyle(el.nativeElement,"font-style","italic");
  }
}
