import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable, BehaviorSubject} from 'rxjs';
import {Product} from '../common/product';
import {ProductCategory} from '../common/product-category';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  baseUrl = 'http://localhost:8080/';
  public itemNumber = new BehaviorSubject(0);
  public itemPrice = new BehaviorSubject(0);

  constructor(private httpClient: HttpClient) {
  }

  getProductList(categoryId: number): Observable<Product[]> {
    return this.httpClient.get<any>(this.baseUrl + 'products/search/' + categoryId);

  }

  getProductCategories(): Observable<ProductCategory[]> {
    return this.httpClient.get<any>(this.baseUrl + 'categories');

  }

  searchProduct(keyWord: string): Observable<Product[]> {
    return this.httpClient.get<any>(this.baseUrl + `products/search?name=${keyWord}`);
  }

  addProductToCart(number, price){
    this.itemNumber.next(number);
    this.itemPrice.next(price);

  }
}

