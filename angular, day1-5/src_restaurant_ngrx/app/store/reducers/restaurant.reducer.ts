import { createReducer ,on} from "@ngrx/store";
import { restaurant } from "src/app/models/restaurant.model";
import { addRestaurantAction,removeRestaurantAction } from "../actions/restaurant.action";


export interface ResState {

    res: restaurant[];

}
export const initialState: ResState = {

    res: [
        {
            id: 1,
            name: 'HotPot',
            location: "Bhopal",
            contact: "8839530300",
            rating:3
        }


    ]
}

export const restaurantReducer = createReducer(
    initialState,
    on(addRestaurantAction,(state,{restaurant})=>({

      ...state,
        res:[...state.res,restaurant]
    })),
    on(removeRestaurantAction,(state,{id})=>({

        ...state,
        res:state.res.filter( (restaurant) => { return restaurant.id !== id})
        
      })),
);