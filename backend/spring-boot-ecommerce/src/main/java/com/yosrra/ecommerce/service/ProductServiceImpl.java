package com.yosrra.ecommerce.service;

import com.yosrra.ecommerce.dao.ProductRepository;
import com.yosrra.ecommerce.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProductList() {
        return this.productRepository.findAll();
    }
}
