package com.commerce.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class ProductIdentifier {

    @Id
    @GeneratedValue
    private Long id;
    private String productIdentifier;

    @ManyToMany
    protected Collection<Product> products;


    public ProductIdentifier(){

    }

    public ProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

    public Long getId() {
        return id;
    }

    public String getProductIdentifier() {
        return productIdentifier;
    }

    public Collection<Product> getProducts() {
        return products;
    }
}
