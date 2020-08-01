package com.yosrra.ecommerce.controller;

import com.yosrra.ecommerce.entity.Product;
import com.yosrra.ecommerce.service.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class ProductController {

    private final ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping("products")
    ResponseEntity<List<Product>> getProductList() {
        return new ResponseEntity<>(productService.getProductList(), HttpStatus.OK);
    }
}
