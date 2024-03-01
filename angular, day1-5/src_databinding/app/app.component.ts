import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',         //INSTEAD OF URL WE CAN DIRECTLY WRITE HTML OR CSS HERE ALSO
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';
  username='king';
  imageurl='../assets/car.jpeg';

  getData(){

    alert('getData() called');
  }





}
