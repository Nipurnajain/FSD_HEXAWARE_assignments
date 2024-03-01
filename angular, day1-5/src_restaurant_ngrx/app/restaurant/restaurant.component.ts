import { Component } from '@angular/core';
import { restaurant } from '../models/restaurant.model';
import { Store } from '@ngrx/store';
import {addRestaurantAction,removeRestaurantAction} from  '.././store/actions/restaurant.action';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.css']
})
export class RestaurantComponent {
  newRestaurantName!: string;
  newRestaurantLocation!: string;
  newRestaurantContact!: string;
  newRestaurantRating!: number;

  restaurantList!: restaurant[];

  constructor(private store:Store<{res:{res:restaurant[]}}>) {

    store.select('res').subscribe((resState: { res: restaurant[] }) => {
      this.restaurantList = resState.res;
      console.log(this.restaurantList);
    });

}

  
  addRestaurant(){

    if(this.newRestaurantName.trim() === '') {


        return;
    
    }

     const newRestaurant: restaurant = {

      id:Math.random(),
      name: this.newRestaurantName,
      location: this.newRestaurantLocation,
      contact: this.newRestaurantContact,
      rating: this.newRestaurantRating
     }

     this.store.dispatch(addRestaurantAction({ restaurant: newRestaurant }));
     this.newRestaurantName = '';
     this.newRestaurantLocation = '';
     this.newRestaurantContact = '';
     this.newRestaurantRating = 0;

  }

  removeRestaurant(id:number){

    this.store.dispatch(removeRestaurantAction({id}));

}

updateRestaurant(id:number){

}


}
