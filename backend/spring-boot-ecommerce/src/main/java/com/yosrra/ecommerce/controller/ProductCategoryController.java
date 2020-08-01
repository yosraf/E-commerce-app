package com.yosrra.ecommerce.controller;

import com.yosrra.ecommerce.entity.ProductCategory;
import com.yosrra.ecommerce.service.ProductCategoryServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductCategoryController {

    private final ProductCategoryServiceImpl productService;

    public ProductCategoryController(ProductCategoryServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping("categories")
    public ResponseEntity<List<ProductCategory>> getProductCategory() {
        return new ResponseEntity<>(this.productService.getProductCategories(), HttpStatus.OK);
    }
}
