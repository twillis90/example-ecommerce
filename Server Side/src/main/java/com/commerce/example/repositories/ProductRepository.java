package com.commerce.example.repositories;

import com.commerce.example.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    Optional<Product> findByProductName(String productName);
    Collection<Product> findByProductPrice(Double productPrice);
    Collection<Product> findByProductRating(int productRating);
    Collection<Product> findByProductIdentifiers_ProductIdentifier(String productIdentifier);
}
