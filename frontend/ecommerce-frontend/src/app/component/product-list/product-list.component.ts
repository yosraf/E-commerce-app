import {Component, OnInit} from '@angular/core';
import {ProductService} from '../../services/product.service';
import {Product} from '../../common/product';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list-grid.component.html',
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
    // this.listProducts();
    this.products = [{
      'sku':'',
      'description':'',
      'name': 'spring boot course',
      'unitPrice': 200,
      'unitsInStock': 10,
      'imageUrl':'https://www.liksi.tech/wp-content/uploads/2019/11/Plan-de-travail-1@0.75x-100.jpg',
      'active':true,
      'dateCreated':null,
      'lastUpdated':null
    },
      {
        'sku':'',
        'description':'',
        'name': 'spring boot course',
        'unitPrice': 200,
        'unitsInStock': 10,
        'imageUrl':'https://www.liksi.tech/wp-content/uploads/2019/11/Plan-de-travail-1@0.75x-100.jpg',
        'active':true,
        'dateCreated':null,
        'lastUpdated':null
      },
      {
        'sku':'',
        'description':'',
        'name': 'spring boot course',
        'unitPrice': 200,
        'unitsInStock': 10,
        'imageUrl':'https://www.liksi.tech/wp-content/uploads/2019/11/Plan-de-travail-1@0.75x-100.jpg',
        'active':true,
        'dateCreated':null,
        'lastUpdated':null
      }
    ];
  }

}
