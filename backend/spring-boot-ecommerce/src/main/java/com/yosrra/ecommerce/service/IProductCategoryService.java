package com.yosrra.ecommerce.service;

import com.yosrra.ecommerce.entity.ProductCategory;

import java.util.List;

public interface IProductCategoryService {
    List<ProductCategory> getProductCategories();
    ProductCategory createProductCategory(ProductCategory productCategory);
}
