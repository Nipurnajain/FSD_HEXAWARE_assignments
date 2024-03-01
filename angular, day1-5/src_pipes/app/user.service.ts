import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() {

    console.log('UserService constructor initialized');


   }
   //user array object

   users:User[]=[{"uid":1,"username":"nipurna","email":"nipurna@gmail.com","address":"bhopal"},
                 {"uid":2,"username":"advait","email":"advait@gmail.com","address":"pune"},
                 {"uid":3,"username":"deep","email":"deep@gmail.com","address":"mumbai"}
  ];

   getAllUsers(){
    console.log("getAllUsers() called");
    return this.users;
   }
}
