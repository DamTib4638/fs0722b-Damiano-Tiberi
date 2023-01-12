import { Directive, ElementRef, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appHighLight]'
})
export class HighLightDirective {

    constructor(private el:ElementRef,private render:Renderer2) {
        render.setStyle(el.nativeElement,"backgroundColor","red");
       }

}
