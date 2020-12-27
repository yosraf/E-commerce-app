import {Component, OnInit, OnChanges,SimpleChanges} from '@angular/core';
import {ProductCategory} from '../../common/product-category';
import {ProductService} from '../../services/product.service';

@Component({
  selector: 'app-product-category-menu',
  templateUrl: './product-category-menu.component.html',
  styleUrls: ['./product-category-menu.component.scss']
})
export class ProductCategoryMenuComponent implements OnInit,OnChanges {

  productCategories: ProductCategory[];

  constructor(private productService: ProductService) {
  }
  ngOnChanges(changes: SimpleChanges): void {
    this.ngOnInit();
  }

  getProductCategories() {
    this.productService.getProductCategories().subscribe(data => {
        this.productCategories = data;
      }
    );
  }

  ngOnInit(): void {
    this.getProductCategories();
  }


}
