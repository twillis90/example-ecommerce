package com.commerce.example.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String productName;
    @Lob
    private String productDescription;
    private Double productPrice;
    private int productRating;

//    @OneToMany
//    protected ProductReview productReview;

    @ManyToMany
    protected Collection<ProductIdentifier> productIdentifiers;

    public Product(){

    }

    public Product(String productName, String productDescription, Double productPrice, int productRating, ProductIdentifier...productIdentifiers) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productRating = productRating;
//        this.productReview = productReview;
        this.productIdentifiers = new ArrayList<>(Arrays.asList(productIdentifiers));
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public int getProductRating() {
        return productRating;
    }

//    public ProductReview getProductReview() {
//        return productReview;
//    }


    public Collection<ProductIdentifier> getProductIdentifiers() {
        return productIdentifiers;
    }
}
