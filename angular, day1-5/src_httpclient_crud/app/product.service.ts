import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from './product';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private _http:HttpClient) { }

    baseUrl = 'http://localhost:3000/products/';


    getAll() : Observable<Product[]> {

     return   this._http.get<Product[]>(this.baseUrl);

    }

    insertProduct(product : Product) {

          this._http.post<Product>(this.baseUrl,product)
          .subscribe(  (response) => { console.log('product added', response )})

    }


    deleteProductById(id: number) { 
    

        this._http.delete<Product>(this.baseUrl+id)
          .subscribe( (data) => { console.log(id +"record deleted")})

    }
  
    updateProduct(product:Product){
      this._http.put<Product>(this.baseUrl,product)
      .subscribe( (response) => { console.log('product updated', response )}) 
    }

    getProductByName(name:string){
       this._http.get<Product>(this.baseUrl+name);
    }



}




