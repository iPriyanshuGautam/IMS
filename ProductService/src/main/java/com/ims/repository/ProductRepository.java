package com.ims.repository;



import com.ims.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    // Custom method to find a product by its ID with Optional
    Optional<Product> findById(Long id);
}
