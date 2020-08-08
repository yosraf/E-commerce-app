package com.yosrra.ecommerce.controller;

import com.yosrra.ecommerce.entity.Product;
import com.yosrra.ecommerce.service.ProductServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
public class ProductController {

    private final ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping("products")
    public ResponseEntity<List<Product>> getProductList() {
        return new ResponseEntity<>(productService.getProductList(), HttpStatus.OK);
    }

    @PostMapping("products")
    public ResponseEntity<Product> createProductList(@RequestBody Product product) {
        return new ResponseEntity<>(productService.createProductList(product), HttpStatus.CREATED);
    }
    @GetMapping("products/search/{id}")
    public ResponseEntity<List<Product>> findByCategoryId(@PathVariable Long id, Pageable pageable) {
        return new ResponseEntity<>(productService.findByCategoryId(id, pageable), HttpStatus.OK);
    }

    @GetMapping("products/search")
    public ResponseEntity<List<Product>> findByName(@RequestParam String name, Pageable pageable) {
        return new ResponseEntity<>(productService.findByName(name, pageable), HttpStatus.OK);
    }
}
