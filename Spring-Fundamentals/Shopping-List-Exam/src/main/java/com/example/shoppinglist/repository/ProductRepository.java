package com.example.shoppinglist.repository;

import com.example.shoppinglist.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    boolean existsByName(String name);
}
