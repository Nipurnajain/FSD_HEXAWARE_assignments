import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-updateproduct',
  templateUrl: './updateproduct.component.html',
  styleUrls: ['./updateproduct.component.css']
})
export class UpdateproductComponent {

  constructor(private productService: ProductService){


  }



  updateProduct(data: Product){

      this.productService.updateProduct(data);

  }
}
