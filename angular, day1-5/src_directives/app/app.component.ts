import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';
  num1="";
  tech="";
  arr:number[]=[1,2,3,4,5];
  textColor="red";
  bgColor="yellow";

  isSpecial=true;
}
