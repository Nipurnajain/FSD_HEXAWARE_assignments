import { Component} from '@angular/core';
import { UserService } from './user.service';
import {User} from './user';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  //providers: [UserService]       to make it local and it will only be used by this component
})
export class AppComponent{
  title = 'webapp';
  object:object={name:'nipurna',age:22}


userList:User[]=[];

  constructor(private userService:UserService){
 console.log('component class obj created');
  }

  ngOnInit():void{
    console.log('ngOnInit is called');
    this.getAll();
  }
  getAll(){

    this.userList=this.userService.getAllUsers();
  }
}
