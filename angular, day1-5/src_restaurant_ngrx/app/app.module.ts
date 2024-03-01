import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { restaurantReducer } from './store/reducers/restaurant.reducer';
import {  StoreDevtoolsModule } from '@ngrx/store-devtools';
import { StoreModule } from '@ngrx/store';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    AppComponent,
    RestaurantComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    StoreModule.forRoot({res:restaurantReducer}),
    StoreDevtoolsModule.instrument({
      maxAge: 25

    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
