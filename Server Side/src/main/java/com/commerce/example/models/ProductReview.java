package com.commerce.example.models;

import javax.persistence.*;

@Entity
public class ProductReview {

    @Id
    @GeneratedValue
    private Long id;
    @Lob
    private String productReview;

    @ManyToOne
    protected Product product;

    public ProductReview(){

    }

    public ProductReview(String productReview) {
        this.productReview = productReview;
    }

    public Long getId() {
        return id;
    }

    public String getProductReview() {
        return productReview;
    }

    public Product getProduct() {
        return product;
    }
}

