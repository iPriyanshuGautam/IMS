package com.ims.service;

import java.util.List;
import java.util.Optional;

import com.ims.entity.Product;

public interface ProductService {

	Product addProduct(Product product);

	Product updateProduct(Long id, Product product);

	void deleteProduct(Long id);

	List<Product> getAllProducts();

	Optional<Product> getProductById(Long id);

}
