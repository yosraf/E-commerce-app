import { Component, OnInit } from '@angular/core';
import { ProductService } from './services/product.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  itemNumber = 0;
  price =0
  constructor(private productService : ProductService){}
  ngOnInit() {
    this.productService.itemNumber.subscribe(item => this.itemNumber = item);
    this.productService.itemPrice.subscribe(item => this.price = item);

  }

 
  
}
