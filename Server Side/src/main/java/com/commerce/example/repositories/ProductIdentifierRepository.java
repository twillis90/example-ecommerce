package com.commerce.example.repositories;

import com.commerce.example.models.ProductIdentifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductIdentifierRepository extends CrudRepository<ProductIdentifier, Long> {
    Optional<ProductIdentifier> findByProductIdentifier(String productIdentifier);
}
