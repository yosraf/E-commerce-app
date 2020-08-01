package com.yosrra.ecommerce.dao;

import com.yosrra.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@Repository
public interface CategoryRepository extends JpaRepository<ProductCategory, Long> {
}
