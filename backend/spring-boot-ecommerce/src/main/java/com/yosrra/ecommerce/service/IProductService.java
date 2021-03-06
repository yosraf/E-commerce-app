package com.yosrra.ecommerce.service;

import com.yosrra.ecommerce.entity.Product;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {

    List<Product> getProductList();

    List<Product> findByCategoryId(Long id, Pageable pageable);

    List<Product> findByName(String name, Pageable pageable);

    Product createProductList(Product product);
}
