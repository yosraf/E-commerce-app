package com.yosrra.ecommerce.service;

import com.yosrra.ecommerce.dao.CategoryRepository;
import com.yosrra.ecommerce.entity.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements IProductCategoryService{

    private final CategoryRepository categoryRepository;

    public ProductCategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<ProductCategory> getProductCategories() {
        return this.categoryRepository.findAll();
    }
}
