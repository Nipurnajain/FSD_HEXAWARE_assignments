import { Directive, ElementRef, Renderer2,HostListener } from '@angular/core';

@Directive({
  selector: '[appCardHover]'
})
export class CardHoverDirective {

  constructor(private e1:ElementRef, private renderer:Renderer2) { //elementref and rendere are dependencies which interct with the dom

  }
  
  @HostListener('mouseover') onMouseOver(){
    this.renderer.setStyle(this.e1.nativeElement, 'backgroundColor','purple')
    alert('mouse is over context');
  }
  

}
