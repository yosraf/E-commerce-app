import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Product} from '../common/product';
import {ProductCategory} from '../common/product-category';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  baseUrl = 'http://localhost:8080/';

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
}

