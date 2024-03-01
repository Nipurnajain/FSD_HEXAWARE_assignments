import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  childDataRecieved = '';

  parentData:string = 'Hi this is Parent Data again';


  getChildData(data:any){

      console.log(data);

      this.childDataRecieved = data;

  }


}
