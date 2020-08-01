package com.yosrra.ecommerce.service;

import com.yosrra.ecommerce.dao.ProductRepository;
import com.yosrra.ecommerce.entity.Product;
import org.springframework.data.domain.Pageable;
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

    @Override
    public List<Product> findByCategoryId(Long id , Pageable pageable) {
        return this.productRepository.findByCategoryId(id, pageable);
    }
}
