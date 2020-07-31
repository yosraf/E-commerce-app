import {Component, OnInit} from '@angular/core';
import {ProductService} from '../../services/product.service';
import {Product} from '../../common/product';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.scss']
})
export class ProductListComponent implements OnInit {

  products: Product[];

  constructor(private productListService: ProductService) {
  }

  listProducts() {
    this.productListService.getProductList().subscribe(data => {
      this.products = data;
    });

  }

  ngOnInit(): void {
    this.listProducts();
  }

}
