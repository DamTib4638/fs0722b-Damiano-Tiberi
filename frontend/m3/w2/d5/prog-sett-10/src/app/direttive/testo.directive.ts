import { Directive, ElementRef, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appTesto]'
})
export class TestoDirective {

  constructor(private el:ElementRef,private render:Renderer2) {
    render.setStyle(el.nativeElement,"color","red");
  }

}
