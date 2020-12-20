import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {MatCardModule} from '@angular/material/card';

import {AppComponent} from './app.component';
import {ProductListComponent} from './component/product-list/product-list.component';
import {HttpClientModule} from '@angular/common/http';
import {ProductService} from './services/product.service';
import {RouterModule, Routes} from '@angular/router';
import {ProductCategoryMenuComponent} from './component/product-category-menu/product-category-menu.component';
import {SearchComponent} from './component/search/search.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

const routes: Routes = [
  {path: 'category/:id', component: ProductListComponent},
  {path: 'category', component: ProductListComponent},
  {path: 'products', component: ProductListComponent},
  {path: 'search/:keyword', component: ProductListComponent},
  {path: '', redirectTo: '/products', pathMatch: 'full'},
  {path: '**', redirectTo: '/products', pathMatch: 'full'}

];

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    ProductCategoryMenuComponent,
    SearchComponent  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatCardModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
